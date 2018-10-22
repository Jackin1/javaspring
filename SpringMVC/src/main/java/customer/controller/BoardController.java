package customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import customer.dao.BoardDao;
import customer.vo.BoardVO;

@Controller
public class BoardController {
	
	BoardDao boardDao;
	
	@Autowired
	public BoardController(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

/*	@RequestMapping(value="selectBoard.do")
	public ModelAndView selectCustomer() {
		ModelAndView mav=new ModelAndView("list", "list", boardDao.selectBoard());
		return mav;
	}
	*/
	@RequestMapping(value="/customerInsert.do",method=RequestMethod.POST)
	public ModelAndView boardInsert(@ModelAttribute BoardVO board) {
		if(boardDao.insertBoard(board)>0) {
			return new ModelAndView("result", "id", board.getBoard_id());
		}else {
			return new ModelAndView("result");
		}
	}
	/*
	@RequestMapping(value="/customerSearch.do", method=RequestMethod.POST)
	public ModelAndView customerSearch(@ModelAttribute CustomerVO customer) {
		return new ModelAndView("view", "customer", customerDao.searchCustomer(customer.getId()));
	}*/
	
}

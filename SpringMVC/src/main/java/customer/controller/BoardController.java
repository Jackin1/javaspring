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

	@RequestMapping(value="selectBoard.do")
	public ModelAndView selectBoard() {
		ModelAndView mav=new ModelAndView("/board/list", "list", boardDao.selectBoard());
		return mav;
	}

	@RequestMapping(value="insertBoard.do",method=RequestMethod.GET)
	public ModelAndView insertBoard(@ModelAttribute BoardVO board) {

		return new ModelAndView("board/insert");

	}
	
	@RequestMapping(value="insertBoardProc.do",method=RequestMethod.POST)
	public ModelAndView insertBoardProc(@ModelAttribute BoardVO board) {
		System.out.println(board.getUser_id()+", "+board.getUser_name()+", "+board.getSubject()+", "+board.getContents());
		if(boardDao.insertBoard(board)>0) {
			return selectBoard();
		}else {
			return new ModelAndView("board/insert", "board", "");
		}
	}
	/*
	@RequestMapping(value="/customerSearch.do", method=RequestMethod.POST)
	public ModelAndView customerSearch(@ModelAttribute CustomerVO customer) {
		return new ModelAndView("view", "customer", customerDao.searchCustomer(customer.getId()));
	}*/
	
}

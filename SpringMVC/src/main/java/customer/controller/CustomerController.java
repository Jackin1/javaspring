package customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import customer.dao.CustomerDao;
import customer.vo.CustomerVO;

@Controller
public class CustomerController {
	
	CustomerDao customerDao;
	
	@Autowired
	public CustomerController(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@RequestMapping(value="customerSelect.do")
	public ModelAndView customerSelect() {
		ModelAndView mav=new ModelAndView("list", "list", customerDao.selectCustomer());
		return mav;
	}
	
	@RequestMapping(value="/customerInsert.do",method=RequestMethod.POST)
	public ModelAndView customerInsert(@ModelAttribute CustomerVO customer) {
		if(customerDao.insertCustomer(customer)>0) {
			return new ModelAndView("result", "id", customer.getId());
		}else {
			return new ModelAndView("result");
		}
	}
	
	@RequestMapping(value="/customerSearch.do", method=RequestMethod.POST)
	public ModelAndView customerSearch(@ModelAttribute CustomerVO customer) {
		return new ModelAndView("view", "customer", customerDao.searchCustomer(customer.getId()));
	}
	
}

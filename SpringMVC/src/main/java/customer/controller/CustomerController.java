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

	@RequestMapping(value="selectCustomer.do")
	public ModelAndView selectCustomer() {
		ModelAndView mav=new ModelAndView("customer/list", "list", customerDao.selectCustomer());
		return mav;
	}
	
	@RequestMapping(value="insertCustomer.do",method=RequestMethod.POST)
	public ModelAndView customerInsert(@ModelAttribute CustomerVO customer) {
		if(customerDao.insertCustomer(customer)>0) {
			return new ModelAndView("customer/result", "id", customer.getId());
		}else {
			return new ModelAndView("customer/result");
		}
	}
	
	@RequestMapping(value="searchCustomer.do", method=RequestMethod.POST)
	public ModelAndView customerSearch(@ModelAttribute CustomerVO customer) {
		return new ModelAndView("customer/view", "customer", customerDao.searchCustomer(customer.getId()));
	}
	
}

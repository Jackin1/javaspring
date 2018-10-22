package customer.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import customer.vo.BoardVO;
import customer.vo.CustomerVO;

@Repository("customerDao")
public class BoardDao {
	@Autowired
	private SqlSessionFactory factory;
	
	public List<CustomerVO> selectCustomer() {
		return factory.openSession().selectList("customernamespace.selectCustomer");
	}
	public CustomerVO searchCustomer(String id) {
		return factory.openSession().selectOne("customernamespace.searchCustomerUsingId", id);
	}

	public int insertBoard(BoardVO board) {
		try {
		return factory.openSession().update("customernamespace.insertBoard", board);
		}catch(Exception e) {
			if(e instanceof PersistenceException) {
				return 0;
			}
		}
		return 0;
	}

}

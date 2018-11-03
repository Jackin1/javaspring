package customer.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import customer.vo.BoardVO;
import customer.vo.CustomerVO;

@Repository("boardDao")
public class BoardDao {
	@Autowired
	private SqlSessionFactory factory;
	
	public List<BoardVO> selectBoard() {
		return factory.openSession().selectList("boardnamespace.selectBoard");
	}
	public BoardVO searchCustomer(String id) {
		return factory.openSession().selectOne("boardnamespace.searchCustomerUsingId", id);
	}

	public int insertBoard(BoardVO board) {
		try {
		return factory.openSession().update("boardnamespace.insertBoard", board);
		}catch(Exception e) {
			if(e instanceof PersistenceException) {
				return 0;
			}
		}
		return 0;
	}

}

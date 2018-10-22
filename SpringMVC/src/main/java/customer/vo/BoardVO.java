package customer.vo;

import java.util.Date;

public class BoardVO {
	private int board_id;
	private String user_id;
	private String name;
	private String subject;
	private String contents;
	private int hits;
	private Date reg_date;
	
	public BoardVO() {
		super();
	}

	public BoardVO(int board_id, String user_id, String name, String subject, String contents, int hits,
			Date reg_date) {
		super();
		this.board_id = board_id;
		this.user_id = user_id;
		this.name = name;
		this.subject = subject;
		this.contents = contents;
		this.hits = hits;
		this.reg_date = reg_date;
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	
	
	
}

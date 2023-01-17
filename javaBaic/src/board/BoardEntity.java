package board;

import java.sql.Date;

// 데이터베이스 테이블로부터 추출해 온 Class는 **Entity라 명명함
public class BoardEntity {
	
	public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	// Entity class는
	// 멤버변수가 테이블의 필드명과 일치해야 함
	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private Date boardDate;
	private String boardWriter;
	
	@Override
	public String toString() {
		return "BoardEntity [boardNumber=" + boardNumber + ", boardTitle=" + boardTitle + ", boardContent="
				+ boardContent + ", boardDate=" + boardDate + ", boardWriter=" + boardWriter + "]";
	}
	
}



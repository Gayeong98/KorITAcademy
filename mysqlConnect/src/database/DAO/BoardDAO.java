package database.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnector;
import database.Entity.BoardEntity;
import dto.InsertBoardDTO;

// DAO : Data Access Object
// 데이터베이스에 접근해서 데이터 검색 및 삽입 등의 데이터베이스 작업을 담당하는 클래스
public class BoardDAO {
	
	// 데이터베이스의 Board 테이블에서 모든 레코드를 선택해서 반환하는 메서드
	// SQL : SELECT * FROM Board;
	// 예상되는 반환 결과가 0개 이상의 복수의 레코드
	public List<BoardEntity> find()  {
		List<BoardEntity> result = new ArrayList<BoardEntity>();
		
		final String SQL = "SELECT * FROM Board";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DatabaseConnector.createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SQL);
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String boardTitle = resultSet.getString(2);
				String boardContent = resultSet.getString(3);
				String boardDateTime = resultSet.getString(4);
				Integer boardLike = resultSet.getInt(5);
				Integer boardWriter = resultSet.getInt(6);
				
				BoardEntity entity = new BoardEntity(id, boardTitle, boardContent, boardDateTime, boardLike, boardDateTime);
				result.add(entity);
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				if(connection != null && !connection.isClosed())
					connection.close();
				if(statement != null && !statement.isClosed())
					statement.close();
				if(resultSet != null && !resultSet.isClosed())
					resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 데이터베이스에서 Board 테이블에 레코드를 삽입
	// SQL : INSERT INTO Board (boardTitle, boardContent, boardDateTime, boardWriter)
	//		 VALUES (?, ?, ?, ?);
	// 예상되는 반환 값 : 0 or 1 
	public int insert(InsertBoardDTO dto) {
		int result = 0;
		
		final String SQL = "INSERT INTO Board (boardTitle, boardContent, boardDateTime, boardWriter) VALUES (?, ?, ?, ?)";
		
		try {
			
		} catch (Exception e) {
			
		} finally {
			
		}
		
		return result;
	}
	
}

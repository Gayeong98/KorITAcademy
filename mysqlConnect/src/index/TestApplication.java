package index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.DatabaseConnector;

public class TestApplication {
		
//	Connection connection = null;
//	
//	try {
//		// 1. MySQL connector Driver 로드
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		// 2. MySQL Driver로 Connection 객체 생성
//		// 데이터베이스 URL, 데이터베이스 사용자 이름(ID), 데이터베이스 사용자 패스워드
//		final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/peed";
//		final String USER_NAME = "root";
//		final String USER_PASSWORD = "root";
//		
//		connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
//		
//		System.out.println("Database Connect Success!");
//		
//		// Connection 객체를 이용해서 Statement 객체 생성
//		Statement statement = connection.createStatement();
//		// Statement 객체에 사용할 SQL문 작성
//		final String SQL = "SELECT * FROM Board";
//		// SQL문을 Statement 객체에 담아서 실행
//		// 실행 결과를 ResultSet 객체로 저장
//		ResultSet resultSet = statement.executeQuery(SQL);
//		
//		while(resultSet.next()) {
//			Integer id = resultSet.getInt(1);
//			String boardTitle = resultSet.getString(2);
//			String boardContent = resultSet.getString(3);
//			
//			System.out.println("id: " + id + " / boardTitle: " + boardTitle + " / boardContent : " + boardContent);
//		}
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//		System.out.println("Database Connection Fail!");
//	} finally {
//		// 3. 사용한 Connection 객체 Close
//		try {
//			if (connection != null && connection.isClosed())
//				connection.close();
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//	}
		
}




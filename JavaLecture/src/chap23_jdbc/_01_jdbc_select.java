package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_jdbc_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String JDBC_DRIVER =
					"oracle.jdbc.driver.OracleDriver";
		final String DB_URL =
					"jdbc:oracle:thin:@localhost:1521:xe";
		
		final String USER = "c##study";
		final String PASSWORD = "!dkdlxl1234";
		
		//커넥션 변수 선언
		Connection conn = null;
		//쿼리 구문 변수 선언
		Statement statement = null;
		
		
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			statement = conn.createStatement();
			//학생번호, 학생이름, 학생별 평균 기말고사 성적
//			String sql = "SELECT SNO, SNAME, ROUND(AVG(RESULT) AS RESULT "
//					+ "FROM STUDENT NATURAL JOIN SCORE GROUP BY SNO, SNAME";
			
			String sql = "SELECT * FROM STUDENT WHERE SNO = 8003";
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				String sno = resultSet.getString("sno");
				String sname = resultSet.getString("sname");
//				String result = resultSet.getString("result");
				
				System.out.println("학번 : " + sno + ", 이름 : " + sname);
			}
			
			resultSet.close();
			statement.close();
			conn.close();
			
		}catch(SQLException se){
			System.out.println(se.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println(se.getMessage());
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println(se.getMessage());
				}
			}
		}
		
		
	}

}

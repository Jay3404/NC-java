package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _03_jdbc_update {

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
//		Statement statement = null;
		
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
//			statement = conn.createStatement();
			//학생번호, 학생이름, 학생별 평균 기말고사 성적
			String sql = "UPDATE STUDENT "
					+ " SET "
					+ "     AVR = ?"
					+ " WHERE SNO = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, 1.45);
			pstmt.setString(2, "8003");
			
			int result = pstmt.executeUpdate();
			
			if(result >= 1) System.out.println("수정되었습니다.");
			else System.out.println("수정에 실패하였습니다.");
//			ResultSet resultSet = statement.executeQuery(sql);
			
			
			pstmt.close();
			conn.close();
			
		}catch(SQLException se){
			System.out.println(se.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
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

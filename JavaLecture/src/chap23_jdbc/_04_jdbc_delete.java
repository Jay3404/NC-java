package chap23_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _04_jdbc_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오라클 드라이버 변수 선언 및 사용 클래스정의
		final String JDBC_DRIVER = 
							"oracle.jdbc.driver.OracleDriver";
		//접속할 데이터 베이스 url 지정
		final String DB_URL =
						"jdbc:oracle:thin:@localhost:1521:xe";
		
		//접속할 계정 정보
		final String USER = "c##study";
		final String PASSWORD = "!dkdlxl1234";
		
		//커넥션 변수 선언
		Connection conn = null;
		//쿼리 구문 변수 선언
		//Statement statement = null;
		
		//파라미터를 가지는 쿼리구문 변수 선언
		PreparedStatement pstmt = null;
		
		try {
			//jdbc 드라이버 클래스 로드
			Class.forName(JDBC_DRIVER);
			
			//데이터베이스 연결
			conn = DriverManager.getConnection(
									DB_URL, USER, PASSWORD);
			
			//SQL 쿼리 생성
			//statement = conn.createStatement();
			//update sql 쿼리문
			String sql = "DELETE FROM STUDENT WHERE SNO = ?";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//들어갈 파라미터들 세팅
			//파라미터 세팅은 물음표의 개수와 동일하게 설정
			pstmt.setString(1, "8003");
			
			//insert, delete, update는 결과로 영향받은 행의 개수를 리턴
			int result = pstmt.executeUpdate();
			
			if(result >= 1) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("저장에 실패하였습니다.");
			}
			
			//다 쓴 객체들 해제
			pstmt.close();
			conn.close();
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//정상종료되든 에러가 발생하든 객체들 제거
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

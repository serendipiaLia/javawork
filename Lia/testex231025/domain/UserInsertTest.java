package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

	public static void main(String[] args) {
		// 1. 네트워크 연결 클래스 생성 (SQL과 연결할)
		Connection conn = null;
		// 2. SQL 처리 인터페이스 (SQL의 명령문을 실행할 수 있도록,,)
		PreparedStatement pstmt = null; 
		
		//3. JDBC 드라이버 등록 : Class.forName("oracle.jdbc.OracleDriver"); -> try, catch
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
		//4. oracle과 연결하기 - getConnection(url, user, password)	
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##lia",
					"pw990618");
			
			System.out.println("연결 성공 !");
			
		//5. DB처리 작업 - 매개변수화된 sql문 작성! 
			String sql = "INSERT INTO users "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
		//6. ?에 값 지정! (userid, username, userpassword, userage, useremail)
			pstmt.setString(1, "yeeun");
			pstmt.setString(2, "임예은");
			pstmt.setString(3, "991215");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "rim@gmail.com");
			
		//7. sql에 위 내용을 업데이트 시, 저장된 행의 수rows를 알기 위한 메서드 executeUpdate();
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수 : " + rows);	
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		//8. finally 연결 끊음
		}finally {
			if(conn != null) { //연결이 됐으면,
				try {
					conn.close();
					System.out.println("연결 종료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

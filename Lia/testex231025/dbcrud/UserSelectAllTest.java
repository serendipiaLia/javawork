package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserSelectAllTest {
	public static void main(String[] args) {
		
		// 1. sql 연결 클래스 생성
		Connection conn = null;
		// 2. sql문 실행할 수 있도록 인터페이스 생성
		PreparedStatement pstmt = null;
		//3. 드라이버 등록 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		//4. 오라클 연결 (url, name, pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
					"c##lia",
					"pw990618");
			System.out.println("연결 성공");
		
		//5.DB 조회할 sql문 작성
			String sql = "SELECT*FROM users ";
			pstmt = conn.prepareStatement(sql);
			
		//6. sql에 실행하는 메서드 
			ResultSet rs = pstmt.executeQuery(); // rs에 값을 집어 넣는다
			List<User> userList = new ArrayList<>(); // User클래스의 setter,getter를 사용하겠음
			
		//7. 데이터가 하나가 아니라 반복적으로 쌓이므로 while문
			while (rs.next()) {
				User user = new User();
				
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
		
		//8. get,set으로 입출력한 데이터를 userList배열에 user객체 저장 (add)
				userList.add(user);
			}
		//9. 향상 for문으로	 userList 내용 출력
			for(User user : userList) { 
				System.out.println("userId : " + user.getUserId());
				System.out.println("userName : " + user.getUserName());
				System.out.println("userPassword : " + user.getUserPassword());
				System.out.println("userAge : " + user.getUserAge());
				System.out.println("userEmail : " + user.getUserEmail());
				System.out.println("=========================================");
			}
		//10. close 하기
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		//11. finally 연결 종료!
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결종료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
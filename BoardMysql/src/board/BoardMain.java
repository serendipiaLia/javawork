package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardMain {

	private Scanner scanner = new Scanner(System.in); 
	private Connection conn;
	private PreparedStatement pstmt;
	
	//db 연결 관련 변수 - 대,소문자 모두 구분
	private String driverClass = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/mydb?serverTime=Asia/Seoul";
	private String user = "myuser";
	private String password = "pwmyuser";
	
	// 생성자
	public BoardMain() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
	//		System.out.println("DB 연결 성공! > " + conn);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	/*============================== list ==========================================*/
	
	public void list() {
		System.out.println();
		System.out.println("[List of posts]");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-4s%-12s%-30s%-30s \n", "no.", "writer", "date", "title");
		System.out.println("----------------------------------------------------------------");
		
		//DB - SQL board TABLE 게시글 목록 모두 가져오기
		try {
			String sql = "SELECT * FROM board ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // 게시글이 있는 동안 반복(다음 행으로 이동)
				Board board = new Board(); // 기본생성자이므로 setter로 부르기
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBtitle(rs.getString("btitle"));
				
				// 게시글 출력 (출력문과 순서 같이 맞춰주기)
				System.out.printf("%-4s%-12s%-30s%-30s \n" ,  
					board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
				
			} //while
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu(); // mainMenu()메서드 호출
	} // list()
	
	/*============================== mainMenu ==========================================*/
	
	public void mainMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("| 1. Create | 2. Read | 3. Clear | 4. Exit |");
		System.out.println("--------------------------------------------");
		System.out.print("선택 ▶ ");
		
		String menuNo = scanner.nextLine(); // 대기상태
		
		switch(menuNo) {
		case "1" :
			create(); break;
		case "2" :
			read(); break;
		case "3" :
			clear(); break;
		case "4" :
			exit(); break;
		
			
		} // switch
	} // main
	
	/*=============================== Create ==========================================*/
	
	public void create() { // INSERT 개념
	//	System.out.println("▶ Method : create()실행");
		Board board = new Board();
		System.out.println("\n[Create new post]");
		
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.print("작성할 내용 : ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자 : ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		//db 작업 - INSERT INTO
		try {
			String sql = "INSERT INTO board(btitle, bcontent, bwriter) " 
					+ "VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle()); // 콘솔에서 입력한 제목을 db에 저장
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());

			// sql 실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit(); //종료 메서드 호출
		}
		// 목록 메서드 호출
		list();
	} //create
	
	/*================= Read, 작성된 게시물 읽기 (+ UPDATE, DELETE)==========================*/

	public void read() {
		//	System.out.println("▶ Method : read()실행");
		System.out.println("\n[Read, post]");
		System.out.print("글 번호 입력 : ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		//db 작업 - SELECT ~ WHERE 절
		try {
			String sql = "SELECT * FROM board WHERE bno = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			// query 실행
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { // 찾은 자료가 있으면,,
				Board board = new Board(); 
				// db의 값을 가져와서 board에 세팅
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				// 콘솔에 출력
				System.out.println("\nooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("글 번호 : " + board.getBno());
				System.out.println("제목 : " + board.getBtitle());
				System.out.println("내용 : " + board.getBcontent());
				System.out.println("작성자 : " + board.getBwriter());
				System.out.println("작성일 : " + board.getBdate());
				System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooo\n");
			
				// 수정, 삭제 메뉴 만들기
				System.out.println("| 1. 글 수정(update) | 2. 글 삭제(delete) | 3. menu로 돌아가기 |");
				System.out.print("선택 ▶ ");
				String menuNo = scanner.nextLine();
				
				if(menuNo.equals("1")) {
					update(board); // 위에 쿼리의 board
				}else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			list(); // 글 목록 메서드 호출
		} // read
		
	/* -------------------- UPDATE (1. 글 수정) ----------------------  */
		
		// 이미 작성된 글 가져와서 수정
		public void update(Board board) { // update는 insert개념으로 접근
			System.out.println("\n[수정 할 내용 입력]");
			
			System.out.print("제목 : ");
			String title = scanner.nextLine();
			board.setBtitle(title);
			
			System.out.print("작성할 내용 : ");
			String content = scanner.nextLine();
			board.setBcontent(content);
			
			System.out.print("작성자 : ");
			String writer = scanner.nextLine();
			board.setBwriter(writer);
			
			// db 작업 - UPDATE 
			try {
				String sql = "UPDATE board SET btitle = ?, bcontent = ?, bwriter = ? "
						+ "WHERE bno = ? ";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1,board.getBtitle()); // 콘솔에서 수정한 제목을 db에 저장
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter()); 
				pstmt.setInt(4, board.getBno());
				
				//sql 실행
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		} // update
		
		/* -------------------- DELETE (2. 글 삭제) ----------------------  */
		
		public void delete(Board board) {
			// 확인, 취소 메뉴 
			System.out.println("\n※주의※ 선택한 게시글을 삭제 하시겠습니까?");
			System.out.println("| 1.  OK | 2. Cancel |");
			System.out.print("선택 ▶ ");
			
			String menuNo = scanner.nextLine();
			if(menuNo.equals("1")) {
				// db작업 - DELETE
				try {
					String sql = "DELETE FROM board WHERE bno = ? ";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, board.getBno());
					
					//sql 실행
					pstmt.executeUpdate();
					pstmt.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
					exit();
				}
			}
		}
		
	
	/*========================= Clear, 게시물 데이터 모두 지우기 ============================*/
	
	// 테이블 유지, 작성된 게시물 데이터 모두 지우기 (DROP 사용x, TRUNC 사용)
	public void clear() {
	//	System.out.println("▶ Method : clear()실행");
		System.out.println("\n[전체 게시글 삭제]");
		System.out.println("==============================");
		// 확인, 취소 메뉴 
		System.out.println("※주의※ 모든 게시글을 삭제 하시겠습니까 ?");
		System.out.println("| 1.  OK | 2. Cancel |");
		System.out.print("선택 ▶ ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			
			// db작업 - TRUNCATE TABLE ~ ;
			try {
				String sql = "TRUNCATE TABLE board";
				pstmt = conn.prepareStatement(sql);
				
				//sql 실행
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	} // clear
	
	/*=========================== Exit, 게시판 종료 ==============================*/
	
	public void exit() { // 호출되면 db 네트워크 연결 종료
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*** 게시판 종료 :D ***");
		System.exit(0); // 즉시종료
	} // exit
	
	public static void main(String[] args) {
		BoardMain board1 = new BoardMain();
		board1.list();
	}
} // c

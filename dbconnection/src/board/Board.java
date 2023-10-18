package board;

import java.io.Serializable;
import java.util.Date;

// dto : 자료 전달 객체 (VO)
public class Board implements Serializable{
	
	private static final long serialVerionUID = 1L;
	
	//필드
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate; // java.util에서 가져오기
	
	// 매개변수 없는 생성자 (기본생성자)
	public Board() {}
	
	
	//메서드
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public static long getSerialverionuid() {
		return serialVerionUID;
	}
}

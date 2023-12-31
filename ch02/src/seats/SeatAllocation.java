package seats;

import java.util.Scanner;

public class SeatAllocation {

	public static void main(String[] args) {
		// 자리 배치도
		// 변수 - customer(고객) , column(열), row(줄)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입장객 수 : ");
		int customer = scan.nextInt();
		
		System.out.print("좌석 열 수 : ");
		int column = scan.nextInt();
		
		int row; // 줄 수를 알고싶을 때 선언
		
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = customer / column + 1;
		}
		
		//중첩 for문 사용
		for(int i = 0; i < row; i++) {
			for(int j = 1; j <= column; j++) { //열의 개수 : column
				int seatNum = column * i + j;
				if(seatNum > customer)
					break;
				System.out.print("좌석" + seatNum + " ");
			}
			System.out.println();
		}
		scan.close();
	
	}	//m
}

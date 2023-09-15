package algorithm;

public class RankTest {
	public static void main(String[] args) {
		//순위정하기 
		// rank를 모두 1로 초기화 함
		// rank를 3, 1, 4, 5, 2
		int [] score = {70, 90, 60, 50, 80};
		int [] rank = new int[5];	//0, 0, 0, 0, 0
		
		//중첩 for(행, 열)
		for(int i=0; i<score.length; i++) {
			int count = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j]) {
					count++;
				}
			}
			rank[i] = count; //순위에 따른 저장
		}
		/*	디버깅_ score[j]로 한 이유
		 i=0	70<70 F, 70<90 T, 70<60 F, 70<50 F, 70<80 T		count = 3
		 i=1	90<70 F, 90<90 F, 90<60 F, 90<50 F, 90<80 F 	count = 1
		 i=2 ... 
		  
		  rank[0] = 3
		  rank[1] = 1
		 */
		
		//순위 출력
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		
	}

}

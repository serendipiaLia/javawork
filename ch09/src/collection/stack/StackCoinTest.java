package collection.stack;

import java.util.Stack;

public class StackCoinTest {
	
	public static void main(String[] args) {
		// Stack 자료 구조의 객체 생성
		Stack<Coin> coinBox = new Stack<>();
	
		// Coin 객체 생성
		Coin coin500 = new Coin(500); //500원
		Coin coin100 = new Coin(100); 
		Coin coin50 = new Coin(50); 
		Coin coin10 = new Coin(10); 
		
		// coinBox에 동전 넣기(저장) -> 500 > 100 > 50 > 10 순
		coinBox.push(coin500); //0번인덱스
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);

		// 동전 하나 꺼내기(스택특징 -> 후입선출) : 맨 위의 10원이 꺼내짐
		int coin1 = coinBox.pop().getMoney();
		System.out.println(coin1); 
		
		//전체 객체 출력(동전 전체 꺼내기) - 밖으로 나오면서 비워짐(삭제)
		while(!coinBox.isEmpty()) { //코인박스가 비어있지 않으면,
			 Coin coin = coinBox.pop(); // 코인 객체 1개 꺼냄
			 System.out.println(coin.getMoney()); //동전이 있는동안 계속 반복(=while)
			 // 10 > 50 > 100 > 500 순으로 꺼내짐! 후입선출!**
		}
	} //m
}

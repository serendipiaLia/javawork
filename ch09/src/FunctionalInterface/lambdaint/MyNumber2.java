package FunctionalInterface.lambdaint;

// @ : annotation -> 코드명확하게 표현, 개발자와 도구간의 커뮤니케이션 강화,
// 					 코드 자동화 및 향상된 문서화 제공에 도움
@FunctionalInterface
public interface MyNumber2 {
	
	//두 수의 크기비교 
	int getMax (int n1, int n2);
		//int getMin (int n1, int n2); ->최소값비교
}

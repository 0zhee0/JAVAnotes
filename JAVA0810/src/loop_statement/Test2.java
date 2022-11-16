package loop_statement;

public class Test2 {

	public static void main(String[] args) {
		// 정수 1 ~ 100 까지의 합을 누적변수 total 에 누적 후 출력
		// 누적변수 선언 및 초기화		
		int total = 0;
		
		// for 문
		for (int i=1; i <= 100; i++) {
			total += i;
//			System.out.println("i = " + i + ", total = " + total);
		}		
		// 누적변수 출력
		System.out.println("1 ~ 100까지의 합 : " + total);		
		
//		System.out.println("==================================");
		
//		// 1 ~ 10 까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
//		// 누적 변수 선언 및 초기화
//		int total = 0;
//		// for문 생성
//				
//		for(int i = 1; i <= 10; i++) {
//			// 짝수일 경우에만 누적변수에 현재 값을 누적
//			// 짝수를 판별
//			if(i%2==0) {
//				 total += i;
//				 System.out.println("i = " + i + ", total = " + total);
//			} else { // 짝수가 아닐 때=홀수일 때 
//				System.out.println( i + " : 홀수이므로 누적하지 않는다.");			
//			}			
//		}		
//		// 1 ~ 10 까지 정수 중 짝수의 합 출력
//		System.out.println("1 ~ 10 까지 정수 중 짝수의 합 : " + total);
//				
//		System.out.println("==================================");
//		
//		// 1 ~ 10까지 정수 중 홀수의 합 계산 후 출력
//		int sum = 0;
//		
//		for(int s = 1; s <= 10; s++) { // 1 ~ 10까지 1씩 증가하면서 반복
//			// 홀수일 경우에만 누적변수에 현재 값 i를 누적
//			if(s%2==1) { // 홀수판별
//				// 홀수일 때 누적 수행
//				sum += s;
//				System.out.println("s = " + s + ", sum = " + sum);		
//			} else { // 홀수가 아닐 때=짝수일 때
//				System.out.println( s + " : 짝수이므로 누적하지 않는다.");
//			}
//		}
//		System.out.println("1 ~ 10 까지 정수 중 홀수의 합 : " + sum);
//		
//		
//		
		
	}

}



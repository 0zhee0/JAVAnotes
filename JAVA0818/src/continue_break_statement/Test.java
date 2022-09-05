package continue_break_statement;

public class Test {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100 까지 정수의 합을 계산(total 변수에 저장)
		 * => 단, 합계가 1000 보다 클 경우 반복문 종료하고 빠져나간 뒤
		 * 	  1000보다 커지는 시점의 정수(x)를 출력
		 * 
		 */
		
		int i;
		int total = 0;
		
		for(i=1; i<101; i++) {
			
			total += i;
			if(total > 1000) {
				break; // 합계(total)가 1000보다 클 경우 for문 종료
			}
		}
		System.out.println("1 ~ " + i + "까지 정수의 합 = " + total);
		System.out.println("합계가 1000보다 클 때 정수 i = " + i);
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * 1 + (-2) + 3 + (-4) + ...생략... 형식으로 계속 더할 때
		 * 총합이 100 이상이 되는 x 값 출력(break문 출력)
		 * <힌트> 정수가 짝수일 때는 음수 형태로 변환하여 합계 누적
		 */
		
//		int x = 1; // 초기식
//		total = 0;
//		
//		while(true) { // 조건식이 true이면 무한반복
//			
//			if(x%2==0) { // 짝수일 때
//				System.out.println(-x);
//				total += -x; // 음수값으로 변환하여 누적
//			} else { // 홀수일 때
//				System.out.println(x);
//				total += x; // 양수값 그대로 누적
//			}
//			
//			if(total >= 100) { // 총합이 100이상이면 반복문 종료
//				break;
//			}
//			
//			x++; // 증감식
//		}
//		System.out.println("총합이 100 이상이 되는 x 값 = " + x);

		total = 0;
		int x = 0;
		
		while(total < 100) { // 합계가 100보다 작을 동안 반복 = (100이상이 되면 종료)
			x++;
			
			if(x%2==0) { // 짝수일 때
				System.out.println(-x);
				total += -x; // 음수값으로 변환하여 누적
			} else { // 홀수일 때
				System.out.println(x);
				total += x; // 양수값 그대로 누적
			}
		}
		System.out.println("x = " + x);
		System.out.println("total = " + total);	
		
		
		
		
		
	}

}

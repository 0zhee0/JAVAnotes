package loop_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * - 중첩 for문과 마찬가지로 while문 내부에 또 다른 while문을 기술
		 * 
		 * < 기본 문법 >
		 * 초기식1;
		 * 
		 * while(조건식1) {
		 * 		초기식3;
		 * 
		 * 		while(조건식2) {
		 * 			// 반복할 문장...
		 * 			증감식2;
		 * 		}
		 * 
		 * 	 	증가식1;
		 * }
		 */
		
		// for문을 사용하여 i값이 1 ~ 5까지 반복할 동안
		// i 값이 1 ~ 3 까지 반복하는 중첩 for문
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		// 위의 결과값을 중첩while문을 이용해서 사용/ for문이랑 섞어서 사용 가능	
		int i = 1; // 초기식1
		while(i<=5) {
			
			int j = 1; // 초기식2
			while(j<=3) { // 조건식2
				System.out.println("i = " + i + ", j = " + j);
				j++; //증감식2
			}
			i++; //증감식1
		}

	}

}

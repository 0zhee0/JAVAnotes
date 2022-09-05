package loop_statement;

public class Test {

	public static void main(String[] args) {
		// 바깥쪽 for문 i값이 1 ~ 10까지 반복할 동안
		// 안쪽 for문 j값을 1 ~ 5까지 반복하면서 i와 j값을 출력
		
		for(int i=1; i <= 10; i++) {
			System.out.println("i = " + i);
			
			for(int j=1; j <= 5; j++) {
				System.out.println("---------> j = " + j);				
			}			
		}
		
		System.out.println("======================================");
		
		/*
		 * 타이머(XX분 XX초)
		 * - 시(hour) : 0 ~ 23시
		 * - 분(minute) : 0 ~ 59분
		 * - 초(sec) : 0 ~ 59초
		 * 
		 * <출력 예시>
		 *  0분 0초
		 *  0분 1초
		 *  0분 2초
		 *  ... 생략 ...
		 *  0분 59초
		 *  1분 0초
		 *  1분 1초
		 *  ... 생략 ...
		 *  59분 58초
		 *  59분 59초 
		 */
		
		for(int m=0; m<60; m++) {
			
			for(int s=0; s<60; s++) {
				System.out.println( m +"분 "+ s +"초");	
			}
		}
		
		System.out.println("=============================");
		
		/*
		 * 중첩 for문을 활용한 구구단 전체 출력(2단 ~ 9단)
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...생략...
		 * 
		 * < 3단 >
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * ...생략...
		 * 
		 * < 9단 >
		 * 9 * 1 = 9
		 * 9 * 2 = 18
		 * ...생략...
		 * 9 * 1 = 9
		 * 
		 * => 단(dan)이 2 ~ 9까지 1씩 증가(바깥쪽 for문)
		 * 	  이 때, 각 단마다 i값이 1 ~ 9까지 1씩 증가(안쪽 for문)
		 */
		
		// 특정 단의 구구단을 출력
		
		
//		for( int dan = 2; dan < 10; dan++) {
//		System.out.println("< " + dan + "단 >");
//		
//		for(int n = 1; n <= 9; n++) {﻿
//			System.out.println(dan + " * " + n + " = " + (dan*n));﻿
//		} 		
//		}
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(); // 줄바꿈
			System.out.println("< " + dan + "단 >");
			
			for(int n = 1; n <= 9; n++) {
				// System.out.println(dan + " * " + n + " = " + (dan*n));
				System.out.printf("%d * %d = %d\n",dan, n, dan*n);
			}
			// System.out.println(); // 여기에 줄바꿈 해도 상관없음
		}
		
		System.out.println("=============================");
		
		/*
		 * 주사위 2개를 굴려서 주사위 눈의 합이 6일 때 두 주사위 값을 출력
		 * ex) 주사위1	주사위2		합계
		 * 		 1	   +   5	 =    6
		 * 		 2	   +   4	 =    6
		 * 		 3	   +   3	 =    6
		 * 		 4	   +   2	 =    6
		 * 		 5	   +   1	 =    6
		 * 
		 * 주사위 눈 : 1 ~ 6
		 * 주사위(dice1, dice2) 변수 값을 1 ~ 6가지 1씩 증가하면서 반복하여
		 * 주사위 눈의 합계가 6인지 판별하여 6일 때 주사위 눈의 값 출력
		 * => 판별을 해야 하므로 if문이 같이 사용됨!
		 * 
		 */
		
		
		for(int d1=1; d1 < 7; d1++) {
			for(int d2=1; d2 < 7; d2++) {
				
				if( d1 + d2 == 6) { // 주사위 눈의 합이 6인지 판별
					// 두 주사위 눈의 합이 6일 때만 출력 실행
					int sum = d1 + d2;
					System.out.println(d1 + " + " + d2 + " = " + sum);
				}
			}			
		}
		
		System.out.println("=============================");
		
		// 방정식 4x + 5y = 60 의 해를 구해서 출력하기
		// 단, x 와 y 는 0 <= x, y <= 10
		// 출력예시 x = , y = 일 때 4x + 5y = 60
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				
				 // int e = (4*x)+(5*y); 여기서 변수 선언 해도 됨
				
				if((4*x)+(5*y) == 60) {
					int e = (4*x)+(5*y);
					// System.out.println("4 * " + x + " + " + "5 * " + y + " = " + e);
					System.out.printf("x = %d, y = %d 일 때 4x + 5y = %d\n", x, y, e);
				}
			}
		}
		
		
		
	}

}

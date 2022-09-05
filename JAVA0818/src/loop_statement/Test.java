package loop_statement;

public class Test {

	public static void main(String[] args) {
		// while 문을 사용하여 구구단 2단 출력		
		int dan = 2;
		System.out.println("< " + dan + "단 >");
		
		int i = 1;
		while(i < 10) {
		System.out.println(dan + " x " + i + " = " + (dan*i));
			i++;
		}
		
		System.out.println();
		
		System.out.println("< " + dan + "단 >");
		for(dan = 2; dan < 10; dan ++) {
			int j = 1;
			while(j < 10) {
			System.out.println(dan + " x " + j + " = " + (dan*j));
				j++;
			}
		}
				
		System.out.println("==============================");
		
		// while 문을 사용하여 정수 1 ~ 10까지의 합(total)을 계산 후 출력
		int sum = 0; // 누적 변수 sum 선언 및 초기화
		i = 1; // 초기식
		
		while(i < 11) { 
			sum += i;
			i++;
		}
		System.out.println("정수 1 ~ 10까지의 합 : " + sum);
		
			
	}

}

package variable;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 변수 vs 상수
		 * - 변수(Variable) : 데이터를 저장하는 메모리 공간 
		 * - 상수(Constant) : 항상 같은 값을 갖는 즉, 변하지 않는 데이터
		 *	 ex) 정수 5, 실수 3.14, 문자 'A', 문자열 "Hello World" 등
		 * 	 => 자바에서는 사용하는 실제 데이터를 리터럴(Literal)이라고 함
		 * 
		 * 자바에서 사용하는 데이터 종류
		 * 1. 수치 데이터 - 정수형, 실수형, 문자형
		 * 2. 논리 데이터 - 참과 거짓
		 * 3. 문자열 데이터 - 구 또는 문장
		 * 
		 */	
		System.out.println(1); // 정수형 리터럴
		System.out.println(3.14); // 실수형 리터럴
		System.out.println('A'); // 문자형 리터럴 => 작은 따옴표 '꼭' 붙이기 
		System.out.println(true); // 논리형 리터럴
		System.out.println(false); // 논리형 리터럴
		
		System.out.println(5L); // 정수형(long형) 리터럴 => 접미사 L 붙임 ( 조 단위 넘어갈 때)
		System.out.println(1.5f); // 실수형(float형) 리터럴 => 접미사 F(F) 붙임
		
		System.out.println("Hello, World!"); // 문자열형(String) 리터럴 => 큰 따옴표 "꼭" 붙이기 	
	}

}

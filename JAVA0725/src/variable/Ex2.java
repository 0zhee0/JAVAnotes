package variable;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable)
		 * - 데이터를 저장하는 메모리 공간
		 * - 변수 공간에는 한 번에 하나의 데이터만 저장 가능하며, 
		 *   새로운 데이터를 저장하면 기존의 데이터는 제거됨
		 * - 변수를 사용하기 위해서는 반드시 변수를 선언한 후에 저장 가능
		 * - 데이터를 저장하는 작업을 변수의 초기화라고 함
		 * 	 => 변수 초기화 작업 없이 변수 사용 불가능!
		 * - 변수명을 작성할 때는 식별자 작성 규칙을 따름
		 * 
		 * < 변수 선언 기본 문법 >
		 * 데이터타입 변수명; 
		 * 
		 * < 변수 초기화 기본 문법 > 
		 * 변수명  = 데이터; //
		 *  = : 왼쪽의 데이터를 오른쪽의 변수에 대입한다는 의미이다. 같다는 의미X 
		 * 같다 : ==
		 * 
		 * < 변수 사용법 >
		 * 변수 사용을 위해서는 특정 작업에 변수명을 지정하면 해당 변수에 저장된 값을 사용할 수 있다!
		 * 
		 */

		// 변수 선언
		int a; // int형 데이터를 저장할 공간을 생성하고, 이름을 a로 지정
		
		// 변수 초기화(반드시 변수 선언 후에 초기화 가능)
		a = 10; // int형 변수 a에 정수형 데이터(리터럴==값) 10 저장(대입) == 초기화
		// => 주의! 변수 선언 없이 초기화 또는 접근 시 오류 발생함!
		// (a cannot be resolved to a variable)
		
		// 변수에 접근하여 값을 출력하기(반드시 초기화 후에 사용 가능)
		// => 초기화를 수행하지 않으면 변수 값에 접근 불가
		//	  (The local variable a may not have been initialized)
		System.out.println(a); // 정수 10이 출력됨
		
		
		// 변수에 새로운 값(데이터)를 저장하면, 기존의 값(데이터)은 제거됨
		a=99; // 기존에 저장된 정수 10을 버리고, 새로운 정수 99로 교체가 된다.
		System.out.println(a); // 교체된 정수 99 출력됨
	}

}

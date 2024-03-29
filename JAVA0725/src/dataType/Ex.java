package dataType;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 데이터타입(Data Type) = 자료형
		 * - 사용할 데이터의 종류를 구분해 놓은 것
		 * - 기본 데이터타입(Primitive Type = 기본형)
		 * 	 참조 데이터타입(Reference Type = 참조형)
		 * 1. 기본 데이터타입 8가지
		 * --------------------------------------------------------------------------------------
		 * 			1Byte(﻿8bit)	2Byte(﻿16bit) 4Byte(32bit)	8Byte(64bit)
		 * --------------------------------------------------------------------------------------
		 * 논리형	boolean
		 * 정수형	byte		short		 int			long
		 * 실수형							 float			double
		 * 문자형				char
		 * -------------------------------------------------------------------------------------- 
		 * 
		 * < 정수형 데이터타입 표현 범위>
		 *  - 메모리 크기에 따라 표현 가능한 정수의 범위가 달라짐
		 *  - byte(﻿1Byte = 8 bit) : 2^8 = 256가지 = -128 ~ +127 표현가능
		 *  - short(﻿2Byte = 16 bit) : 2^16 = 65536가지 = -32768 ~ +32767 표현가능
		 *  - int(4Byte = 32 bit) : 2^32 = 42억여개 = 약 -21억 ~ +21억 => 정수의 기본형
		 *  - long(8Byte = 64 bit) : 2^64 = 약 -922경 ~ +922경
		 *  
		 *  < 변수 선언 및 초기화를 동시에 수행하는 문법 > 
		 *  데이터타입 변수명 = 데이터;
		 */

		// byte 타입 변수 b 선언(데이터타입 변수명)
//		byte b;
		// byte 타입 변수 b 에 정수 100 저장(변수명 = 데이터)
//		b = 100;
		
		// 위의 두 문장(선언 및 초기화)을 한 문장으로 결합
		byte b = 100;
		
		// byte 타입 변수 b의 값을 화면에 출력
//		System.out.println(b); // 변수 b에 저장된 정수 100이 출력됨
		
		b = 127;
//		b = 128; //오류 발생! byte 타입에 저장 가능한 정수 : -128 ~ +127까지
		b = -128;
//		System.out.println(b);
		
		// short 타입 변수 s 를 선언하고 정수 128 저장
		short s = 128;
//		System.out.println(s);
		
		s = 32767;
//		s = 32768; //오류 발생! short 타입에 저장 가능한 정수 : -32768 ~ +32767까지
		
		// int 타입 변수 i 를 선언하고 정수 32768 저장 후 출력
		int i = 32768;
//		System.out.println(i);
		
		i = 2147483647;
//		i = 2147483648; // 오류 발생! int 타입에 저장 가능한 정수 : -2147483648 ~ +2147483647까지
		// => 정수에 접미사가 없으면 기본적으로 int형의 기본 범위를 사용하여
		//	  최대치가 2147483647 까지만 표현(표기)이 가능함
		// => int 범위를 벗어나는 리터럴은 반드시 접미사 L을 붙여서
		//    long 타입으로 표기해야 한다.
//		i = 2147483648L; // long 타입 정수는 int 타입 변수에 저장할 수 없다.
		// => 오류 발생! (Type mismatch: cannot convert from long to int)
		
		long l = 2147483648L;
//		System.out.println(l);
		
		// long 타입 리터럴은 접미사 L 을 붙이면 되는데
		// int 타입보다 크지 않은 정수도 L 을 붙이면 long 타입으로 취급됨
//		i = 5L; // 오류 발생! 정수 5는 int 범위에 포함되지만, L 붙이면 저장 불가!
		
		// 실수 데이터타입
		double d = 3.14; // 실수 기본 데이터타입 double
//		float f = 3.14; // 오류 발생
		// => (Type mismatch: cannot convert from double to float)
		// 이는 float f = double 3.14 같다 라는 말인데 전제조건부터 성립되지않는다. 데이터타입 다름
		// 접미사가 없으면 double 타입으로 인식되므로 float 타입 변수 저장 불가!
		float f = 3.14f;
//		System.out.println(d);
//		System.out.println(f);
		
		// boolean 데이터타입 : 특수한 값인 true 또는 false 만 사용 가능
//		boolean bool = 3.14; // 오류 발생! boolean bool 타입에는 숫자 불가능
		boolean bool = true;
//		System.out.println(bool);
		bool = false;
//		System.out.println(bool);
//		bool = FALSE; // 오류 발생! 대문자 안됨 소문자만 가능
//		bool = 0; // 오류 발생!
		
		System.out.println("-----------------------------------");
		
		// < 2진수, 8진수, 10진수, 16진수 표현 방법 >
		
		// 1. 10 진수 : 일반적인 정수 그대로 표현
		int num = 10; // 10진수 10을 저장
		System.out.println(num);
		
		// 2. 2 진수 : 0 또는 1 숫자만 사용하며, 접두사 0b 붙임
		num = 0b1010; // 2진수 -> 10 진수로 변환하여 저장됨
		System.out.println(num);
		//주의! 0 또는 1 이외의 값 사용 불가!
//		num = 0b1012;
		// => 오류 발생! (Syntax error on token "2", delete this token) : 구문 오류 2 삭제 해라
		
		// 3. 8 진수 : 0 ~ 7 사이의 숫자만 사용, 접두사 0 붙임
		num = 012; // 8^1 + (8^0)^2 = 10
		System.out.println(num);
//		num = 018; // 오류 발생! 8 사용 불가
		
//		tel = 01094418323 // 숫자만 붙이면 8진수로 착각할 수 있다. 
						  //그러므로 tel = "~~~" 이렇게 큰따옴표를 붙여 번호를 문자열로 인식하게 만는다.
		
		// 4. 16 진수 : 0 ~ 9 사이의 숫자와 A ~ F 사이의 알파벳 사용(0~15)
		//				접두사 0x 붙임
		num = 0xA;
		num = 0xa; // 16진수 알파벳 대소문자는 무관
		System.out.println(num);
		
//		num = 0xG; // 오류 발생! 16진수 알파벳은 A ~ F 까지만 사용가능
		
				
	}

}

package operator;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 산술 연산 시 자동 형변환
		 * - 연산 수행 시 피연산자끼리의 데이터타입을 일치시킨 후 연산을 수행
		 * - 규칙 1) int 타입보다 작은 타입(byte, short, char)끼리의 연산은 
		 * 			 모두 int 타입으로 변환 후 연산을 수행
		 *           => 즉, 결과 값이 무조건 int 타입으로 된다.
		 *           ex1) byte + byte = (int)byte + (int)byte = int + int = int
		 *           ex2) char + int = (int)char + int = int + int = int
		 *           
		 * - 규칙 2) int 타입보다 큰 타입과의 연산은 큰 타입으로 변환 후 수행
		 * 			 => 즉, 결과값이 무조건 큰 타입이 됨
		 * 			 ex1) int + long = (long)int + long = long + long = long
		 * 			 ex2) long + float = (float)long + float = float + float = float // 정수값을 실수값으로 변환(정수<실수)
		 *  - 실수형끼리 연산 시 double타입을 디폴트값으로 인식
		 */
		
		byte b1 = 10; // byte 범위 : -128 ~ 127
		byte b2 = 20;
		byte b3;
		
		// b1 과 b2 의 연산 결과를 byte 타입 변수 b3 에 저장할 때 문제가 발생!
//		b3 = b1 + b2; // 오류 발생!
		// => 우변은 byte 타입이지만 좌변은 규칙1에 의해 byte + byte = int + int = int 타입으로 자동변환된다.
		// => Type mismatch: cannot convert from int to byte (양쪽의 데이터타입이 서로 일치하지 않음)
		// => 저장하려는 변수 데이터타입이 byte 라서 문제가 발생!
		// => int 타입을 byte 타입으로 저장하려면 강제 형변환(byte) 필요
//		b3 = (byte)b1 + (byte)b2; // 다시 각각 int로 변환되므로 또 오류 발생!
		// => (int)(byte)b1 + (int)(byte)b2 = (int)b1 + (int)b2 => int
		
		// => 연산 결과에 형변환 연산자를 적용하여 byte 타입으로 변환해야한다!
		b3 = (byte)(b1 + b2); // (int)(byte) + (int)(byte) => (byte)int => byte
		System.out.println(b3);
		
		System.out.println("---------------short타입----------------");

//		short s = b1 + b2; // 오류 발생! byte + byte = int + int = int 이므로
		// short 타입 변수 s에 저장 (자동 형변환) 불가!
		short s = (short)(b1 + b2);
		System.out.println(s);
		
		System.out.println("---------------char타입----------------");
	
		char ch = 'A'; // a = 65 , c = 67
		// char 타입 변수 ch2에 ch 값에 2를 더한 결과를 저장
//		char ch2 = ch + 2; // 오류발생! char + int = (int)char + int 이므로
		// => 결과값이 int가 되어 char 타입 변수에 저장 불가!
		char ch2 = (char)(ch + 2);
		// => 'A' + 2 = 65 + 2 = 67이므로 결과값을 다시 char타입으로 변환하면
		//    67에 해당하는 문자 'C' (67을 char 타입으로 변환한 데이터) 가 저장됨
		System.out.println(ch2); // C 가 출력됨
		
		System.out.println(ch + 2); // ch='A' -> int(65), 65 + 2 = 67
		// => ch + 2의 결과값은 int 형 이므로 문자 'C' 대신 67 출력
		// => 이 결과값을 다시 char 타입으로 변환하면 문자 'C'가 출력됨
		System.out.println((char)(ch+2)); // 67을 char 타입으로 변환하여 'C' 출력됨
		
		System.out.println("---------------규칙2----------------");
				
		int i = 100;
		long l = 200; 
		
		// int형 변수 i2에 i+l 결과값을 저장
//		int i2 = i + l; // int + long = long 이므로 int 타입 변수에 저장 불가
		int i2 = (int)(i + l);
		System.out.println(i2);
		
//		float f = 3.14; // 디폴트 실수데이터값인 double 타입으로 인식이 되어버려서 발생한 오류!
		float f = 3.14f; // => float f = (float)3.14; / float으로 변환시켜주기
//		long l2 = l + f; // 오류 발생!
		long l2 = (long)(l + f); // long(정수형) + float(실수형) = float(실수형)이므로 long(정수형)으로 변환
		System.out.println(l2);
		
		System.out.println("------------------------------------");
		
		System.out.println(3 / 2);
		// 나눗셈 연산은 몫을 계산하며, int / int = int가 되어
		// 3 / 2 의 연산 결과는 정수 1이 출력됨 (by.규칙1)
		
		// 만약, 3 / 2 결과를 1.5의 결과값으로 얻고 싶을 경우
		// 정수가 아닌 실수 형태의 나눗셈 연산으로 연산을 수행해야 함
		// 따라서, 최소한 피연산자 중 하나를 실수로 변환한 후 연산을 수행(by.규칙2)
		// => 규칙 2에 의해서 int형 보다 큰 데이터 타입을 따라감
		System.out.println((double)3 / 2); // double / int = double (double > int)
		System.out.println(3 / (double)2); 
		System.out.println(3 / 2.0); // 실수는 double 타입이 디폴트, int(정수)/double(실수)=double(실수)
		// => 주로, 수치 데이터는 .0 을 붙여서 정수형을 실수형으로 변환하고,
		//	  실수형 변수는 형변환 연산자를 이용하여 정수형으로 변환을 한다.
		
		System.out.println("=========================================");
		
		// 실수끼리의 연산(float 과 double 간의 연산)
		float f1 = 0.1f;
		double d1 = 0.1;
		
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println(f1 + d1);
		// float -> double 로 변환하여 double + double = double이 된다.
		// 따라서, 0.1f + 0.1 = 0.1 + 0.1 = 0.2인데
		// 근사치 표현에 의해서 잘못된 결과가 발생할 수 있다.
		// => double -> float 타입으로 강제변환 후 연산을 수행(1)하거나 
		//    두 실수 모두 정수로 변환하여 연산 수행 후 다시 실수로 변환(2)
		System.out.println(f1 + (float)d1); // (1)의 경우
		System.out.println(((int)(f1*10) + (int)(d1*10)) / 10.0); // (2)의 경우
		
		System.out.println("=========================================");
		
		// 리터럴끼리 연산 시에는 자동 형변환이 발생하지 않는다.
		byte b4 = 10 + 20; // byte 타입 범위 내의 정수는 byte 타입 그대로 연산
		System.out.println(b4);
		
		// 단, 리터럴끼리의 연산이라도 표현 가능 범위를 초과하면 오류 발생!
		byte b5 = 10 + (byte)200; // byte 타입 범위(-128 ~ 127)를 초과하므로 int로 취급됨
		System.out.println(b5); // 2진수관련.. 이 결과값은 나중에 설명...
		
	}

}

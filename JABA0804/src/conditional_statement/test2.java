package conditional_statement;

public class test2 {

	public static void main(String[] args) {
		// "아이티윌로 걸어서 출발" 출력
		System.out.println("아이티윌로 걸어서 출발");
		// money 변수 선언, 초기값 7000원
		int money = 7000;
		// 중혁씨가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		// 아니면 "버스타고 가기!" 출력
		if(money >= 5000) {
			System.out.println("택시타고 가기!");
		} else {
			System.out.println("버스타고 가기!");
		}
		// "아이티윌에 도착" 출력
		System.out.println("아이티윌에 도착");

		System.out.println("===================================");
		
		// if - else 문 조건식에 비교연산자, 논리연산자 등을 조합하여 활용 가능
		// 1. 나이(age)를 입력받아 20대인지 판별
		//	  => 20대란? 나이(age)가 20이상이고 나이(age)가 29이하(30미만)
		int age1 = 35;
		if(age1 >= 20 && age1 < 30) {
			// 나이가 20대일 경우 "당신은 20대 입니다!" 출력
			System.out.println("당신은 20대 입니다!");
		} else { 
			System.out.println("당신은 20대가 아닙니다!");
		}
		
		System.out.println("---------------------------------------");
		
		// 2. 나이(age)를 입력받아 놀이동산 무료입장 여부 판별
		// => 무료입장 대상 : 나이(age)가 5세 미만이거나 나이(age)가 65세 이상
		int age = 60;
		// if문을 사용하여 조건에 만족할 경우 "무료입장 대상입니다!" 출력
		if(age < 5 || age >= 65) {
			System.out.println("무료입장 대상입니다!");
		} else { 
			System.out.println("무료입장 대상이 아닙니다!");
		}
		
		System.out.println("---------------------------------------");
		
		// 문자 ch 가 소문자일 때 "소문자!" 를 출력하고 대문자로 변환 후 출력
		// 아니면, "소문자 아님!" 출력
		// => 소문자란? 'a'(97) 이상이고 'z'(122)이하인 문자
		// => 대문자란? 'A'(65) 이상이고 'Z'(90)이하인 문자
		// => 소문자와 대문자는 32만큼의 차이가 있다!
		
		char ch = 97; // ch = 'a'; 로 입력해도 가능 
		if (ch >= 97 && ch <= 122) {
//			ch = (char)(ch - 32); // 형변환연산자 사용
			ch -= 32; // 확장대입연산자를 사용
			System.out.println("대문자 변환 결과 : " + ch);
		} else {
			System.out.println("소문자 아님!");
		}
		
		char ch1 = 'a'; // ch = 97; 로 입력해도 가능 
		if (ch1 >= 'a' && ch1 <= 'z') {
//			ch = (char)(ch - 32); // 형변환연산자 사용
			ch1 -= 32; // 확장대입연산자를 사용
			System.out.println("대문자 변환 결과 : " + ch1);
		} else {
			System.out.println("소문자 아님!");
		}
		
		
	}

}

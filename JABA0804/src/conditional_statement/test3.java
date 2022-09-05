package conditional_statement;

public class test3 {

	public static void main(String[] args) {
		// 문자 ch 에 대해 대문자, 소문자, 숫자 판별
		// => 위의 모든 조건이 false 일 때 "기타 문자" 출력
		// => 소문자란? 'a'(97) 이상이고 'z'(122)이하인 문자
		// => 대문자란? 'A'(65) 이상이고 'Z'(90)이하인 문자
		// => 소문자와 대문자는 32만큼의 차이가 있다!
		
		char aa = 60;
		if(aa >= 97 && aa <= 122) {
			System.out.println(aa + " : 소문자!");
		} else if(aa >= 65 && aa <= 90) {
			System.out.println(aa + " : 대문자!");
		} else if(aa >= '0' && aa <= '9') {
			System.out.println(aa + " : 숫자!");
		} else {
			System.out.println(aa + " : 기타문자!");
		}
		
		
		System.out.println("---------------------------------------");
		
		// 문자 ch 가 대문자일 때 소문자로 변환하고, 소문자일 때 대문자로 변환
		// => 대문자, 소문자가 아닐 경우 "변환 불가!" 출력
		
		char bb = 'V';
		if(bb >= 'A' && bb <= 'Z') {
			System.out.println(bb + " : 대문자!");
			bb += 32;
			System.out.println("소문자 변환 후 : " + bb);
		} else if(bb >= 'a' && bb <= 'z') {
			System.out.println(bb + " : 소문자!");
			bb -= 32;
			System.out.println("대문자 변환 후 : " + bb);
		} else {
			System.out.println(bb + " : 변환 불가!");			
		}				
		
		
		System.out.println("=======================================");
		
		/*
		 * 학생의 점수를 입력받아 학점 계산 후 출력
		 * - 점수(정수형)를 저장할 변수 score 를 선언하고 임의의 점수 저장
		 * - 학점(문자열)을 저장할 변수 grade 를 선언하고 널스트링("") 저장
		 * 
		 * if 문을 사용하여 다음 조건에 맞는 학점을 계산하고
		 * 계산 결과에 따른 학점을 문자열로 grade 변수에 저장
		 * 학점 'A' : 점수가 90 ~ 100
		 * 학점 'B' : 점수가 80 ~ 89
		 * 학점 'C' : 점수가 70 ~ 79
		 * 학점 'D' : 점수가 60 ~ 69
		 * 학점 'F' : 점수가 0 ~ 59
		 * 
		 * < 출력 예시 >
		 * 85점의 학점  : B
		 * 
		 */
		
		int score = 98;
		String grade = ""; // 널스트링 : 문자열 내 아무런 값도 넣지 않을 경우
		
		if(score >= 90 && score <= 100) {
			grade = "A";
			System.out.println("당신의 학점은 " + grade + " 입니다!");
		} else if(score >= 80 && score <= 89) {
			grade = "B";
			System.out.println("당신의 학점은 " + grade + " 입니다!");
		} else if(score >= 70 && score <= 79) {
			grade = "C";
			System.out.println("당신의 학점은 " + grade + " 입니다!");
		} else if(score >= 60 && score <= 69) {
			grade = "D";
			System.out.println("당신의 학점은 " + grade + " 입니다!");
		} else if(score >= 0 && score <= 59) {
			grade = "F";
			System.out.println("당신의 학점은 " + grade + " 입니다!");
		}
		
		// 강사님 버전
		int scoree = 98;
		String gradee = ""; // 널스트링 : 문자열 내 아무런 값도 넣지 않을 경우
		
		if(scoree >= 90 && scoree <= 100) {
			gradee = "A";
//			System.out.println(scoree + "점의 학점 : " + gradee);
		} else if(scoree >= 80 && scoree <= 89) {
			gradee = "B";
//			System.out.println(scoree + "점의 학점 : " + gradee);
		} else if(scoree >= 70 && scoree <= 79) {
			gradee = "C";
//			System.out.println(scoree + "점의 학점 : " + gradee);
		} else if(scoree >= 60 && scoree <= 69) {
//			gradee = "D";
			System.out.println(scoree + "점의 학점 : " + gradee);
		} else if(scoree >= 0 && scoree <= 59) {
			gradee = "F";
//			System.out.println(scoree + "점의 학점 : " + gradee);
		}
		// 모든 조건에서 출력문이 동일하므로 코드 중복 발생함
		// => 동일한 문장을 실행하는 경우에는 if문 바깥에서 실행할 경우
		//    코드 중복을 제거할 수 있다!
		System.out.println(scoree + "점의 학점 : " + gradee);
	
		
	}

}

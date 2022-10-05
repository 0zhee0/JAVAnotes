package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 참조변수가 부모 객체를 참조하는지 자식 객체를 참조하는지를 판별할 수 있음.
		 * - 판별 결과가 true 이면 형변이 가능한 관계(업캐스팅 or 다운캐스팅)
		 *   판별 결과가 false 이면 절대로 형변환 불가!
		 * - 우변의 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능
		 * - A is a B = A instanceof B
		 * - 판별 결과를 boolean 타입 변수에 저장하거나
		 *   if문에 판별하는 문장을 직접 사용 가능
		 *   
		 * < 기본 문법 >
		 * if(A instanceof B) { // A 는 참조변수(객체), B는 클래스명(타입)
		 * 		// 형변환이 가능한 관계이므로 변환 수행
		 * } else {
		 * 		// 절대로 형변환이 불가능한 관계이므로 변환 수행X
		 * }
		 * 
		 */
		
		SmartPhone sp = new SmartPhone("갤럭스 z플립4", "010-1234-5678", "안드로이드");
		
		// 호출 가능한 메서드 : 3개
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		// sp 는 SmartPhone 입니까? YES
		// sp is a SmartPhone?
		if(sp instanceof SmartPhone) {
			System.out.println("sp 는 SmartPhone 이다!");
			// sp 를 SmartPhone 타입 변수에 저장이 가능하다!
			SmartPhone phone = sp;
		} else {
			System.out.println("sp 는 SmartPhone이 아니다!");
		}
		
		System.out.println("--------------------------------");
		
		// 업캐스팅 가능 대상 확인
		// sp 는 HandPhone 입니까? YES (SmartPhone(ps) is a HandPhone)
		if(sp instanceof HandPhone) {
			System.out.println("sp 는 HandPhone 이다!");
			System.out.println("그러므로 sp를 HandPhone 으로 형변환 가능하다!");
			
			// sp -> HandPhone 타입(hp)으로 변환
			HandPhone hp = sp; // 업캐스팅 = 묵시적(자동) 형변환
			System.out.println("sp 는 HandPhone 이 가진 모든 기능을 포함한다!");
			System.out.println("따라서, 업캐스팅 이후에도 HandPhone 의 기능 사용 가능!");
			
			hp.call(); // HandPhone 의 기능인 전화기능과
			hp.sms();  // 문자 기능을 사용할 수 있으나
//			hp.kakaoTalk(); // SmartPhone 의 기능은 사용을 포기해야 한다!	
		} else {
			System.out.println("sp 는 Handphone 이 아니다!");
		}
		
		System.out.println("---------------------------------------");
		
		// 다운캐스팅 가능 대상 확인
		// 슈퍼클래스 타입 인스턴스 생성
		HandPhone hp = new HandPhone("애니콜", "011-222-2222");
		
		// hp 는 SmartPhone 입니까? No
		if(hp instanceof SmartPhone) {
			System.out.println("hp 는 SmartPhone 이다!");
		} else {
			System.out.println("hp 는 SmartPhone 이 아니다!");
			System.out.println("그러므로 SmartPhone 으로 변환 불가능!");
			System.out.println("hp 는 SmartPhone 이 가진 기능을 모두 포함하지 못함!");
		}
		
		System.out.println("----------------------------------------");

		// 다운캐스팅 가능 대상 확인(가능한 경우)
		// SmartPhone -> HandPhone 타입(hp2)으로 업캐스팅
		HandPhone hp2 = new SmartPhone("갤럭시노트20", "010-1234-5678", "안드로이드");
		
		// 업캐스팅 후에는 참조 영역 축소로 접근 범위가 줄어들게 됨
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk(); // 접근 불가
		
		// hp2 는 SmartPhone 입니까?
		if(hp2 instanceof SmartPhone) {
			
		}
		
	}

}

class HandPhone {
	String modelName;
	String phoneNumber;
	
	// 파라미터 생성자(Alt + Shift + S -> O)
	public HandPhone(String modelName, String phoneNumber) {
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("전화 기능!");
	}
	
	public void sms() {
		System.out.println("문자 기능!");
	}
	
	
}

class SmartPhone extends HandPhone {
	String osName;

	// 모델명, 전화번호, 운영체제명을 전달받아 초기화를 하는 생성자 정의
	// => 모델명과 전화번호는 슈퍼클래스의 생성자를 통해 대신 초기화 수행
	public SmartPhone(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능!");
	}
	 
	
}








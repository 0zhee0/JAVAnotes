package class_;

public class Ex {
	
	// main() 메서드는 자바 프로그램의 시작점이다!
	// => main() 메서드에서부터 객체를 생성하고 사용할 수 있다!
	// 단, main() 메서드에서만 가능한 것은 아니고
	// main() 메서드가 호출하는 다른 메서드에서도 사용 가능
	public static void main(String[] args) {
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 하기 위해서는
		 * 반드시 실체(= 객체)를 생성해야한다!
		 * => 클래스를 사용하여 메모리에 생성된 객체(실체)를 만들게 되고,
		 * 	  이를 인스턴스(Instance)라고 함
		 * 
		 * < 클래스에 대한 인스턴스 생성 기본 문법 >
		 * 클래스 변수명 = new 클래스명();
		 */
		
		// Animal 클래스의 인스턴스 생성
		// 1. Animal 클래스 타입 참조변수 선언
//		Animal ani;
		
		// 2. Animal 클래스 인스턴스 생성 및 주소값 저장
//		ani = new Animal(); 
		
		// 위의 두 문장을 한 문장으로 결함
		Animal ani = new Animal();
		
		// Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출
		// => 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하며,
		//	  인스턴스 주소를 담고 있는 참조변수(ani)를 통해 접근이 가능함
		// 1. Animal 인스턴스의 멤버변수 name과 age에 값 저장
//		name = "멍멍이"; // 컴파일 에러 발생! 존재하지 않는 변수이므로 사용 불가
		// => 반드시 참조변수명.멤버변수명 형태로 접근해야 함!
		ani.name = "멍멍이"; // ani 인스턴스의 멤버변수 name에 "멍멍이" 저장
		System.out.println("이름 : " + ani.name);
		
		ani.age = 3;
		System.out.println("나이 : " + ani.age);
		
		// 2. Animal 인스턴스의 메서드 cry() 호출
		// => 리턴값이 없는 메서드이므로 메서드만 호출
		// => 매개변수가 없는 메서드이므로 소괄호() 안에 아무것도 명시하지 않음
		ani.cry();
		
		System.out.println("------------------------------");
		
		// Animal 클래스의 두번째 인스턴스(ani2) 생성
		// => 멤버변수 초기화 - 이름 : 냐옹이, 나이 : 2
		Animal ani2 = new Animal();
		ani2.name = "냐옹이";
		ani2.age = 2;		
		System.out.println("이름 : " + ani2.name);
		System.out.println("나이 : " + ani2.age);
		ani2.cry();
		
		//-----------------------------------------------------
		// 위의 두 인스턴스(ani, ani2) 구조
		//-----------------------------------------------------
		// new
		// Animal 클래스 => 인스턴스1(ani)   인스턴스2(ani2)
		// 이름(name)    => "멍멍이"  		  "냐옹이"
		// 나이(age)     =>  3			  	   2
		//-----------------------------------------------------
		
		System.out.println("=====================================");
		
		// Car 클래스의 인스턴스(car) 생성 및 멤버변수 초기화 후 출력
		// 제조사 :현대
		// 모델명 : 그랜져
		// 배기량 : 3000
		Car car = new Car();
		// => Heap 공간에 생성된 인스턴스 주소가 참조변수 car에 저장
		car.company = "현대";
		car.modelName = "그랜져";
		car.cc = 3000;
		System.out.println("제조사 : " + car.company);
		System.out.println("모델명 : " + car.modelName);
		System.out.println("배기량 : " + car.cc);
		
		car.speedUp();
		car.speedDown();
		
		System.out.println("=====================================");
		
		// Student 클래스 인스턴스 생성
		// - 이름 : "홍길동", 번호 : 1, 과정명 : "핀테크 디지털 금융서비스 자바 개발자"
		// - 참조변수 : s1
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.id = 1;
		s1.className ="핀테크 디지털 금융서비스 자바 개발자";
		System.out.println("이름 : " + s1.name);
		System.out.println("번호 : " + s1.id);
		System.out.println("과정명 : " + s1.className);
		
		s1.study("핀테크 디지털 금융서비스 자바 개발자");
		s1.rest();
		
		// - 이름 : "김자바", 번호 : 2, 과정명 : "핀테크 디지털 금융서비스 자바 개발자"
		// - 참조변수 : s2
		Student s2 = new Student();
		s2.name = "김자바";
		s2.id = 2;
		s2.className ="핀테크 디지털 금융서비스 자바 개발자";
		System.out.println("이름 : " + s2.name);
		System.out.println("번호 : " + s2.id);
		System.out.println("과정명 : " + s2.className);
		
		s2.study("자바");
		
	} // main() 메서드 끝
				
} // Ex 클래스 끝

// 하나의 java 파일 내에 여러 개의 클래스를 추가로 정의할 수 있다.
// => 단! 파일명과 동일한 이름의 클래스 외에는 public[접근제한자] 키워드를 붙일 수 없다!
// 학생(Student) 클래스 정의
// 속성 : 이름(name, 문자열), 번호(id, 정수), 과정명(className, 문자열)

//public class Student {
	// 에러 발생!
	// => The public type Student must be defined in its own file
	// => 현재 파일명(Ex)과 지금 생성하려는 class명(Student)과 동일하지 않기 때문에 public 키워드를 붙일 수 없다.
	// 학생(Student) 클래스 정의
	// 속성 : 이름(name, 문자열), 번호(id, 정수), 과정명(className, 문자열)
	// 1) 공부(study()) - 리턴값 없음, 매개변수 - 과목명(className, 문자열)
	//					  => "XXX 과목 공부!" 출력
//}
class Student {
	// 멤버변수 선언
	String name;
	int id;
	String className;
	
	// 메서드 정의
	public void study(String sujectName) {
		// 전달받은 파라미터 값을 사용하여 출력
		System.out.println(sujectName + " : 과목 공부!");
	}
	
	public void rest() {
		System.out.println("휴식!");
	}
}




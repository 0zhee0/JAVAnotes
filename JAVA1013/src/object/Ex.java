package object;

import java.util.Objects;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Object 클래스
		 * - java.lang 패키지에 위치하는 클래스
		 * - 모든 클래스의 슈퍼클래스(최상위클래스)
		 * 	 => 상속을 표현하지 않으면 자동으로 상속되는 클래스
		 * - Object 클래스의 모든 멤버는 다른 클래스에서 사용 또는 오버라이딩 가능
		 * 
		 * 1. equals() 메서드(public boolean equals(Object o) {})
		 * - 두 객체가 같은지 동등비교(==) 수행
		 * 	 => 즉, 두 객체의 주소값을 비교하여 같으면 true, 다르면 false 리턴
		 * - 실제 '두 객체가 같다'는 의미는 두 객체의 주소값 비교가 아닌
		 * 	 객체가 가지는 멤버변수가 같다는 의미로 사용됨
		 * 	 => 따라서, 사용자가 정의하는 클래스에 Object 클래스로부터 상속받은
		 * 		equals() 메서드를 오버라이딩하여
		 * 		각 객체의 멤버변수끼리 비교하도록 수정하여 사용함
		 * - 자바에서 제공하는 대부분의 클래스(API)들은 
		 * 	 Object 클래스의 equals() 메서드를 오버라이딩 해놓았으므로
		 * 	 객체 내용 비교가 가능함
		 * 	 ex) String 클래스, ArrayList 클래스 등
		 * - equals() 메서드 자동 생성 (오버라이딩) 기능을 활용하여 쉽게 구현
		 * 	 => Alt Shift S -> H	
		 */
		
		Person p1 = new Person("홍길동", "031010-1234567");
		Person p2 = new Person("홍길동", "031010-1234567");
		
		System.out.println("p1의 객체 정보 : " + p1); // => object.Person@fad74ee : 인스턴스 주소값
		System.out.println("p2의 객체 정보 : " + p2); // => object.Person@1a1d6a08 : 인스턴스 주소값
		
		// 참조변수에 대한 동등비교(==) 수행
		if(p1 == p2) { // 객체 p1과 p2에 저장된 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 참조변수에 대한 Object 클래스의 equals() 메서드를 통한 비교 수행
		if(p1.equals(p2)) { // 동등비교 연산(==)과 동일한 결과를 수행
			System.out.println("두 객체의 주소값이 같다! (equals())");		
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		System.out.println("-------------------------------------------------------");
		
		// Person타입 변수 p3에 p2변수의 주소값을 복사
		Person p3 = p2;
		System.out.println("p1의 객체 정보 : " + p2); 
		System.out.println("p2의 객체 정보 : " + p3); 
		
		// 참조변수에 대한 동등비교(==) 수행
		if(p3 == p2) { // 객체 p1과 p2에 저장된 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (==)");
		}
		
		// 참조변수에 대한 Object 클래스의 equals() 메서드를 통한 비교 수행
		if(p3.equals(p2)) { // 동등비교 연산(==)과 동일한 결과를 수행
			System.out.println("두 객체의 주소값이 같다! (equals())");		
		} else {
			System.out.println("두 객체의 주소값이 다르다! (equals())");
		}
		
		// => Object 클래스 내의 equals() 메서드는 두 객체 주소값을 비교한다!
		
		System.out.println("------------------------------------------------------");
		
		OverridePerson p10 = new OverridePerson("홍길동", "031010-1234567");
		OverridePerson p11 = new OverridePerson("홍길동", "031010-1234567");
		
		// 참조변수에 대한 동등비교 (==) 수행
		if(p10 == p11) { // 객체 p10과 p11에 저장된 주소값 비교
			System.out.println("두 객체의 주소값이 같다! (==)");
		} else {
			System.out.println("두 객체의 주소값이 다르다! (!=)");
		}
		
		// 오버라이딩 equals() 메서드를 호출하여 객체의 멤버변수 비교 수행
		if(p10.equals(p11)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다!");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다!");
		}

	}
}

class Person{
	String name;
	String jumin;
	
	public Person(String name, String jumin) { // 파라미터 생성자(alt shift s + o)
		super();
		this.name = name;
		this.jumin = jumin;
	}	
}

class OverridePerson{ // class OverridePerson extends Object
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) { // 파라미터 생성자(alt shift s + o)
		super();
		this.name = name;
		this.jumin = jumin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jumin, name);
	}
	
	// Object 클래스의 equals() 메서드 오버라이딩 ctrl shift s + h
	// Person 클래스의 모든 멤버변수를 비교하여
	// 하나라도 다를 경우 false를 리턴, 모두 같을 경우 true 리턴하도록 수정
	@Override
	public boolean equals(Object obj) {
		// 주의! equals() 메서드 파라미터로 객체를 전달하면
		// 해당 객체는 Object 타입으로 업캐스팅이 일어나는데
		// 이로 인해 해당 객체 고유의 멤버에는 접근이 불가능해짐
		// => 따라서, 다시 해당 객체 타입으로 다운캐스팅이 필요함!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
//		OverridePerson other = (OverridePerson) obj; // Object -> OverridePerson변경
		// => 무조건 변환하기보다 instanceof 연산자로 판별하면 더 안전함		
		if(obj instanceof OverridePerson) {
			OverridePerson p = (OverridePerson) obj; // Object -> OverridePerson
			
			// 다운캐스팅 된 객체(p)의 멤버변수와 현재 인스턴스의 멤버변수를
			// 각각 비교 후 모두 같으면 true 리턴, 다르면 false 리턴
			// => 문자열끼리의 비교이므로 Stirng 클래스의 equals() 로 비교
			if(name.equals(p.name) && jumin.equals(p.jumin)) {
				// 이름과 주민번호가 모두 같을 경우 true 리턴
				return true;
			} // 이까지만 쓰면 에러난다. false 일 경우의 내용이 없으므로 아래에 false 리턴값 넣어주기
		}	
		// 두 객체의 변수가 하나라도 다르거나 
		// instanceif 연산 결과가 false일 경우 false 리턴
		return false;
//		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}	
}




















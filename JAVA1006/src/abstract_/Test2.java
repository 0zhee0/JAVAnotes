package abstract_;

public class Test2 {

	public static void main(String[] args) {

//		Vehicle v = new Vehicle(); // => 인스턴스 생성 불가!
		
		// ElectricCar, DiselCar -> Vehicle 타입으로 업캐스팅하여 다형성활용
		// 추상클래스 Vehicle 타입을 참조변수로 활용
		Vehicle v = new ElectricCar();
		v.addFuel();
		v.reportPosition();
		
		v = new DiselCar();
		v.addFuel();
		v.reportPosition();
	}

}

/*
 * Vehicle 클래스 정의
 * 멤버변수 : curX, curY(int) 현재 좌표를 저장하는 변수
 * 메서드 : reportPosition(리턴타입X, 매개변수X)
 * 			=> "현재 위치 : curX, curY"
 * 			addFuel(리턴타입X, 매개변수X)
 * 			=> 차량마다 연료 공급 방법이 달라지므로 오버라이딩을 해야하며
 * 			   오버라이딩 강제성을 부여함
 */

abstract class Vehicle{ // 오버라이딩 강제성을 부여하기위해 abstract 클래스로 설정
	int curX;
	int curY;
	public void reportPosition() {
		System.out.println("현재 위치 : " + curX + ", " + curY);
	}
	
	public abstract void addFuel(); // 추상메서드는 바디가 없다.
}

// Vehicle 클래스를 상속받는 ElectricCar, DiselCar 클래스 정의
// => ElectriCar의 addFuel() : "전기차 충전소에서 배터리 충전!"
// => DiselCar의 addFuel() : "주유소에서 디젤 연료 공급!"
class ElectricCar extends Vehicle{

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
}

class DiselCar extends Vehicle{

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
	
}

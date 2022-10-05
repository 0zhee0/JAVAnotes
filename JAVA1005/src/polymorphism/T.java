package polymorphism;

public class T {

	public static void main(String[] args) {
		병사 병사 = new 병사();
		
		칼 칼 = new 칼();
		총 총 = new 총();
		활 활 = new 활();
		
		병사.장착(칼);
		병사.장착(총);
		병사.장착(활);

	}

}
class 병사 {
	public void 장착(무기 무기) { // 매개변수로 부모클래스 타입을 사용하여 불러올 수 있다. 
		무기.장착();
	}
}

class 무기 {
	public void 장착() {
		System.out.println("무기를 장착하다!");
	}
}

class 칼 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("칼를 장착하다!");
	}
	
}

class 총 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("총을 장착하다!");
	}
	
}

class 활 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("활을 장착하다!");
	}
	
}

package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		Month now = Month.OCTOBER;
		System.out.println(now + ", " + now.getMonthKor());
	}
}

enum Month {
	// 생성자를 사용하여 상수에 다른 값을 결합
	JANUARY("1월"), FEBRARY("2월"), OCTOBER("10월"); // 영어 달 이름과 한국 달
	// => The constructor Month(String) is undefined
	// 기본생성자 private걸어주고 getter불러와주면 오류가 사라짐
	
	private String monthKor;

	private Month(String monthKor) { // ctrl shift s + o : 기본생성자
		this.monthKor = monthKor;	 // 달 이름을 문자열로 전달받아 초기화 
	}

	public String getMonthKor() { // ctrl shift s + r
		return monthKor;
	}
}
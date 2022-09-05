package method;

public class Test {

	public static void main(String[] args) {
		/*
		 * Account 인스턴스(acc) 생성 후 다음과 같이 초기화 및 출력
		 * -------------------------------------------------
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원 
		 */
		
		Account acc = new Account();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance + "원");
		
		System.out.println("------------메서드이용해서 출력------------");
		
		Account acc2 = new Account();		
		acc2.accountNo = "112-1111-111";
		acc2.ownerName = "김갑수";
		acc2.balance = 10000000;
		
		acc2.showAccountInfo();
	}

}

/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, 문자열) => "111-1111-111"
 * 			  예금주명(ownerName, 문자열) => "홍길동"
 * 			  현재잔고(balance, 정수)     => "10000"
 * 
 * 메서드
 * -showAccountInfo() => 리턴값 없음, 매개변수 없음
 * 	=> 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 * 		ex) 계좌번호 : 111-1111-111
 * 			예금주명 : 홍길동
 * 			현재잔고 : 10000원 
 */
class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println(accountNo);
		System.out.println(ownerName);
		System.out.println(balance + "원");
	}
		
}
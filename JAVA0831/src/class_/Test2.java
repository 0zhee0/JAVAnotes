package class_;

public class Test2 {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.accountNo = "112-1111-111";
		acc.ownerName = "김갑수";
		acc.balance = 10000000;
		
		acc.showAccountInfo();

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
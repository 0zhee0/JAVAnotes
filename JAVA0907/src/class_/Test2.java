package class_;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		acc.showAccountInfo();
		System.out.println("-------------------------------");
		acc.deposit(5000);
		
		System.out.println("-------------------------------");
		// 현재잔고보다 적거나 같은 금액을 출력하는 경우(출금가능)
		int money = acc.withdraw(5000);
		System.out.println("출금된 금액 : " + money + " 원");
		
		System.out.println("-------------------------------");
		// 현재잔고보다 많은 금액을 출력하는 경우
		int money1 =acc.withdraw(10000);
		System.out.println("출금된 금액 : " + money1 + " 원");
		
	} // main() 메서드 끝

} // Test2 클래스 끝

/* 
 * 은행계좌(Account) 클래스 정의
 * [ 멤버변수 선언 ]
 * - 계좌번호(accountNo, 문자열)
 * 	 예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 *   
 * [ 메서드 정의 ]
 * - 계좌번호 , 예금주명, 현재잔고를 출력하는 showAccountInfo() 메서드
 *   ex) 계좌번호 : 111-1111-111
 *   	 예금주명 : 홍길동
 *   	 현재잔고 : 10000원
 *   
 * - 입금 기능을 수행하는 deposit() 메서드
 *   => 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 *   	입금된 금액과 임금 후 현재잔고를 출력
 *   	ex) "입금하신 금액		: XXXXX원"
 *   	    "입금 후 현재잔고	: XXXXX원"
 *	 => 단, 리턴값은 없음
 *
 * - 출금 기능을 수행하는 withdraw() 메서드
 *   => 출금될 금액(amount, 정수)를 전달받아 현재잔고에서 차감 후 
 *   	출금될 금액과 출금 후 현재잔고를 출력
 *      ex) "출금하신 금액		: XXXXX원"
 *   	    "출금 후 현재잔고	: XXXXX원"
 *	 => 단, 출금 기능을 수행하기 전 현재잔고(balance)과 출금할 금액을 비교하여
 *		현재 잔고가 출금할 금액보다 적을 경우 출금을 수행하지 않고 다음과 같이 출력
 *		ex) "잔고가 부족하여 출금이 불가능합니다."
 *			"출금할 금액 : xxxxx원, 현재잔고 : xxxxx원"
 *	 => 리턴값 있음 (출금할 금액에 해당하는 금액 리턴)
*/

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	// 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + " 원");
		}
	
	// 입금 가능
	public void deposit(int amount) {
		// 전달받은 입금금액(amount)를 현재잔고(balance)에 누적 후 출력	
		balance += amount;
		System.out.println("입금하신 금액 : " + amount + " 원");
		System.out.println("입금 후 현재잔고 : " + balance + " 원");
	}
	
	// 출금 기능
	public int withdraw(int amount) {
		// 입력받은 출금금액(amount)를 현재잔고(balance)에 차감 후
		// 출금되는 금액(amount)을 리턴
		// 단, 현재잔고가 출금금액보다 적을 경우 출금 불가	
		if(balance < amount) {
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.println("출금할 금액 : " + amount+ "," + "현재잔고 : " + balance + " 원");
//			return 0;
			amount = 0;
		}else {
			balance -= amount;
			System.out.println("출금될 금액 : " + amount + " 원");
			System.out.println("출금 후 현재잔고 : " + balance + " 원");
//			return amount; // 출금금액리턴
		}		
		return amount;
		
//		// if문 내에서 출금 실패 시 return 문에 의해 메서드를 종료하므로
//		// 출금이 가능한 경우의 코드는 else 문이 없어도 상관없다!
//		if(balance < amount) {
//			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
//			System.out.println("출금할 금액 : " + amount+ "," + "현재잔고 : " + balance + " 원");
//			return 0;
//		}
//		balance -= amount;
//		System.out.println("출금될 금액 : " + amount + " 원");
//		System.out.println("출금 후 현재잔고 : " + balance + " 원");
//		
//		return amount; // 출금금액리턴
	}	
}



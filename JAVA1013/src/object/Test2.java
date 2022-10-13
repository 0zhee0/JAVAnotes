package object;

import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		// acc와 acc2 생성 후 두 계좌의 정보 비교 및
		// 참조변수 출력 시 toString() 메서드 활용하여 결과 보기
		
		Account acc = new Account("111-1111-111", "홍길동", 10000);
		System.out.println("acc의 계좌정보 : " + acc); // acc.toString()
		
		Account acc2 = new Account("111-1111-111", "홍길동", 10000);
		
		if(acc.equals(acc2)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		} else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}
	}

}

/*
 * Account 클래스 정의
 * - 멤버변수
 * 	 계좌번호(accountNo, 문자열), 예금주명(ownerName, 문자열)
 * 	 현재잔고(balance, 정수)
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * - equals() 메서드 오버라이딩하여 계좌정보를 비교하도록 정의
 * - toString() 메서드 오버라이딩하여 계좌정보를 문자열로 리턴하도록 정의
 */


class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) { // ctrl shift s + o : 생성자
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

//	@Override
//	public int hashCode() { // ctrl shift s + h : equals() 메서드 오버라이딩
//		return Objects.hash(accountNo, balance, ownerName);
//	}
	// A 와 B의 hashCode()가 같냐? 물었을 때 true 이면 equals(Object obj)로 이동
	// equals에서 동작한 결과가 flase이면 hashCode()가 어떤 결과값이든 최종결과는 false이다.
	// 그러므로 hashCode()는 없어도 된다. -> 지워!
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}
	
	@Override
	public String toString() { // ctrl shift s + v -> toString() 메서드 선택
		
		return "계좌번호 = " + accountNo + ", 예금주명 = " + ownerName + ", 현재잔고 = " + balance;
	}
	
	
}
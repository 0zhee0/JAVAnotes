package static_member;

public class Test4 {

	public static void main(String[] args) {
//		Account acc = new Account();
		
		// 생성된 인스턴스를 리턴받기
		Account acc = Account.getInstance();
		
		// Setter 호출하여 계좌번호 저장, showAccoutInfo() 메서드로 출력
		acc.setAccountNo("111-1111-111");
		acc.showAccountInfo();
	}

}

class Account {
	// ================ Account 클래스에 대한 싱글톤 패턴 구현 ===========
		private static Account instance = new Account();
		
		public Account() {}
		
		public static Account getInstance() {
			return instance;
		}
	// ===================================================================
	
		
	// accountNo 멤버변수 선언(String, Private)
	private String accountNo ;
		
	// Getter/Setter 메서드 선언
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	// showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
	}
	
}
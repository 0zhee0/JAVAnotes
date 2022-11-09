package thread;

public class Test2 {

	public static void main(String[] args) {
		// 메시지 전송과 파일 전송을 동시에 수행할 경우
		// 1. 싱글쓰레드로 구현하는 경우
		SendMessage sm = new SendMessage("안녕하세요", 100);
		FileTransfer ft = new FileTransfer("a.java", 100000);
		
		// 파일 전송을 먼저 시작한 후 메시지를 전송한다고 가정
//		ft.run(); // 파일 전송이 끝난 후에야 
//		sm.run(); // 메시지 전송이 시작됨
		
		// ---------------------------------------------------------
		// 2. 멀티쓰레드로 구현하는 경우
		SendMessageMultiThread smmt = new SendMessageMultiThread("안녕하세요", 100);
		FileTransferMultiThread ftmt = new FileTransferMultiThread("a.java", 100);
		ReceiveMessageMultiThread rmmt = new ReceiveMessageMultiThread("반갑습니다", 100);
		
		ftmt.start();
		smmt.start();
		
//		rmmt.start(); // Runnable 구현체는 start() 메서드를 직접 호출 불가!
		// => Thread 인스턴스에 Runnable 구현체를 파라미터값으로 전달하여 start() 호출
		Thread t = new Thread(rmmt);
		t.start();
		

	}

}

// -----------------------------------------------------------
/*
 * 메시지 전송 클래스
 * 1. 싱글쓰레드로 구현
 * - class명 : SendMessage
 * - 멤버변수 : 메시지(msg, 문자열), 카운트(count, 정수형)
 * - 파라미터 생성자(String, int)
 * - run() 메서드 : 리턴값 없음, 파라미터 없음, count 만큼 msg 출력
 *   ex) 메시지 전송 - 1 : 안녕하세요
 *       메시지 전송 - 2 : 안녕하세요
 */

class SendMessage {
	String msg; // 메시지 저장 변수
	int count; // 카운트 저장 변수
	
	public SendMessage(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}
	
	public void run() {
		// count 횟수 만큼 msg 문자열을 화면에 출력하는 반복문 작성
		//  ex) 메시지 전송 - 1 : 안녕하세요
		//      메시지 전송 - 2 : 안녕하세요
		for(int i = 1; i <= count; i++) {
			System.out.println("메시지 전송 - " + i + " : " + msg);
		}
	}
	
}

/*
 * 멀티쓰레드로 구현
 * - class명 : SendMessageMultiThread, Thread 클래스 상속
 * - 멤버변수 : 메시지(msg, 문자열), 카운트(count, 정수형)
 * - 파라미터 생성자(String, int)
 * - run() 메서드 오버라이딩
 */
class SendMessageMultiThread extends Thread {
	String msg;
	int count;
	
	public SendMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티쓰레딩으로 처리할 작업을 기술
		// count 횟수 만큼 msg 문자열을 화면에 출력하는 반복문 작성
		//  ex) 메시지 전송 - 1 : 안녕하세요
		//      메시지 전송 - 2 : 안녕하세요
		for(int i = 1; i <= count; i++) {
			System.out.println("메시지 전송 - " + i + " : " + msg);
			
			try {
				// 현재 쓰레드를 잠시 딜레이시키는 기능(재우는 기능)
				// => Thread 클래스의 static 메서드 sleep() 메서드 호출
				Thread.sleep(500); // 500ms = 0.5초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}




// ------------------------------------------------------------
/*
 * 파일 전송 클래스
 * 1. 싱글쓰레드로 구현
 * - class명 : FileTransfer
 * - 멤버변수 : 파일명(fileName, 문자열), 카운트(count, 정수형)
 * - 파라미터 생성자(String, int)
 * - run()메서드 : 리턴값 없음, 파라미터 없음, count 만큼 fileName 출력
 *   ex) 파일 전송 - 1 : a.java
 *       파일 전송 - 2 : a.java
 */
class FileTransfer {
	String fileName; // 파일명 저장 변수
	int count; // 카운트 저장 변수
	
	public FileTransfer(String fileName, int count) {
		super();
		this.fileName = fileName;
		this.count = count;
	}
	
	public void run() {
		// count 횟수 만큼 fileName 문자열을 화면에 출력하는 반복문 작성
		//  ex) 파일 전송 - 1 : a.java
		//      파일 전송 - 2 : a.java
		for(int i = 1; i <= count; i++) {
			System.out.println("파일 전송 - " + i + " : " + fileName);
		}
	}
	
}

/*
 * 멀티쓰레드로 구현
 * - class명 : FileTransferMultiThread, Thread 클래스 상속
 * - 멤버변수 : 파일명(fileName, 문자열), 카운트(count, 정수형)
 * - 파라미터 생성자(String, int)
 * - run() 메서드 오버라이딩
 */
class FileTransferMultiThread extends Thread {
	String fileName;
	int count;
	
	public FileTransferMultiThread(String fileName, int count) {
		super();
		this.fileName = fileName;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티쓰레딩으로 처리할 작업을 기술
		// count 횟수 만큼 fileName 문자열을 화면에 출력하는 반복문 작성
		//  ex) 파일 전송 - 1 : a.java
		//      파일 전송 - 2 : a.java
		for(int i = 1; i <= count; i++) {
			System.out.println("파일 전송 - " + i + " : " + fileName);
			
			try {
				// 현재 쓰레드를 잠시 딜레이시키는 기능(재우는 기능)
				// => Thread 클래스의 static 메서드 sleep() 메서드 호출
				Thread.sleep(500); // 500ms = 0.5초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// ------------------------------------------------------------
/*
 * 메시지 수신 클래스
 * - 멀티쓰레드로 구현
 * - class명 : ReceiveMessageMultiThread
 *   => 단, Thread 클래스를 상속받지 않고 Runnable 인터페이스로 구현
 *   => Object 클래스를 상속받음
 * - 멤버변수 : 메시지(msg, 문자열), 카운트(count, 정수형)
 * - 파라미터 생성자(String, int)
 * - run() 메서드 오버라이딩
 */

class ReceiveMessageMultiThread extends Object implements Runnable {
	String msg;
	int count;
	
	public ReceiveMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티쓰레딩으로 처리할 작업을 기술
		// count 횟수 만큼 msg 문자열을 화면에 출력하는 반복문 작성
		//  ex) 메시지 수신 - 1 : 안녕하세요
		//      메시지 수신 - 2 : 안녕하세요
		for(int i = 1; i <= count; i++) {
			System.out.println("메시지 수신 - " + i + " : " + msg);
			
			try {
				// 현재 쓰레드를 잠시 딜레이시키는 기능(재우는 기능)
				// => Thread 클래스의 static 메서드 sleep() 메서드 호출
				Thread.sleep(500); // 500ms = 0.5초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}







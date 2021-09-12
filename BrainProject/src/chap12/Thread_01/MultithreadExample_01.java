package chap12.Thread_01;   // 09-09 스레드

public class MultithreadExample_01 {

	public static void main(String[] args) {    // main스레드
		new DigitThread();   // 객체생성
		Thread thread=new DigitThread();
//		thread.run();   
		thread.start();   // 이상태로 run 호출 (동시 호출①,②) ==> 톰캣 마다 값이 다름
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);                //(동시 호출①,②)
		try {                                    // for문 안에 넣어야함
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
//	public static void run(String[] args) {
//		
//		
//	}

}

class DigitThread extends Thread{   // 스레드를 상속 받은 일반 클래스 DigitThread
	
	public void run() {                          // run메소드
		for(int cnt=0;cnt<10;cnt++) 
			System.out.print(cnt);               //(동시 호출①,②)
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}


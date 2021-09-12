package chap12.Thread_01;   // 스레드 2개 돌아감

class DerivedThread extends Thread{
	public void run() {
		for(int i=0;i<50;i++)
			System.out.print(i+"\t");
	}
}

public class MultithreadExample_02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread d=new DerivedThread();
		d.start();
		System.out.println("프로그램 종료");   
		// 누가 먼저 끝나냐는 우리가 정하는게 아님
	}

}

// 스레드는 하나가 끝났다 해서 다 끝나는게 아닌
// 전체적으로 다 끝나야 끝난것

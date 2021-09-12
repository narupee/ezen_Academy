package chap12.Thread_01;

import java.awt.Frame;

class CalcThread extends Thread {
    SharedArea sharedArea; // SharedArea를 사용하겠다는 선언

    public void run() {
        double total = 0.0;
        for(int cnt = 1;cnt<10000;cnt+=2)
            if(cnt/2%2 == 0)
                total +=1.0/cnt;
            else
                total-=1.0/cnt;
        
        sharedArea.result = total*4;
        sharedArea.isReady = true;  // 값을 주고 트루를 줌
    }
}

class SharedArea {
    double result;
    boolean isReady;   // default 디폴트값: false( 트루가 아니면 폴스 유지)
}

class PrintThread extends Thread{   // Thread 얘도 상속받음
	SharedArea sharedArea;   //  double result; 여기서 가져와서 출력함
	
	public void run() {
		while(sharedArea.isReady != true)
			continue;  // 트루값을 가져올때까지 무한루프로 돌다가 트루나오면 끝남!   // 얘 좋은방법이 아닌 아이임 ~
		System.out.println(sharedArea.result); 
	}
}

public class MutithreadExample_07 {

	public static void main(String[] args) {
        CalcThread thread1 = new CalcThread();
        PrintThread thread2 = new PrintThread();
        SharedArea obj = new SharedArea();

        thread1.sharedArea = obj;
        thread2.sharedArea = obj;

        thread1.start();
        thread2.start();
		
	}
}



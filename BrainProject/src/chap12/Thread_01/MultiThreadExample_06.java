package chap12.Thread_01;   // 09-10

import java.awt.Frame;

class SoloFrame extends Frame{  //Frame을 만드는 솔로플레임

    public SoloFrame() {
    	SoloThread t=new SoloThread(this); // 다른 클래스 객체화 할 수 있다
    	t.start();
    }
}

class SoloThread extends Thread{
    private Frame f=null;         // 참조변수 선언

    public SoloThread(Frame f) {
        this.f=f;
    }

    public void run() {
        int i=0;
        System.out.println("스레드 시작");
        while(i<20) {
            System.out.print(i+"\t");
            f.setTitle("스레드 동작중 "+i++);
            try {
                this.sleep(300);
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("스레드 종료");
    }//여기 런 종료~
}

public class MultiThreadExample_06 {

    public static void main(String[] args) {
        SoloFrame s=new SoloFrame();
        s.setSize(300,100);
        s.setVisible(true);
        
    }

}



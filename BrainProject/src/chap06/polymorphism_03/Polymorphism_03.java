package chap06.polymorphism_03;

class A7 {
	private int x = 100;
	private int y = 200;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("x=" + x + ",y=" + y);
	}
}

class B7 extends A7 {
	int y = 300;
	private int z = 400;

	public void setY(int y) {  // super.setY(y); 가 오버라이딩 
		super.setY(y);     // 범수랑 공부하다 풀음! --> y=2  // A7의 y값 대입
//		this.y = y;        // 맨마지막 톰캣 값 --> y=200    // B7의 y값 대입
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void disp() {
		super.disp();   // 부모한테있는거 호출~~~
		System.out.println("y=" + y + ",z=" + z);
	}

}

public class Polymorphism_03 {

	public static void main(String[] args) {

		A7 ap = new B7();
		// System.out.println("ap.y=" + ap.y); private이면 접근 불가
		ap.disp();
		System.out.println();
		ap.setX(1);
		ap.disp();
		System.out.println();
		ap.setY(2);
		ap.disp();
		
	}
}












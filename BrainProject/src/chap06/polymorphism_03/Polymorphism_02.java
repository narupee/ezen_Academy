package chap06.polymorphism_03;

class A4 {
	int x = 100;

	public void a4() {

	}
}

class B4 extends A4 {
	int y = 200;

	public void a4() {
		System.out.println("y=" + y);
	}
}

public class Polymorphism_02 {

	public static void main(String[] args) {
		// B4 ap = new B4();
		// System.out.println("x=" + ap.x);
		// System.out.println("y=" + ap.y);

		A4 ap = new B4();
		System.out.println("x=" + ap.x);
		// System.out.println("y=" + ap.y); // 부모 클래스에 없기 때문에 에러
		ap.a4();
	}

}





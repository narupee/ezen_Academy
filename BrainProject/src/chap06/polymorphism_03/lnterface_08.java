package chap06.polymorphism_03;

interface A1{   // 인터페이스에 선언된 필드
	int w=10;
	static int x=20;   // 인터페이스도 필드값을 가질 수 있다
	final int y=30;
	public static final int z=40;   // 기본
	
}

public class lnterface_08 {

	public static void main(String[] args) {
//		A1 ap=new A1(); // 객체생성 불가(뒤에 A1 에러남)
//		A1.w=100; // 값을 바꿀려고 해도 w 에러남
		System.out.println("w="+A1.w);
		System.out.println("x="+A1.x);
		System.out.println("y="+A1.y);
		System.out.println("z="+A1.z); 
		// 인터페이스 이름으로 접근하는건 됨

	}

}

package chap06.Inheritance_01;

class C1{   // C1: 클래스 
	static int x;
	static int y;
}

class C2 extends C1{
	static String x;
}

public class InheritanceTest_07 {

	public static void main(String[] args) {
		C2.x="홍길동";
		C1.x=30000;
		C1.y=20000;   //클래스이름을 적으면 가능하다
		
		System.out.println("클래스 변수 C2.x값: "+C2.x);
		System.out.println("클래스 변수 C2.y값(C1으로부터 상속): "+C2.y);
		System.out.println("클래스 변수 C1.x값: "+C1.x);
		
		
	}
}

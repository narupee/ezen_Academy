package chap06.Inheritance_01;

class B1{
	int x;
}

class B2 extends B1{   // 오버로딩
	String x;   // 변수 이름이 같을 경우 상위 클래스 객체변수 x가 가려짐
}

public class Inheritance_06 {   // 오버라이딩
	public static void main(String[] args) {
		B2 b2=new B2();
		b2.x="홍길동";
		System.out.println("객체 b2에 들어있는 값: "+b2.x);
		
		B1 b1=new B1();
		b1.x=5000;
		System.out.println("객체 b1에 들어있는 값: "+b1.x);
	}
}

package chap06.Inheritance_01; // 09-03 상속

class A{              //할아버지 //부모클래스  // 객체생성 
	int aa=1;
}
class B extends A{    //아버지
	int bb=2;
}
class C extends B{    //아들 //자식클래스( 자식은 부모껄 다 쓸 수 있다 )
	int cc=3;
}

public class InheritanceTest_01 {
	
	public static void main(String[] args) {
		C objc=new C();
		System.out.println("objc객체의 객체 속성 변수 aa의 값은"+objc.aa);   //
		System.out.println("objc객체의 객체 속성 변수 bb의 값은"+objc.bb);
		System.out.println("objc객체의 객체 속성 변수 cc의 값은"+objc.cc);
		
	}

}

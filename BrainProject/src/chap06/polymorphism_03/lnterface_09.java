package chap06.polymorphism_03;

interface A2{
	void aaa();  // 생략을 했더라도 얘도 public abstract void aaa(); 얘다!
	public abstract void bbb();
}

class B2 implements A2{
	public void aaa() {   // 추상메서드 오버라이딩 해줌
		System.out.println("aaa메서드");
	}
	public void bbb() {
		System.out.println("bbb메서드");
	}
}

public class lnterface_09 {
	
	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();
		
		
	}

}

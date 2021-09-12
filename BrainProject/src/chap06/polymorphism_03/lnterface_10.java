package chap06.polymorphism_03;

 class A{
	 
	 void autoPlay(I i) {   // I i=new B(); 란 얘기임
		 i.play();
	 }
 }

 interface I{
	 public abstract void play();
 }
 
 class B implements I{
	 public void play() {
		 System.out.println("play in B class");
	 }
 }
 
 class C implements I{
	 public void play() {
		 System.out.println("play in C class");
	 }
 }
 
public class lnterface_10 {

	public static void main(String[] args) {
		A a=new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
		
	}

}

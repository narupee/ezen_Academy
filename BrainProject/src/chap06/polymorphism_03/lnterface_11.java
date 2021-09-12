package chap06.polymorphism_03;

class A3 {
	
	void methodA() {
		I2 i=InstanceManager.getInstance();   // static 때문에 . 으로 바로 호출가능한것   // I i=new B();
		i.methodB();
	}
}

interface I2 {
	
	public abstract void methodB();
}

class B3 implements I2{
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager {
	public static I2 getInstance() {
		return new B3();
	}
}

public class lnterface_11 {

	public static void main(String[] args) {
		A3 a=new A3();
		a.methodA();
		
		
	}
}

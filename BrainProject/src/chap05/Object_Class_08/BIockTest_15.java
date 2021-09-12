package chap05.Object_Class_08; //08-27

public class BIockTest_15 {

	static {
		System.out.println("static{}");
	} // 먼저 초기화 실행됨
	
	public BIockTest_15() {
		System.out.println("생성자");
	} // 생성자 각각 호출됨
	
	public static void main(String[] args) {   // 객체가 만들어 질때 각각 생성자가 실행 된 것이므로 별개 
		System.out.println("BIockTest_15 bt=new BIockTest_15();");
		BIockTest_15 bT=new BIockTest_15();
	
		System.out.println("BIockTest_15 bt2=new BIockTest_15();");
		BIockTest_15 bT2=new BIockTest_15();
		
    }
	
}

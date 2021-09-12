package chap05.Object_Class_08;

class Accumulator {
	
	int total=0;
	static int grandTotal=0; // 스태틱이라서 공유됨 무려 그랜드토탈
	
	void accumulate(int amount) {
		total=amount;
		grandTotal+=amount;
		
	}
}

public class StaticFieldExample_08 {
	
	public static void main(String[] args) {
		Accumulator obj1=new Accumulator();
		Accumulator obj2=new Accumulator();
		
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj1.grandTotal="+obj1.grandTotal);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("obj2.grandTotal="+obj2.grandTotal);
		
	}
}

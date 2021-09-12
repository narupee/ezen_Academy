package chap05.Object_Class_08; //08-26

class Accmulator2{
	int total=0;
	static int grandTotal=0;
	
	void accmulate(int amount) {
		total+=amount;
		grandTotal+=amount;
	}
	
	public static int getGrandTotal(){
		
		return grandTotal;
	}
}

public class StaticmethodExample_12 {
	
	public static void main(String[] args) {
		Accmulator2 obj1=new Accmulator2();
		Accmulator2 obj2=new Accmulator2();
		
		obj1.accmulate(10);
		obj2.accmulate(20);
		int grandTotal=Accmulator2.getGrandTotal();
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("총계="+grandTotal);
		
	}

}

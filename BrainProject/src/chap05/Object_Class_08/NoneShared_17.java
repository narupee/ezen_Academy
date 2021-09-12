package chap05.Object_Class_08;

class Count {
	int number = 3;
}

public class NoneShared_17 {

	public static void main(String[] args) {
		Count c1 = new Count();
		System.out.println("c1.number=" + c1.number);
		c1.number++;
		System.out.println("c1.number=" + c1.number);

		Count c2 = new Count();
		System.out.println("c2.number=" + c2.number);
		c2.number++;
		System.out.println("c2.number=" + c2.number);
	}
}
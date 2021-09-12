package chap05.Object_Class_08;

class StaticCount {
	static int number = 3;
}

public class Shared_18 {

	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("c1.number=" + sc1.number);
		sc1.number++;
		System.out.println("c1.number=" + sc1.number);

		StaticCount sc2 = new StaticCount();
		System.out.println("c2.number=" + sc2.number);
		sc2.number++;
		System.out.println("c2.number=" + sc2.number);
	}
}

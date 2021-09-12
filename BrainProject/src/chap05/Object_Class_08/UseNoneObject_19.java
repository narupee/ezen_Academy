package chap05.Object_Class_08;

class NoneObject {
	static int number = 3;

	public static void printnumber() {
		System.out.println("number=" + number);
	}
}

public class UseNoneObject_19 {

	public static void main(String[] args) {
		NoneObject no = new NoneObject(); // 객체 생성
		System.out.println("no.number=" + no.number);
		no.printnumber();

		System.out.println("NoneObject.number=" + NoneObject.number); // 클래스로 접근
		NoneObject.printnumber();
	}
}
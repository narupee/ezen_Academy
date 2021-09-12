package chap10.WrapperClass_01;

public class WrapperExample_06 {
	
	public static void main(String[] args) {
		printDouble(new Double(123.45));  // 객체 만듬
		printDouble(123.45);  // auto boxing --> 내부적으로 받아옴 위에꺼에서
		
	}
	
	public static void printDouble(Double obj) {   
	// printDouble: 메소드 (Double: 매개변수) // static 위에꺼 호출
	// obj 로 넘겨진 값: 123.45
		
		System.out.println(obj);
	}
}



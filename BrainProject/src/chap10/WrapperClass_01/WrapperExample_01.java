package chap10.WrapperClass_01;   //09-08 래퍼(포장)클래스 -> 

public class WrapperExample_01 {

	public static void main(String[] args) {
		Integer obj1=new Integer(12); // (Int)정수형을 담을 수 있는 래퍼클래스  // 래퍼에 들어 있는 값 --> 12
		Integer obj2=new Integer(7);  // 변수 --> obj1, obj2
		
		int sum=obj1.intValue()+obj2.intValue();   // intValue : 값을 꺼내옴  // 래퍼 값 꺼내왔으니 19
		
		System.out.println("꺼내온 래퍼 값은: "+sum);
		
	}
}

// Integer(인티저) : int(정수) 


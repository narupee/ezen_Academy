package chap10.WrapperClass_01;

public class BoxingUnboxing_04 {

	public static void main(String[] args) {
		Integer iValue=new Integer(10);  // boxing
		Double dValue=new Double(3.14);
		
		System.out.println(iValue);         // 10
		System.out.println(dValue);         // 3.14
		// 래퍼클래스에서는 실제 들어 있는 값을 보여줌
		
		iValue=new Integer(iValue.intValue()+10);    // 20     // unboxing (자동언박싱:가져옴)
		dValue=new Double(dValue.doubleValue()+1.2); // 4.34
		 // 꺼내 온 값에 new로 새로운 객체 생성 후 새로운 값을 더함 
		
		System.out.println(iValue);
		
		System.out.println(dValue); 
		
	}
}



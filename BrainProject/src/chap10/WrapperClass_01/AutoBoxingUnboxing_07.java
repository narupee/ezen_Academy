package chap10.WrapperClass_01;

public class AutoBoxingUnboxing_07 {

	public static void main(String[] args) {
		Integer iValue=10;  // auto boxing
		Double dValue=3.14;
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1=iValue;    // auto unboxing
		double num2=dValue;
		
		System.out.println(iValue);
		System.out.println(dValue);

	}

}

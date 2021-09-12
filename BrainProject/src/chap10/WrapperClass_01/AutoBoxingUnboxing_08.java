package chap10.WrapperClass_01;

public class AutoBoxingUnboxing_08 {

	public static void main(String[] args) {
		Integer num1=10;
		Integer num2=20;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1++;  //
		
		// num1=new Integer(num1.intValue()+1);
		System.out.println(num1);
		
		num2+=3;
		// num2=new Integer(num2.intValue()+3);
		
		int addResult=num1+num2;
		System.out.println(addResult);
		
		int minResult=num1-num2;
		System.out.println(minResult);
	}

}

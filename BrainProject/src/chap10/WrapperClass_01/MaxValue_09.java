package chap10.WrapperClass_01;

public class MaxValue_09 {
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage:java MaxValue<정수1><정수2>");
			
			return;
		}
		
		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]); //
			if(num1>num2)
				System.out.println(num1);
			else 
				System.out.println(num2);
		}catch(NumberFormatException e) {
			System.out.println("Usage:java MaxValue<정수1><정수2>");
		
		}
		
	}
		
}

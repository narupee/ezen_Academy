package kr.co.ezen.operator;

public class C_Arithmetic {

	public void method1() {
		int num1=10;
		int num2=3;
		
		System.out.println("num1+num2="+(num1+num2));
		System.out.println("num1+num2="+(num1-num2));
		System.out.println("num1+num2="+(num1*num2));
		
		System.out.println("num/num2="+(num1/num2));
		System.out.println("num1%num2="+(num1%num2));
		
		// 값 %배수 == 0
		// 짝수 ==> 값%2 == 0 or 값%2 != 1
		// 홀수 ==> 값%2 == 1 or 값%2 != 0
	}
	
	public void method2() {
		double a=35;
		double b=10;
		
		double add=a+b;
		double sub=a-b;
		double mul=a*b;
		double div=a/b;
		double mod=a%b;
		
		System.out.println("add="+add);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
		System.out.println("mod="+mod);
		
		int c=27;
		System.out.println("c="+c);
		
		double result=a + a * b % c - a / b;
		// 1.  a*b==>350.0
		// 2.  350.0%c(27)==>26.0
		// 3.  a/b==>3.5;
		// 4.  35.0+26.0-3.5==>57.5
		System.out.println("result="+result);
	}
	
	public void method3() {
		int a=5;
		int b=10;
		
		int c=(++a)+b; // 6+10 ==> c=16 a=6
		int d=c/a; // 16/6 ==> d=2
		int e=c%a; // 16%6 ==> e=4
		int f=e++; // f=4 e=5
		int g=(--b)+(d--); // 9+2 ==> g=11 d=1
		int h=2;
		int i=a++ +b/(--c/f)*(g-- -d)%(++e +h);
		// 6+9/(15/4)*(11-1)%(6+2)
		// i=12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("h="+h);
		System.out.println("i="+i);
		
	}
	
}












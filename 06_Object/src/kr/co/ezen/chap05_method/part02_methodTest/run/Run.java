package kr.co.ezen.chap05_method.part02_methodTest.run;

import kr.co.ezen.chap05_method.part02_methodTest.NonStaticMethod;
import kr.co.ezen.chap05_method.part02_methodTest.StaticMethod;

public class Run {
	
	public static void main(String[] args) {
		NonStaticMethod nm=new NonStaticMethod();
		nm.method1();
		
//		String result=nm.method2();
//		System.out.println(result);
		System.out.println(nm.method2());
		
		nm.method3(10,20);
		
		int result=nm.method4(10, 20);
		System.out.println("result="+result);
		
		System.out.println("result="+nm.method4(10, 20));
		
		StaticMethod.staticMethod1();
		int result1=StaticMethod.staticMethod2();
		System.out.println("10과 30의 합은"+result1);
		
		System.out.println("10과 30의 합은"+StaticMethod.staticMethod2());   // 방법이 다름을 보여줄려고 한것!
		
		StaticMethod.staticMethod3("홍길동");
		
		System.out.println(StaticMethod.staticmethod4("홍길동"));
		
	}

}

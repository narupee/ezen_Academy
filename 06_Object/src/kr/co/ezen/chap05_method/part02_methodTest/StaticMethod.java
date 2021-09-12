package kr.co.ezen.chap05_method.part02_methodTest;

import java.net.Inet4Address;

public class StaticMethod {
	// 공통점은 다 static 이다!
	public static void staticMethod1() {
		int num1=10;
		int num2=20;
		
		System.out.println("10과 20의 합은"+(num1+num2)+"입니다.");
	}
	
	public static int staticMethod2() {
		int num1=10;
		int num2=30;
		
		return num1+num2;
	}
	
	public static void staticMethod3(String name) {     // 매개변수 void
		System.out.println(name+"님의 방문을 환영합니다.");
	}
	
	public static String staticmethod4(String name) {   // 매개변수 String 얘는 반환함
		return name+"님의 방문을 환영합니다.";
	}
}

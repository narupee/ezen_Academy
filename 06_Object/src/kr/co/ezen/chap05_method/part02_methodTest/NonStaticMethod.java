package kr.co.ezen.chap05_method.part02_methodTest;

public class NonStaticMethod {   

	public void method1() {
		System.out.println("매개 변수와 반환 값이 둘다 없는 메서드입니다.");
	}
	
	public String method2() {
		return "매개 변수가 없지만 반환 값이 있는 메서드 입니다.";
	}
	
	public void method3(int num1, int num2) {   // 매개변수가 있음! 계산함! 반환없음
		int minus=num1-num2;
		System.out.println("minus="+minus);
	}
	
	public int method4(int num1, int num2) {   // 매개변수, 반환 있음
		return num1+num2;
	}
}


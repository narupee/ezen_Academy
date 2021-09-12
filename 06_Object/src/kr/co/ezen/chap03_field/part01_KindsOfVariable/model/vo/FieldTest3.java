package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class FieldTest3 {
	private final int NUM; // final은 반드시 초기화
	private static final int STATIC_NUM = 1;
	
	public FieldTest3() {
		this.NUM = 10;
	}
	
	public void nonStaticMethod() {
		// static int localStaticNum; // nonStaticMethod는 객체 생성을 해야 쓸 수 있는데 static은 별도의 공간에서 객체 생성과 상관없이 쓰는 것이기 때문에 이렇게 쓸 수 없다.
	}
	
	public static void staticMethod() {
		// static int localStaticNum; // static 메서드에 지역 변수는 만들어질 수 없다.
	}
	
	public int getNUM() { // 반환 타입
		return NUM;
	}
	
	/*
	public void setNUM(int num) {
		this.NUM = num; // final은 고정이기 때문에 값을 줄 수 없다. 
	}
	*/
	
	public static int getStaticNum() { 
		return STATIC_NUM; // 메서드가 static - 변수 static 
	}
}
package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class FieldTest1 {
	private int global; // field, global variable 필드이면서 전역 변수
	
	public void testMode(int num) {
		int local=11;
		                         // 실행하고 나온 답
		System.out.println(num); // 10
		
		System.out.println(local+num); // 21
		
		System.out.println(global); // 0
		
	}
}

package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class Stest01 {
	public static int i = 30;

	public void method1() {
		System.out.println(">> 현재" + i + "개 남았습니다.");
	}

	public void method2(int num) {
		System.out.println(">>>>> 상품을" + num + "개 구매합니다.");
		i -= num;
	}
}

package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class Stest02 {

	public void method2(int num) {
		System.out.println(">>>>> 해외에서 상품을" + num + "개 구매합니다.");
		Stest01.i -= num;
	}
}
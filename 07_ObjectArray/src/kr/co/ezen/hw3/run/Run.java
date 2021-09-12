package kr.co.ezen.hw3.run; //09-02

import kr.co.ezen.hw3.controller.ProductController;

public class Run {
	
	public static void main(String[] args) {  // 객체는 항상 main에 만들어짐!
		
		new ProductController().mainMenu();
		//객체 생성과 동시에 메소드를 호출 하는 것! 이럼 변수 없어도 됨
		
	}
}

package kr.co.ezen.silsub6.run;

import kr.co.ezen.silsub6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book bk1 = new Book();
		System.out.println(bk1.information());

		Book bk2 = new Book("자바의 기본", "EZEN 출판사", "강홍길");
		System.out.println(bk2.information());

		Book bk3 = new Book("C언어의 표준", "뿌리", "홍수민", 25000, 4.0);
		System.out.println(bk3.information());
	}

}
package kr.co.ezen.chap03_field.patr02_initBlock.run;

import kr.co.ezen.chap03_field.patr02_initBlock.model.vo.Product;

public class run {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.information());

		Product p2 = new Product("아이스 아메리카노", 3000, "7그램");
		System.out.println(p2.information());

		Product p3 = new Product("따뜻한 아메리카노", 4000);
		System.out.println(p3.information());
	}

}

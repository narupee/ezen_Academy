package kr.co.ezen.chap03_field.part01_KindsOfVariable.run;

import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.FieldTest1;
import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.FieldTest2;
import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.Stest01;
import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.Stest02;

public class Run {
	
	public static void main(String[] args) {
		Book bk1=new Book();
		bk1.setTitle("Java Standard");
		bk1.setAuthor("가영");
		bk1.setPrice(30000);
		Book.setStock(Book.getStock()+1);
		System.out.println(bk1.information());
		
		Book bk2=new Book();
		bk2.setTitle("Java Standard2");
		bk2.setAuthor("가영");
		bk2.setPrice(35000);
		Book.setStock(Book.getStock()+20);
		System.out.println(bk2.information());
		
		Book.setStock(15);
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.testMode(10);
		*/
		
		/*
		FieldTest2 f2 = new FieldTest2();
		System.out.println((f2.pubA));
		System.out.println("변경전:" + f2.getPubA());
		f2.setPubA("내가바꿈");
		System.out.println("변경후:" + f2.getPubA());
		
		// default: 같은 패키지 내에서만 접근 가능
		// System.out.println(f2.defB);
		f2.setDefB("나도바꿈");
		System.out.println("변경후:" + f2.getDefB());

		// private: 같은 클래스 내에서만 접근 가능
		// System.out.println(f2.priC);
		System.out.println(f2.getPriC());
		
		System.out.println(FieldTest2.pubSta); // 클래스 이름으로 바로 접근
		// System.out.println(FieldTest2.priSta);
		System.out.println(FieldTest2.getPriSta());
		FieldTest2.setPriSta("private2");
		System.out.println(FieldTest2.getPriSta());
		*/
		
		Stest01 st = new Stest01();
		Stest02 st2 = new Stest02();
		
		System.out.println("총 구매가능 개수는 " + Stest01.i + "입니다.");
		
		st.method1();
		st.method2(5);
		st.method1();
		st.method2(1);
		st.method1();
		st2.method2(9);
		st.method1();
	}

}


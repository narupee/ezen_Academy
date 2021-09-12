package kr.co.ezen.chap04_constructor.run;

import kr.co.ezen.chap04_constructor.mode.vo.ThisConstructor;

public class Run {

	public static void main(String[] args) {
		ThisConstructor ts = new ThisConstructor();
		System.out.println(ts);

		ThisConstructor ts1 = new ThisConstructor("Java Basic", 35000, 1);
		System.out.println(ts1.getBookName() + "|"
				+ ts1.getBookprice() + "|"
				+ ts1.getBookid() + "|"
				+ ts1.getBookpublisher());
	}

}

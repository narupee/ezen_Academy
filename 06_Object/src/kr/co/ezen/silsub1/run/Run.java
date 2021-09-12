package kr.co.ezen.silsub1.run;

import kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo.Book;
import kr.co.ezen.chap04_constructor.mode.vo.ThisConstructor;
import kr.co.ezen.silsub1.model.vo.Member.Member;

public class Run {

	public static void main(String[] args) {
		Member me=new Member();
		
		 me.setMemberId("gaga12");
		 me.setMemberPwd("qwe1234");
		 me.setMemberName("가영");
		 me.setAge("20");
		 me.setGender('여');
		 me.setPhone("010-123-1234567");
		 me.setEmail("ga12@naver.com");
		 
	System.out.println(me.getMemberId());
	System.out.println(me.getMemberPwd());
	System.out.println(me.getMemberName());
	System.out.println(me.getAge());
	System.out.println(me.getGender());
	System.out.println(me.getPhone());
	System.out.println(me.getEmail());
		
	}
}


/* 실행답
gaga12
qwe1234
가영
20
여
010-123-1234567
ga12@naver.com
*/
package chap05.Object_Class_04;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConstrExample2 {

	public static void main(String[] args) {
		Subscriberlnfo obj1, obj2;
		obj1=new Subscriberlnfo("연흥부","poorman","zebi");
		obj2=new Subscriberlnfo("연놀부", "richman", "money","02-000-0000","타워팰리스");
		
		/*
		System.out.println("이름: "+obj1.name);
		System.out.println("아이디: "+obj1.id);
		System.out.println("패스워드: "+obj1.password);
		System.out.println("전화번호: "+obj1.phoneNo);
		System.out.println("주소: "+obj1.address);
		
		System.out.println();
		
		System.out.println("이름: "+obj2.name);
		System.out.println("아이디: "+obj2.id);
		System.out.println("패스워드: "+obj2.password);
		System.out.println("전화번호: "+obj2.phoneNo);
		System.out.println("주소: "+obj2.address);
		*/
		
		/* 실행답
		이름: 연흥부
		아이디: poorman
		패스워드: zebi
		전화번호: null
		주소: null      
		// null 이 출력되는 이유: 1-2 초기화 값이 String 이고 값이 없기 때문에 null이  출력됨 

		이름: 연놀부
		아이디: richman
		패스워드: money
		전화번호: 02-000-0000
		주소: 타워팰리스     
		// 2-1 5개의 해당 값을 다받음!
		*/             
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}
//	 	메서드 안에 메서드가 들어가서 오류 나니까 메서드 끼리는 분리가 돼야함! ( 하나의 클래스에 메서드 처럼 분리가 되야함! )
		public static void printSubscriberInfo(Subscriberlnfo obj) { // 연놀부,연흥부 다 처리 되야하며 메서드() 안에 메서드가 들어가야함!
			System.out.println("이름: "+obj.name);
			System.out.println("아이디: "+obj.id);
			System.out.println("패스워드: "+obj.password);
			System.out.println("전화번호: "+obj.phoneNo);
			System.out.println("주소: "+obj.address);
			System.out.println();
			
		
		
	}
}






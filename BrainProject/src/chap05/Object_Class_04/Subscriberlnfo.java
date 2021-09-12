package chap05.Object_Class_04;

public class Subscriberlnfo {
	String name,id,password;                                // 초기화 1-2
	String phoneNo,address;
	String Subscriberlnfoobj1,Subscriberlnfoobj2;
	
	Subscriberlnfo(String name,String id,String password) { // '매개 변수' 받고 1-1 ( 3개 값 받음 )
		// ☆☆☆ 1-2를 초기화 하기위해서 1-1 이름을 만든것!
		// 가독성을 위해 메개변수 와 초기화를 동일하게 함! ( 뜻; 자기 자신을 초기화 (this. 를 붙여야함, 뜻하는건 this는 클래스(Subscriderlnfo)를 얘기함 )
		this.name= name;                                         
		this.id=id;
		this.password=password;
		
	}
	
	Subscriberlnfo(String name,String id,String password, String phoneNo, String address) { // 2-1 ( 5개 값 받음 )
		this.name= name;                                         
		this.id=id;
		this.password=password;
		this.phoneNo=phoneNo;
		this.address=address;
	}
	
	void changePasswoed(String password) { // 패스워드를 바꾸는 '메서드'
		this.password=password;
	}
	// set메서드 : 한꺼번에 값을 저장하는 것
	// get메서드 : 한꺼번에 값을 가져오는 것
	void setphoneNo(String phoneNo) { 
		this.phoneNo=phoneNo;//
	}
	
	void setaddress(String address) {
		this.address=address;
	}
	
}

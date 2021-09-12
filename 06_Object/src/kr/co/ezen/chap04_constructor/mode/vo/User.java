package kr.co.ezen.chap04_constructor.mode.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;   // Date: 날짜 클래스

	public User() {   // 기본생성자

	}

	public User(String userId, String userPwd, String userName) {   // 매개변수  // (변수명(: userId )은 저장)
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
	}
	/*
	public User(String id, String pwd, String name, Date date) {   // 매개변수   // 초기화 되는건 똑같
		userId=id;
		userPwd=pwd;
		userName=name;
		enrollDate=date;   
		// new User("edu", "123", "홍"); 
	}
	*/
	
	public User(String id, String pwd, String name, Date date) {
		//userId=id;
		//userPwd=pwd;
		//userName=name;
		this(id,pwd,name);   // 위에 초기화를 하였고 여기에서는 enro 때문에 걍 this로 단축해서 ㄱㄱ하면 됌
		enrollDate=date;   
		
	}
}

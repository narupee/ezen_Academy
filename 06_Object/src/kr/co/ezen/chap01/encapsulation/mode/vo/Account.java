package kr.co.ezen.chap01.encapsulation.mode.vo;

public class Account {
	String name= "홍길동";
//	String accNo= "110-1121-13123";
//	String pwd= "1234";
//	int backCode= 20;
	public int balance= 0;         // 잔액
	
	public Account(int balance) {
		this.balance=balance;
		
	}
	
	public void deposit(int i) {   // 입금
		balance += i;
		System.out.println(name+"님의 계좌에"+i+"원이 입금 되었습니다.");
		displayBalance();   // 잔액 부분 출력되게 하는거!
		
	}
	
	public int withdraw(int money) {   // 출금
		if(balance < money)
			return 0;
		balance -= money;
		System.out.println(name+"님의 계좌에"+money+"원이 출금 되었습니다.");
		displayBalance();
		return money;
		
	}
	
	public void displayBalance() {   // 잔액조회
		System.out.println(name+"님의 계좌 잔액은"+balance+"입니다.");
		
	}

}





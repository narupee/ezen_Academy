package chap05.Object_Class_08;

public class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance;       // 잔액

	Account(String accountNo, String ownerName, int blance) {   
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=blance;
	}
	
	void deposit(int amount) {   // 예금
		balance += amount;
	}
	
	int withraw(int amount)throws Exception {   // 출금      ,  throws Exception: 문법 (예외처리 하는 방법)
		if(balance<amount)
			throw new Exception("잔액이 부족합니다.");  // throws로 예외를  호출한곳으로 던진다
		balance -= amount;
		
		return amount;
	}
  }


	
	
	
	
	
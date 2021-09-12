package chap05.Object_Class_07;

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
	
	int withraw(int amount) {   // 출금
		if(balance<amount)
			return 0;
		balance -= amount;
		return amount;
	}
  }


	
	
	
	
	
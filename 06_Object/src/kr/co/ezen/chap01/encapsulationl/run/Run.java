package kr.co.ezen.chap01.encapsulationl.run;

import kr.co.ezen.chap01.encapsulation.mode.vo.Account;

public class Run {

	public static void main(String[] args) {
		Account obj=new Account(0);
		
		obj.displayBalance();   // 잔액
		obj.deposit(100000);    // 입금
		obj.deposit(250000); 
		obj.deposit(300000); 
		obj.withdraw(50000);    // 출금 (금액적어야함) 
		
		
		
	}
}

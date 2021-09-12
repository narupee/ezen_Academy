package chap06.Inheritance_02;  // 09-06
// abstract(앱스트뤨트)
// 추상 클래스(abstract class)는 인스턴스의 생성(객체생성)이 불가능 , 일반적인 클래스도 abstract 얘가 붙으면 똑같이 불가
abstract class Account{   // final class Account : 상속불가 //InheritanceExample_02 에서 가져옴! 
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;   
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {   // final void deposit(int amount) : 오버라이딩 금지
		balance+=amount;
	}

	int withdraw(int amount)throws Exception{
		if(balance<amount)
			throw new Exception("잔액이 부족합니다.");   // 내가 직접 Exception 을 만듬
		balance-=amount;
		return amount;
	}
}

public class InheritanceExmaple_01 {

	public static void main(String[] args) {
//		Account obj=new Account("111-222-3333", "임꺽정", 0);
//		System.out.println(obj.balance);     // 추상 클래스(abstract class)는 인스턴스의 생성(객체생성)이 불가능 그래서 여기 주석처리됨
	}

}

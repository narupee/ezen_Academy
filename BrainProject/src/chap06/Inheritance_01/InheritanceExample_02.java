package chap06.Inheritance_01;
// 부모 :초기화 담당
// 자식 : 만들어주는 담당
// 모든 객체는 생성자가 있어야함 그래야 작동
class Account{   // final class Account : 상속불가
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

class CheckingAccount extends Account{    //자식클래스 //체크카드만드는것!
	String cardNo;
	
	CheckingAccount(String accountNo,String ownerName,int balance,String cardNo) { //자식 객체생성
		super(accountNo, ownerName, balance);
//		super(); //부모 생성자 호출
//		this.accountNo=accountNo;   // 부모꺼에 있는걸 가져옴 왜!? 내꺼임!
//		this.ownerName=ownerName;
//		this.balance=balance;
		this.cardNo=cardNo;
	}
	
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance < amount))  {
//         ㄴ 카드번호가 같지 않거나                     ||   ㄴ 잔액이 부족하거나  ==> 둘중 하나라도 참이냐! 의 조건 
			throw new Exception("지불이 불가능 합니다.");
		}
		return withdraw(amount);     // withdraw(위드드로우): 출금
	}
}

public class InheritanceExample_02 {
	
	public static void main(String[] args) {
		/*
		CheckingAccount obj=new CheckingAccount();
		obj.accountNo="111-22-33333";
		obj.ownerName="홍길동";
		obj.cardNo="555-666-777-8888";
		*/
		CheckingAccount obj=new CheckingAccount("111-22-33333", "홍길동", 0, "555-666-777-8888");
		obj.deposit(100000);
		
		try {
			int paidAmount=obj.pay("555-666-777-8888", 1100000);
			System.out.println("지불액: "+paidAmount);
			System.out.println("잔액: "+obj.balance);
		}catch (Exception e) {  // Exception e=new Exception(생성자 호출);
			String msg=e.getMessage();
			System.out.println(msg);
		} 
	}
}








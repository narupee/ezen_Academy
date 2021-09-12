package chap05.Object_Class_01;   // 2021-08-25

 class FruitSeller {     // 과일 장수
	 int numOfApple=20;  // 과일 개수
	 int myMoney=0;
	 final int APPLE_PRICE=1000;   // final : 고정된 값 , int " APPLE_PRICE " : 대문자!
	 
	 public int saleApple(int money) {   // <- 메서드 ( 과일장수 메서드 )
		 int num= money/APPLE_PRICE;   // 받은것 만큼 천원으로 나눈 사과 개수가 나옴!
		 	numOfApple -= num;    // 나의 재고가 남은걸 풀이
		 	myMoney += money;     // 돈 벌은걸 풀이
		 	
		   return num;		      // 사과를 돌려줌 
	 }
	 
	 public void showSaleResult() {
		 System.out.println("남은 사과: "+numOfApple);
		 System.out.println("판매 수익: "+myMoney);
	 }
}   // 과일 장수 설계 끝
 
 class FruitBuyer {      // 고객
	 int numOfApple=0; 
	 int myMoney=5000;   
	 
	 public void buyApple(FruitSeller seller, int money) {   // 사과를 사는 행위
		 numOfApple += seller.saleApple(money);   // 사과 아저씨 사과 3천원치 주세욤 
		 myMoney -= money;   // 내돈에서 사과 산돈
		 
	 }
	 
	 public void showBuyResult() {   // 사과 사온거 보고
		 System.out.println("현재 잔액: "+myMoney);
		 System.out.println("사과 개수: "+numOfApple);
	 }
	 
 }
 
 public class FruitSalesMain {
	 
	 public static void main(String[] args) {
		 FruitSeller seller=new FruitSeller();
		 FruitBuyer buyer=new FruitBuyer();
		 buyer.buyApple(seller, 2000);   // 
		 System.out.printf("과일 판매자의 현재 상황",seller);
		 seller.showSaleResult();   //
		 System.out.println("과일 구매자의 현재 상황"+buyer);
		 buyer.showBuyResult();   //
		 
		 
	 }
	 
 }

package chap05.Object_Class_03;

public class GoodsStock { // 클래스가 public 이면 생성자도 public을 붙여줘야함 4
	String goodsCode;
	int stockNum;              // 클래스 선언 후 값을 안준 상태
	
	/*
	GoodsStock() {      // 기본 생성자, 리턴 타입이 없다, 클래스 이름과 같다, 생성자도 메서드다    1
	                    // 기본 생성자는 다른 생성자를 만들면 만들어 지지 않는다.
		System.out.println("생성자는 객체가 만들어 질때 제일 먼저 호출");
	} // 용도는 여러가지임, 얘의 특징! 1.제일 먼저 호출, 2.초기화 값을 주는게 아닌 객체가 만들어질때 생성자를 만들고 싶을때!?
    */

	public GoodsStock(String code, int num) { // 매개변수 2개 , (설계만 해놓은상태)       2 , 4
		goodsCode=code;                // 초기화
		stockNum=num;  
	}
	
	void addStock(int amount) {
		stockNum+=amount;
	}
	
	int subtractStock(int amount) {
		if(stockNum<amount)
			return 0;          // 주문량이 아니면 리턴
		stockNum-=amount;
		return amount;
	}
}

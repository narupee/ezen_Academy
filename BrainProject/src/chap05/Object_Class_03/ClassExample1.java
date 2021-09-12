package chap05.Object_Class_03;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj;                           // 변수선언   ,  클래스 선언 후 값을 안준 상태     1
//		GoodsStock obj=null; <- (이렇게도 변수선언 가능)
		
//		obj=new GoodsStock(); // 생성자 호출, 생성자는 자동으로 만들어 진다. 그러나 눈에 보이지 않음
		obj=new GoodsStock("52135", 200);
//		obj.goodsCode="52135";  // 초기화 값   2
//		obj.stockNum=200;
		
		
		System.out.println("상품코드: "+obj.goodsCode);
		System.out.println("재고수량: "+obj.stockNum);
		
		obj.addStock(1000);
		
		System.out.println("상품코드: "+obj.goodsCode);
		System.out.println("재고수량: "+obj.stockNum);
		
	}
	
}

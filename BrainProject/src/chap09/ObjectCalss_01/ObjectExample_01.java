package chap09.ObjectCalss_01;

class GoodsStock{
	String goodsCode;
	int stockNum;
	
	public GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {       // toString 오버라이딩
//		return goodsCode;
		String str="상품코드: "+goodsCode+", "+"재고수량: "+stockNum;
		return str;
	}
}

public class ObjectExample_01 extends Object {

	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("57293", 100);
		System.out.println(obj);
		String str=obj.toString();   // 오버라이딩 해야 쓸 수 있음!
		System.out.println(str);
		
	}
}

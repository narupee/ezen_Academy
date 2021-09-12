package chap06.polymorphism_03;

import javax.sound.sampled.AudioFileFormat;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

class Product{   // Product : 제품
	 int price;  // price : 가격
	 int bonusPoint;   // 공통으로 갖는 필드 또는 메서드 클레스를 만들어야함
	 
	 Product(int price) {                  // 생성자 
		 this.price=price;
		 bonusPoint=(int)(price/10.0);
	 }
 }

 class Audio extends Product {   // extends : 확장   // 오른쪽에서 왼쪽 대입 Audio: 자식, Product: 부모
	 Audio() {
		 super(50);              // 이가격은 50이다~ 위에 부모를 상속!
	 }
	 public String toString() {
		 return "Audio";
	 }
 }

 class Tv extends Product{    // Tv 상속 ( 자식 클래스 ) // 공통으로 가지는 필드를 ( Product ) 상속받은거임 
	 Tv() {
		super(100);
	}
	public String toString() {    // toString 으로 오버라이딩 가능  // 이렇게 표현하는 방법을 알아야함!
		return "Tv";              
	}
}

 class Computer extends Product{
	 Computer(){
		super(200);
	}
	 public String toString() {
		 return "Computer";   // 이걸 안넣어주면 주소값이 나옴! 이거 진짜 많이씀 꼭 알아둬야함 ★★★★★
	 }
}
// 부모는 자식을 품을 수 있다
// 반대로 자식은 부모를 품을 수 없다
 class Buyer{   // 다형성에서 부모만 가능!! (받는 건 부모만 가능!!) 자식은 불가능! --> 부모 타입의 자식 생성자는 가능 , 자식 타입의 부모 생성자는안됨!
	 int money=1000;
	 int bonusPoint=0;
	 
	 Product[] tv=new Product[10];  // 배열안에 넣어보삼 tv 또는 com 넣을수있게 buy에 작성!
	 
	 int i=0;
	 
	 public void buy(Product p) {    // 주는쪽 받는쪽 타입이 같아야함! ☆☆☆ ( Tv p )  // ☆☆☆☆☆ 다형성 방법! ( Product p ) 부모껄 받아서한것! 보너스포인트는 공통으로 갖는애임으로 잘됨!
		 if(money<p.price) {
			 System.out.println("잔액이 부족 하여 물건을 살 수 없습니다.");
			 return;
		 }
		 money-=p.price;
		 bonusPoint += p.bonusPoint;
		 tv[i++]=p;   //tv[i]=p; i++;
		 System.out.println(p+"을/를 구입하셨습니다.");
	 }
	public void summary() {  // 구매한 물품에 대한 정보
		int sum=0;
		String tvList=" ";
		// 반복문을 이용해서 구입한 물품의 총 가격 과 목록 작성
		for(int i=0;i<tvList.length();i++) {
			if(tv[i]==null)
				break;
			sum+=tv[i].price;
			tvList += tv[i]+",";
		}
		System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
		System.out.println("구입하신 제품은"+tvList+"입니다.");
		}
	
	 /*
	 public void buy(Computer p) {
		 if(money<p.price) {
			 System.out.println("잔액이 부족 하여 물건을 살 수 없습니다.");
			 return;
		 }
		 money-=p.price;
		 bonusPoint += p.bonusPoint;
		 System.out.println(p+"을/를 구입하셨습니다.");
	 }
	 */ // 이부분도 같은 톰캣 내용이 나옴!
 	}

public class PolyArgumentTest_04 {
	
	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();
		Audio audio=new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
//		System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
//		System.out.println("현재 보너스 점수는"+b.bonusPoint+"점 입니다.");
	}
}




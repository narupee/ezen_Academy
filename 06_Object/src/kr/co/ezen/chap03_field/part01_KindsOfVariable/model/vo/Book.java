package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class Book {
// private(프라이빗)
// 각각 필드 저장하고 가져오는 메소드를 한번에 불러오는 방법 ==> 빈공간 마우스 오른쪽 Source -> Generate getters and setters to create 클릭! 하면 각 메서드 쫙 나옴!
	private String title;
	private String author;
	private int price;
	
	public static final String PUBLISHER="GAYEONG 출판사";
	private static int stock=10;
	
	public Book() {
		
	}

	public String getTitle() {             // get(가져옴)
		return title;
	}

	public void setTitle(String title) {   // set(저장)
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock) {
		Book.stock = stock;
	}

	public static String getPublisher() {
		return PUBLISHER;
	}
	
	public String information() {
		
		return "Book[title="+title+", author="+author+", price="+price+", stock="+stock+"]";
		
	}
	
}





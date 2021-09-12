package kr.co.ezen.silsub6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	public Book() {

	}

	public Book(String title, String publisher, String author) { // 매개변수 String 3개 
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	} // 굳이 이부분은 없애도됨 밑에 매개변수 5개로 한번에 해도됨

	public Book(String title, String publisher, String author, int price, double discountRate) {  // 매개변수 5개
		this(title,publisher,author);   // 위 매개변수랑 동일함 
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String information() {
		
		return "[" + "title=" + title +
				", publisher=" + publisher +
				", author=" + author +
				", price=" + price +
				", discountRate=" + discountRate;
	}

}

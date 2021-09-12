package kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	public Book() {
		
	}
	// 오른쪽 누르고 소스 -> using field -> 누르면 밑에 이거 나옴!
	public Book(String title, String author, String publisher, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "title="+title+
				", author="+author+
				", publisher="+publisher+
				", price="+price;
		
	}
}

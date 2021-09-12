package kr.co.ezen.chap03_field.patr02_initBlock.model.vo;

public class Product {
	private String pName = "아이코스";
	private int price = 100000;
	private static String brand = "나이키";
	private int createYear;

	// 인스턴스 블럭: 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성시마다 초기화

	{
		pName = "키보드";
		price = 90000;
		brand = "EZEN";
		createYear = 2021;
	}

	static {
		// pName = "모니터";
		// price = 1000000;
		brand = "삼송"; // static만 가능
	}

	// 생성자
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		Product.brand = brand; // static이라 클래스로 가능
	}

	public Product() { // 생성자를 만들면 기본 생성자는 만들어지지 않지만 필요에 의해 만들 수 있다.

	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand;
	}

	public String information() {

		return "Product [pName=" + pName + 
				",price=" + price + 
				",brand=" + brand + 
				",createYear=" + 
				createYear + "]";
	}

}

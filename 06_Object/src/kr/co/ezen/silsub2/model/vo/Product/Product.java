package kr.co.ezen.silsub2.model.vo.Product;

public class Product {
	public String pName;
	public int price;
	public String brand;
	
	public Product() {
		
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		
		return "["+"pName="+pName+", price="+price+", brand="+brand+"]";
		
	}

}
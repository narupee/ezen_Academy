package kr.co.ezen.chap01.part02_PersonMVC.model.vo; //09-01

public class Person {
	private String name;
	private int age;
	private int wealth; // 재산
	// private(프라이빗!): 내부접근불가능
	
	public Person() {
		
	}
	
	public Person(String name, int age, int wealth) {
		this.name=name;
		this.age=age;
		this.wealth=wealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	public String inforamtion() {
		return "name="+name+",age="+age+",wealth="+wealth;
	}

}




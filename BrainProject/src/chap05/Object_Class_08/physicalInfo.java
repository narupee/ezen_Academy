package chap05.Object_Class_08;

public class physicalInfo {
	String name;
	int age;
	float height,weight;
	
	physicalInfo(String name, int age, float height, float weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		
	}
	
	void update(int age) {
		this.age=age;
		
	}
	
	void update(int age,float height) {
		this.age=age;
		this.height=height;
	}
	
	void update(int age,float height,float wehight) {
		this.age=age;
		this.height=height;
		this.weight=wehight;
	}
	
	// method overloading (메서드 오버로딩: 적용하는 대상만 다를뿐 값을 초기하는 메서드 이며, 각각의 메서드 다른 변수 타입으로 나눈것) 2021-08-26
	// 3개 메서드 증 누굴 호출 할거야? 
	
}

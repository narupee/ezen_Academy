package chap05.Object_Class_06;

class Car {
	String color;
	String gearType;
	int door;
	
	// 생성자도 메서드 이므로 다른 생성자를 호출할 수 있다. (다른 방식 방법 3    -> 5번을 이용해서 사용)
	Car() {
//		this.color="white";
//		this.gearType="auto";
//		this.door=4;
		
		this("whilte","auto",4); 
		// 생성자 호출 (5번 호출 하면서 값을 넘겨주는것임!) 
		//(값만 바꿔 가변서 무한대로 만들 수 있음! 모양은 똑같고 다 다르게 만들 수있다.)
	}
	
	Car(String color) {          // c2는 컬러만 전달 하면 컬러만 바뀌게 하는 것이라 고정값을 주면 안됨! 기어타입과 도어는 고정으로 가져온것 !
//		this.color="color";      // 이때는 Car 클래스를 말하는것!
//		this.gearType="auto";
//		this.door=4;
		
		this("color","auto",4); 
	}

	Car(String color, String gearType, int door){  // 3개를 다 바꿨을때 경우    , 5번
		this.color="color";
		this.gearType="gearType";
		this.door=door;
	}
}

public class CarTest1 {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("blue");
		
		System.out.println("c1의 color="+c1.color+",gearType="+c1.gearType+"door="+c1.door);
		System.out.println("c2의 color="+c2.color+",gearType="+c2.gearType+"door="+c2.door);
		
	}
	
}

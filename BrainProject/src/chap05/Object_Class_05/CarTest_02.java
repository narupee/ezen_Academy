package chap05.Object_Class_05;

class Car {
	String color;
	String gearType;
	int door;
	
	// 생성자 (를 통해 위에 변수 초기화 할것)
	Car(){} // 기본생성자 (무조건 만들어지고 눈에안보인다!)
	
		Car(String color, String gearType, int door) { // (객체를 만들고 이걸 만들어주면 기본생성자가 보여진다) 매개변수와 생성자를 만들면 초기화가 된다 
			this.color=color;
			this.gearType=gearType;
			this.door=door;
	}
} // 설계 끝


public class CarTest_02 {

	public static void main(String[] args) { // 객체를 만들면! 
		Car c1=new Car();  // 기본생성자는 이미 만들어진 상태고 호출을 한상태!
		c1.color="white";
		c1.gearType="aito";
		c1.door=4;

		Car c2=new Car("white","auto",4);
		
		System.out.println("c1의 color="+c1.color+"gearType="+c1.gearType+"door="+c1.door);
		System.out.println("c2의 color="+c2.color+"gearType="+c2.gearType+"door="+c2.door);
		
		
		
  }
}

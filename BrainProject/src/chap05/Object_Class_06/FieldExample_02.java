package chap05.Object_Class_06;

class Circle {                        // 내부 아이들 ( 외부로 부터 데이터를 지킨다! 그러므로 private 금지!)
	double radius;                    // 필드(변수)
	// private double radius;         // 필드에 private이 붙으면 무조건 외부 접근 금지 ( 외부: 내부아이들 클래스 외에 것들 )
	
	Circle(double radius) {           // 0.0 으로 초기화
		this.radius=radius;
	}
	
	double getArea() {
		double area;                  // 지역변수
		area=radius*radius*3.14;      // 5.0*5.0*3.14
		
		return area;                  // return : 값을 반환, 메서드 종료
	}                               
	    
}                                     // 클래스는 설계도!!! 실지적으로 작동을 할려면 내가 만든 클래스가 메모리에 만들어져야함! 메모리에서 실행이 되어야함! 메모리 공간은 (킵) -> 그 과정은 밑에 객체! new를 통해 만듬
public class FieldExample_02 {        // 외부 아이들

	public static void main(String[] args) {  // 작업 해주는곳 , (public 은 어디서든 접근 허용)
		Circle obj=new Circle(0.0);           // double 이니까 0.0 을 준것 (초기화)  ,  객체 (= 메모리공간 (킵) ) , 변수선언 ( = obj 로 접근)
		obj.radius=5.0;                       // 5.0 으로 바꾸자!
		double area=obj.getArea();
		
		System.out.println("radius:"+obj.radius*obj.radius*3.14);   //내가한거
		System.out.println();
		System.out.println("area:"+area);                           //선생님풀이
		System.out.println("obj.radius:"+obj.radius);
	}
}

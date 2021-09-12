package chap09.ObjectCalss_01;   // StringExample_02 이거랑 비교 하는 걸 배우는곳    // 주석 값 비교

class Circle{      // 일반 클래스 타입
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	///오브젝트의 equals를 오버라이딩?            // Object : 최상위 클래스  
    public boolean equals(Object obj) {    // 얜 트루 펄스만 아는 바보임
        if(!(obj instanceof Circle))       // instanceof는 다음 타입으로 형변환이 가능한지 true false로 확인하는 메서드(연산자) 
            return false;                  // obj객체가 Circle클래스 조상님의 객체니?
        Circle circle=(Circle)obj;
        if(radius == circle.radius) {      // 이퀄스 메서드가 아니고 리턴값으로 같으면 트루 아니며 폴스함
            return true;
        }else {
            return false;
        }
    }
    // object 의 equals는 스트링클래스에서 사용하는 이퀄스는 그 저 뭐냐 오버라이딩해줬음 개발자형아들이
    
}   // instanceof는 객체 타입을 확인하는 연산자이다.
    // 형변환 가능여부를 확인하며 true / false 로 결과를 반환한다.
    // 주로 상속 관계에서 부모객체인지 자식객체인지 확인하는데 사용된다.

public class ObjectExample_02 {
	
	public static void main(String[] args) {
		Circle obj1=new Circle(5);  // obj1 obj2는 객체임
		Circle obj2=new Circle(5);
		
		 // equals(String) "이거랑" == "이거랑" == true 
        // 이게 알고보니까 Object라는 상위클래스의 String 클래스안에 개발자형아들이 만들어놓은 equals라는 메서드였떤것
        // 우리가 생성하는 java파일의 클래스는 모두 Object클래스를 상속받았던것?!
        // 우리는 학원에서 Circle(원)이라는 클래스를 생성해서 radius(반지름)이라는 변수를 생성하고
        // Circle생성자(메서드)에서 this로 받아서 매개변수를 활용하지?   <<Circle클래스가 Object클래스를 상속받음 ( 요기 안에 equals라는 메서드가 있음)
        // public boolean equals(메서드)(boolean)(불리언)(타입)를 오버라이딩하는거야 뭘로? --> Circle타입의 equals메서드를 오버라이딩 하는즁
		
		if(obj1.equals(obj2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}

//  Oject 클래스의 equals 메서드는 
//  두 객체를 비교 할 때 객체의 필드 값이 아니라 참조값을 가지고 비교.




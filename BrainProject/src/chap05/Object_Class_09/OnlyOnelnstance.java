package chap05.Object_Class_09;

class SimpleNumber {
	int num=0;
	
	private SimpleNumber() {    // 생성자 , private 생성자 : 직접적인 생성자
	// private : 외부 접근 금지
		
	}
	
	public void addNum(int n) {    // 메서드 , 반환 타입이 없고 계산하고 끝나고 있음!
		num+=n;
	}
	
	public void showNum() {
		System.out.println(num);
	}
	
	public static SimpleNumber getSimpleNumberInst () {   // 직접객체 , // SimpleNumber 타입
		
		return new SimpleNumber();    
		// SimpleNumber 타입을 반환
		// ' private ' 이여도 만들어진 이유는 내부 클래스 안에! 즉, 같은 식구 이기 때문에 만들어진것!
		// 같은 메서드라서 생성자가 private이라도 객체 생성 가능
				
	}
}

public class OnlyOnelnstance {

	public static void main(String[] args) {     //   
		SimpleNumber num1= SimpleNumber.getSimpleNumberInst();       // 이렇게 만들줄 알아야함!
		num1.addNum(20);   // num1. 안에 있는 걸 호출해서 20을 주겠다. 라는 의미
		
		SimpleNumber num2= SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);   // num1. 안에 있는 걸 호출해서 20을 주겠다. 라는 의미
		
		num1.showNum();    // 20 인걸 확인 하기 위해 얘를 호출
		num2.showNum();    // 20 인걸 확인 하기 위해 얘를 호출
		
//		SimpleNumber num1=new SimpleNumber();    // 외부 객체 ,  
		// 생성자는 객체가 생성 될때에 자동으로 호출 되는게 생성자이다! 
		// 직접적인 생성자로 만들면! 직접객체를 못하게한다 --> 왜? ' private ' SimpleNumber 에서 ' ' 얘 때문에!
		// 결론. 간접적으로 객체 생성
		
//		int num2=num1.addNum(20);   // 이건 오류 뜸 왜냐! 위에 addNum ( int n) 이 반환하는게 없기 떄문임 참고!
		
		
	}
	
}



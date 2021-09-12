package chap05.Object_Class_01;   // 2021-08-25 객체지향 클래스

 class Number {
	int num=0;  // 변수
	
	public void addNum(int n) {   
		num += n;   
	}	
//	(명칭) 메서드(함수): 기능 (각자의 메서드가 하는 일)
//	addNum : 즉 다른 함수의 변수를 쓸 수 있다는 겁니다.
//  ㄴ (추가 설명) : 가로 안에 있는 것이 파라미터 라는 것이고 파라미터는 외부에서 값을 저장할 수 있는 변수
//	+= : 복합 대입 연산자
//	int n : 매개 변수(외부로 부터 값을 전달 받는 변수)
//	메서드는 호출을 해야 작동한다
//	void : 일을 처리 후 반환 할 값이 없다
	
	
	public int getNumber() {  
		
		return num;   // 리턴이 되어 0 이라는 값 (num=0;)이 호출 한 곳으로 값이 전달됨
	}
//	int : 반환 값의 자료형
//	return : 키워드 다음에 명시된 표현식의 값을 호출자에게 반환

}

//	클래스는 설계도 (class) 이다 ==> new : 실제 자동차(운전가능) : 객체(Object)
//	( new 를 해줘야 설계도가 실제 자동차가 된다. 예를 들어 개념설명) 

public class PassInstance {   // 매서드가 몇개? 2개

	public static void main(String[] args) {
		Number nInst=new Number();   // 클래스는 다르지만 다른 클래스를 객체화 할 수 있다! ☆☆☆
		System.out.println("메서드 호출 전: "+nInst.getNumber());   // 매개 변수가 없어서 'getNumber()' 괄호 안은 공백!
		simpleMethod(nInst);
		System.out.println("메서드 호출 후: "+nInst.getNumber());
	}
	
	public static void simpleMethod(Number numb) {
		numb.addNum(12);
	}
	
}
//	자바는 클래스 단위로 처리 되는 언어!
//	소스 파일 ==> 컴파일 과정 ==> 실행(출발점: main)

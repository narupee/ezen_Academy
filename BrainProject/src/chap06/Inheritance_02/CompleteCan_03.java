package chap06.Inheritance_02;

 abstract class EmptyCan {  // 2개의 추상 메서드
	 abstract void printContent();
	 abstract void printName();
}

 abstract class InCompleteCan extends EmptyCan{   // 추상메서드 2개이기 때문에 2개의 메서드 오버라이딩됨
//
//	@Override
//	void printContent() {
//		
//		
//	}

	@Override
	void printName() {
		System.out.println("InCompleteCan에서 printName() 구현");
		}

	}

	// InCompleteCan 클래스는 EmptyCan을 상속했지만 EmptyCan의 모든 추상 메서드를 구현하지 않았기 때문에 
 	// InCompleteCan 클래스 자체는 또 다시 추상 클래스가 된다. 

	public class CompleteCan_03 {

		public static void main(String[] args) {
			// InCompleteCan ic = new InCompleteCan();
			// ic.printName();
		}

	}
package chap11.DataStructure_01;

class IntNumber{
	int num;
	private Object IntNumber;
	
	public IntNumber(int num) {
		this.num=num;
	}
	/*
	// 내가 직접 값을 비교하게끔 메서드를 만드는 방법 ( equals 가 싫어서 만듬ㅋㅋ )
	public boolean isEquals(IntNumber numobj) {
		if (this.num == numobj.num) {
			return true;
		}else {
			return false;
		}
	}
	*/
	public boolean equals(Object obj) {
		if(this.num == ((IntNumber)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectEquality_15 {

	public static void main(String[] args) {
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		/*
		if(num1.isEquals(num2))
//		if(num1.equals(num2))
			System.out.println("num1 과 num2 는 동일한 정수");
		else {
			System.out.println("num1 과 num2 는 다른 정수");
		if(num1.isEquals(num2))
//		if(num1.equals(num3))
			System.out.println("num1 과 num3 는 동일한 정수");
		else {
			System.out.println("num1 과 num3 는 다른 정수");
		}
	}
	*/
			if(num1.equals(num2))
				System.out.println("num1 과 num2 는 동일한 정수");
			else {
				System.out.println("num1 과 num2 는 다른 정수");
			if(num1.equals(num3))
				System.out.println("num1 과 num3 는 동일한 정수");
			else {
				System.out.println("num1 과 num3 는 다른 정수");
			}
		}
	}

}

package chap05.Object_Class_08;

class LimitedValue{
	final static int UPPER_LIMIT=100000;  //상수 //별도의 공간인 static에 final로 박제 탕탕
	int value;
	
	public void setValue(int value) {
		if(value < UPPER_LIMIT) {
			this.value=value;
			
		}else {
			this.value=UPPER_LIMIT;       //나보다 클순없으셈 나보다 같거나 크면 10만 고정임
			
		}
	}
}

public class StaticFieldExample {
	
	public static void main(String[] args) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000); // 난 위에서 얘기햇음 나보다 클순 없으셈
		System.out.println("v.value="+v.value);
		System.out.println("상한값="+LimitedValue.UPPER_LIMIT);
	}
}

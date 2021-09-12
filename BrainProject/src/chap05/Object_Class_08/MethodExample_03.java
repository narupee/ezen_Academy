package chap05.Object_Class_08;

public class MethodExample_03 {

	public static void main(String[] args) {
		int arr[]=new int[0];
		Numbers obj=new Numbers(arr);
		
		// 트라이캐치 (예외처리)
		try {   // try: (시도하다) 시도 하여 처리
		int average=obj.getAverage();
		System.out.println("평균="+average);
		}
		catch(java.lang.ArithmeticException e) {    // catch: (캐치) 잡아서 처리
			// java.lang.Ar~~on 하나의 
			System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
			
			
		}
		
	}
}

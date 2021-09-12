package chap05.Object_Class_08; //08-27

class HundredNumbers {
	static int arr[];
	
	// 정적 초기화 블록
	static {
		arr=new int[100];
		for(int cnt=0; cnt<100; cnt++) {
			arr[cnt]=cnt;
		}
	}
}

public class StaticlnitializerExample_14 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);   // 클래스 이름으로 접근해서 값을 만듬
		System.out.println(HundredNumbers.arr[36]);
		System.out.println(HundredNumbers.arr[37]);
		
		
		
	}
}

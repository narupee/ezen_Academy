package chap10.WrapperClass_01;

public class LunchBox_10 {

	public static void main(String[] args) {
		Object arr[]=new Object[5];  // 다형성
		
		arr[0]="오렌지";
		arr[1]=new Integer(52);
		arr[2]=3.14;
		arr[3]=new Character('귤');
		arr[4]=true;
		
		for(int cnt=0;cnt<arr.length;cnt++)
			System.out.println(arr[cnt]);
		
		
	}
}

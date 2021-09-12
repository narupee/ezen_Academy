package chap10.WrapperClass_01;

public class WrapperExample_05 {

	public static void main(String[] args) {
		Integer obj=new Integer("10");
		int sum=obj+20;  // auto unboxing 가져오는것
		System.out.println(sum);
	}
}



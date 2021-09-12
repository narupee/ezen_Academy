package chap10.WrapperClass_01;

public class WrapperExample_03 {

	public static void main(String[] args) {
		int total=0;
		
		for(int cnt=0;cnt<args.length;cnt++) 
			total += Integer.parseInt(args[cnt]);
		System.out.println(total);
	}

}

// 문자열을 프리미티브 타입으로 바꾸는 메서드 
// ㄴ> parse-메서드(래퍼 객체를 생성하지 않는다) ★★★★★★ 잘 알아두기
// -> new를 안하고 래퍼 객체가 갖고 있는 메서드를 사용 할 수 있다.


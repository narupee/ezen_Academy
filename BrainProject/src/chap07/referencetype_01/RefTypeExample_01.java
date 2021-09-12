package chap07.referencetype_01;

class Point{
	int x=0;
	int y=0;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}


public class RefTypeExample_01 {
	
	public static void main(String[] args) {
		Point obj=null;
		if(obj == null) {
			System.out.println("obj 변수가 가리키는 객체가 없습니다.");
			return;
		}
//			System.out.println(obj.x);
//			System.out.println(obj.y);
		
	}

}

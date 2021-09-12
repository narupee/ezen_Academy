package chap06.Inheritance_01;

class Point2{
	int x=10;
	int y=20;
	
	Point2(int x,int y){
		super(); // Object 호출
		this.x=x;
		this.y=y;
	}
}

class Point2D extends Point{
	int z=30;
	Point2D(){
		this(100,200,300);
	}
	
	Point2D(int x, int y,int z) {
		super(x,y);
		this.z=z;
	}
	
}

public class PointTest_04 {

	public static void main(String[] args) {
		Point2D p3=new Point2D();
		System.out.println("p3.x="+p3.x); // 100
		System.out.println("p3.y="+p3.y); // 200
		System.out.println("p3.z="+p3.z); // 300

	}

}

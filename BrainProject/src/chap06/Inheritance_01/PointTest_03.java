package chap06.Inheritance_01;

class Point{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}

class point3D extends Point{
	int z;
	public point3D(int x,int y,int z) {
		super(x, y);
//		this.x=x;
//		this.y=y;
		this.z=z;
	}
	
	String getLocationg() {   // method overriding :재정의
		return "x: "+x+", y: "+y+", z: "+z;
	}
}

public class PointTest_03 {
	
	public static void main(String[] args) {
		point3D p3=new point3D(1,2,3);   //매개변수 생성자호출
		String po=p3.getLocation();
		System.out.println(po);
		
	}  
}

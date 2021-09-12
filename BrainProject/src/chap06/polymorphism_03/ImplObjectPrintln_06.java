package chap06.polymorphism_03; // 09-07

 class ClassPrinter{
	 
	 public static void print(Object obj) {   // 매개변수 obj
		 System.out.println(obj.toString());  // toString obj가 가지고 있는 메소드
	 }
 }
 
 class Point{
	 private int xPos,yPos;
	 
	 Point(int x, int y){
		 xPos=x;
		 yPos=y;
	 }
	 
	 public String toString() {   // 오버라이딩 시킨것 // public 지움 오류남~
		 String posInfo="[x:"+xPos+",y:"+yPos+"]";
		 return posInfo;
	 }
 }
 
public class ImplObjectPrintln_06 {

	public static void main(String[] args) {
		Point pos1=new Point(1, 2);
		Point pos2=new Point(5, 9);
//		System.out.println(pos1);
//		System.out.println(pos2);
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		
	}
}






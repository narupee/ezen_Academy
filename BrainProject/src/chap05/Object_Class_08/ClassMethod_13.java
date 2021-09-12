package chap05.Object_Class_08; //08-27

 class NumberPrinter {
	 
	 public static void showInt(int n) {
		 System.out.println(n);
		 showDouble(100.0);
	 }
	 
	 public static void showDouble(double n) {
		 System.out.println(n);
	 }

}
 
 public class ClassMethod_13 {
	 
	 public static void main(String[] args) {
		 NumberPrinter.showInt(20);
		 NumberPrinter np=new NumberPrinter();
		 np.showDouble(3.15);
		 NumberPrinter.showDouble(3.16);
		 
		 
		 
		 
	 }
	 
 }
 
 
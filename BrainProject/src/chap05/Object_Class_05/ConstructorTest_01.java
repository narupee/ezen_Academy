package chap05.Object_Class_05;

class Data1{
	int value;
	/*
	Data1(){    // 1.생성자는 생성자를 적지 않아도 자동으로 생성되지만 눈에 보이지 않는다.
		
	}
	*/ 
}

class Data2{
	int value;
	/*
	Data2(){ 
		
	}
	*/  
	
	Data2(int x){  // 2. 생성자를 눈에 보이게 적어준 것
		value=x;
		System.out.println("value="+value);
	}
}

 public class ConstructorTest_01 {
	 
	 public static void main(String[] args) {
//		 Data1 d1=new Data1();   // 1-1 얘가 1-2 얘 호출
		 // Data2 d2=new Data2(); // 없는 애가 됨 
		 
		 // Data2 d2=new Data2();가 안되는 이유는 
         // Data2(int x)라는 생성자는 있지만 Data2()라는 생성자는 없기 때문
		 
		 Data2 d2=new Data2(10);  // 1-3 얘는 1-4 여기에 맞게 호출
		 System.out.println("d2.value="+d2.value);
		 
	 }
 }

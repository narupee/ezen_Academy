package chap05.Object_Class_08;

public class MethodExample_05 {    // 메서드 오버로딩 2021-08-26
	
	public static void main(String[] args) {   // 메인 메서드
		physicalInfo obj=new physicalInfo("해리",10 ,13.0f ,35.0f);
		printPhysicalInfo(obj);
		obj.update(11, 145.0f, 45.0f);
		printPhysicalInfo(obj); // 위 바뀐 메서드를 출려할려면 밑에 이렇게 넣어줘야함
		obj.update(13);
		printPhysicalInfo(obj);
	}
	
	// 메인 메서드 와 매개변수에 변수선언 된 physicalInfo obj 는 서로 다름!

	public static void printPhysicalInfo(physicalInfo obj) {  // 매개변수 
		System.out.println("이름:"+obj.name);
		System.out.println("나이:"+obj.age);
		System.out.println("키:"+obj.height);
		System.out.println("몸무게:"+obj.weight);
		System.out.println();
		
		
		
	}

}

/* 실행답 

//바뀌기전

이름:해리
나이:10
키:13.0
몸무게:35.0

// 바뀐 후

이름:해리
나이:11
키:145.0
몸무게:45.0
*/

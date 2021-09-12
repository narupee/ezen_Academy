package kr.co.ezen.example.array;  // 2021-08-13 배열시작

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
	// 배열 사용 이유, 배열의 편리함
	
	// 변수 여러개 사용
	int num1=0;
	int num2=0;
	int num3=30;
	int num4=40;
	int num5=50;
	
	// 반복문도 사용하지 못하고 일일이 더할때
	int sum1=0;
	sum1+=num1;
	sum1+=num2;
	sum1+=num3;
	sum1+=num4;
	sum1+=num5;
	
	int[] arr=new int[5]; // 배열 선언 및 할당
//	자료형[] 배열명(변수) = new 자료형[길이]
//	 정수 타입의 5개를 넣는다 
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	System.out.println("arr.length="+arr.length);
	// for을 이용해 위 배열과 똑같이 값이 저장되게 하기
	for(int i=0; i<arr.length;i++) {
		arr[i]=10*(i+1); // 숫자 상수 숫자를 인덱스 배열에 줌
//		i: 배열의 반복 횟수를 제어한다
//		i: 위치    
	}
	
	int sum2=0;
	// 배열 과 for를 이용하기
	// 배열에서 가장 많이 쓰이는 구문: for문
	for(int i=0; i<arr.length;i++) {
		sum2+=arr[i];
	}
	
	System.out.println("sum2 :"+sum2);
	
	}
	
	public void method2() {
		int[] iArr; // atack에 int형 배열의 주소를 보관할 수 있는 공간생성
		char cArr[];

//		배열의 가장큰 단점: 한번 지정한 배열의 크기는 변경 불가능
	    iArr=new int[5];  // 메모리공간을 []안의 기준만큼 확보한다.
	    cArr=new char[10];
	
	    int[] iArr2=new int[5];
	    char cArr2[]=new char[10];
	
	    System.out.println("iArr :"+iArr);   // 공간의 주소가 맞음. 하지만  실제 주소가 아닌 자바에서 변환한 주소의 참조값이다. 
	    System.out.println("iArr2 :"+iArr2);
	    System.out.println("cArr :"+cArr);
	    System.out.println("iArr2 :"+cArr2);
	
//	 heap 메모리는 변수를 생성하여 직접 접근을 하지 못하는 영역이기 때문에
//	 실제 값을 저장하고 있는 공간의 주소만 가지고 접근할 수 있다.
	
	    System.out.println("iArr의 hashCode:"+iArr.hashCode());
	    System.out.println("iArr의 hashCode:"+cArr.hashCode());
	    
	    for(int i=0;i<iArr.length;i++) {
	    	System.out.println(iArr[i]);
	    }
	    
	    for(int i=0;i<cArr.length;i++) {
	    	System.out.println(cArr[i]); // 공백
	    }
	    
	    System.out.println("iArr의 길이:"+iArr.length);
	    System.out.println("cArr의 길이:"+cArr.length);
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("새로 할당한 배열의 길이를 입력하세요:");
	    int size=sc.nextInt();  // 실행이 되면서 입력한 값이 배열의 길이가 된다. / ``20을 주니까 
	    double[] dArr=new double[size];  
//	    dArr : 배열명 이면서 변수임 (배열명 자체가 변수)
//	       실행이 되면서 입력한 크기의 메모리를 만들어 놓는것이 ==> 동적할당
	    
	    System.out.println("dArr의 hashCode:"+dArr.hashCode());
	    System.out.println("dArr의 길이:"+dArr.length); // ``20 출력됨
	    
	    dArr=new double[30];
	    System.out.println("dArr의 hashCode:"+dArr.hashCode());
	    System.out.println("dArr의 길이:"+dArr.length);
//	       새로 만든 길이로 바뀐다   ``20이 30으로 바뀌어 출력됨!
	    
	    
//	    Null PointerException: 널을 줬기때문에 가르키는 폴더가없다. 라는 에러(에러문예시를 적어둠! 나중에알아봐야하기떄문)
	    dArr=null;
	    System.out.println("삭제 후 dArr의 길이:"+dArr.length);
	    
	}
	
	public void method3() {
		int[] iArr=new int[5]; // 크기를 만들어서 배열함
		
		iArr[0]=1;
		iArr[1]=2;
		iArr[2]=3;
		iArr[3]=4;
		iArr[4]=5;
		
		for(int i=0;i<iArr.length;i++) {  // 저장된 상태
			iArr[i]=i+1;
		}
		
		for(int i=0;i<iArr.length;i++) {  // 출력된 상태
			System.out.println("iArr["+i+"]의 값:"+iArr[i]);
		}
		
		int[] iArr2=new int[] {11,22,33,44,55};  // 크기를 안주고 값(중괄호로 데이터값,5개)만큼 만들어짐 
		System.out.println("iArr2의 길이:"+iArr2.length); // run실행 후 나온답 : 5(개)
		
		String[] sArr= {"apple","banana","grape","orange"}; // String 타입이니까 중괄호로 문자 입력하여 배열주기
		
		String sArr2[]= {"apple"};
		
		String sArr3[];
		sArr3=new String[] {"apple"};
		/* 틀린방식(안되는 방식) 보여준것
		String sArr4[]= {"apple"};    
		sArr4="apple";  
		
		// sArr4: 배열명 에는 주소값(상수값)이 들어있다.
		// "배열명에는 문자열을 절대 줄수없음!!!!!!" 줄려면 스트링타입의 일반 변수를 줘야한다!?
		 
		String sArr5[]=null;
		sArr5="abcd";
		*/
	}
	
	public void method4() {
//		사용자에게 5명의 키의 정보를 입력받아 배열에 담아두고
//		반복문을 통해 5명의 키의 평균값을 구하시오.
		Scanner sc=new Scanner(System.in);
		double[] height=new double[5];
		
		for(int i=0;i<height.length;i++) {
			System.out.println("키 입력:");
			height[i]=sc.nextDouble();
	}
		double sum=0;
		for(int i=0;i<height.length;i++) {
			System.out.println("5명의 키의 평균값:"+height[i]);
			sum+=height[i];
		}
		System.out.println("평균:"+sum/height.length);
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수입력:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
//		 해당 배열에 1부터 100사이의 랜덤값들을 발생시켜 넣어줌
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");  // 하나의 값을 찍은 상태
			
			if(arr[i] % 2 == 0 ) {
				sum+=arr[i];
			}
   	    }
		System.out.println();
		System.out.println("짝수의 총합:"+sum);
	}
	
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자열 입력 :");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
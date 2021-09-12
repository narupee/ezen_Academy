package kr.co.ezen.variable;

public class A_Variable {

	public void declareVariable() {
		// 1.논리형
		boolean isTrue; // 타입(자료형) 변수이름
		
		// 2.숫자형
		// 2-1.정수형
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte
		
		// 2-2.실수형
		float fNum; // 4byte
		double dNum; // 8byte
		
		// 3.문자형
		char ch; // 0~65536
		
		// 4.문자열(참조형)
		String str;
		
		isTrue=true; // false
		bNum=1;
		sNum=2;
		iNum=4;
		lNum=8L;
		fNum=4.0f; // 실수의 기본값 8byte
		dNum=8.0;
		
		ch='A'; //문자형
		str="A"; //문자열
		
		System.out.println("isTrue:"+isTrue);
		System.out.println("sNum의 값:"+sNum);
		System.out.println("iNum의 값:"+iNum);
		System.out.println("lNum의 값:"+lNum);
		System.out.println("fNum의 값:"+fNum);
		System.out.println("dNum의 값:"+dNum);
		System.out.println("ch의 값:"+ch);
		System.out.println("lNum의 값:"+str);
	}
	
	public void declareVariable2() {
		// 1.논리형
		boolean isTrue=true;
				
		// 2.숫자형
		// 2-1.정수형
		byte bNum=1;
		short sNum=2;
		int iNum=4;
		long lNum=8L;
				
		// 2-2.실수형
		float fNum=4.0f; // 4byte
		double dNum=8.0; // 8byte
				
		// 3.문자형
		char ch='가'; // 0~65536
				
		// 4.문자열(참조형)
		String str="자바 취업반";
		
		System.out.println("isTrue:"+isTrue);
		System.out.println("sNum의 값:"+sNum);
		System.out.println("iNum의 값:"+iNum);
		System.out.println("lNum의 값:"+lNum);
		System.out.println("fNum의 값:"+fNum);
		System.out.println("dNum의 값:"+dNum);
		System.out.println("ch의 값:"+ch);
		System.out.println("lNum의 값:"+str);
	}
	
	public void charVariable() {
		char ch=32;
		System.out.println("1.코드값으로 리턴:"+ch);
		ch='이';
		System.out.println("2.한글로 리턴:"+ch);
		ch='\uae08';
		System.out.println("3.유니코드로 리턴:"+ch);
		
		char ch1,ch2,ch3,ch4;
		ch1='\ub300';
		ch2='\ud55c';
		ch3='\ubbfc';
		ch4='\uad6d';
		
		System.out.println(ch1);
		System.out.println(ch1+1); //45824+1
		System.out.println(ch1+ch2+ch3+ch4);
		System.out.println(ch1+""+ch2+""+ch3+""+ch4);
		System.out.println(""+ch1+ch2+ch3+ch4);
		
		System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4);
		System.out.println(" "+ch1+ch2+ch3+ch4);
		
	}
}


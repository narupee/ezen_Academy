package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void VariablePractice3() {
		double a, b; 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("가로:");
		a=sc.nextDouble();
		System.out.println("세로:");
		b=sc.nextDouble();
		
		System.out.println("면적:"+(a*b));
		System.out.println("둘레:"+((a+b)*2));

	}

}

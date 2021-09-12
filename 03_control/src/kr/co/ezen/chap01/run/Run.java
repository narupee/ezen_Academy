package kr.co.ezen.chap01.run;

import kr.co.ezen.chap01.condition.A_If;
import kr.co.ezen.chap01.condition.B_IfElse;
import kr.co.ezen.chap01.condition.C_IfElseIf;
import kr.co.ezen.chap01.condition.D_Switch;

public class Run {
	
	public static void main(String[] args) {
		A_If aif=new A_If();  // <- 객체생성
		// 자바에서 "new"란: 객체생성의 클래스를 메모리에 만들겠다. 라는 의미임
		
		//aif.method1();
		//aif.method2();
		//aif.method3();
		//aif.method4();
		//aif.method5();
		//aif.method6();
		//aif.method7();
		//aif.method8();
		
		B_IfElse bif=new B_IfElse();
		
		// C언어 에서 젤 어려워하는 부분 -> 포인터(주소)
		// ㄴ 이걸 자바에서는 -> new: "참조변수" 
		// cf) 객체생성 B_IfElse 의 메모리(메모리에는 주소가 있음!)가 만들어 질때 도와주는게 "new" 이며. 
		//bif 부분에 메모리주소 1000의 역활 (B_If의 메모리가 bif에 들어가 있음)
		// bif: "접근연산자"
		
		//bif.method1();
		//bif.method01();
		//bif.method2();
		//bif.method3();
		//bif.method4();
		//bif.method5();
		//bif.method6();
		//bif.method7();
		//bif.method8();
		
		C_IfElseIf cif=new C_IfElseIf();
		//cif.method1();
		//cif.method2();
		//cif.method3();
		//cif.method4();
		//cif.method5();
		//cif.method6();
		//cif.method7();
		//cif.method8();
		
		D_Switch dsw=new D_Switch();
		//dsw.method1();
		//dsw.method2();
		//dsw.method3();
		//dsw.method4();
		
		
	}

}

package kr.co.ezen.operator.run;

import kr.co.ezen.operator.A_LogicalNagation;
import kr.co.ezen.operator.B_InDecrease;
import kr.co.ezen.operator.C_Arithmetic;
import kr.co.ezen.operator.D_Comparison;
import kr.co.ezen.operator.E_Logical;
import kr.co.ezen.operator.F_Compound;
import kr.co.ezen.operator.G_Triple;


public class Run {

	public static void main(String[] args) {
		
		A_LogicalNagation a1=new A_LogicalNagation();
		//a1.method1();
		//a1.method2();
		
		B_InDecrease a2=new B_InDecrease();
		//a2.method1();
		//a2.method2();
		//a2.method3();
		//a2.method4();
		
		C_Arithmetic ca=new C_Arithmetic();
		//ca.method1();
		//ca.method2();
		//ca.method3();
		
		D_Comparison dc=new D_Comparison();
		//dc.method();
		
		E_Logical el=new E_Logical();
		//el.method1();
		//el.method2();
		//el.method3();
		//el.method4();
		
		F_Compound fc=new F_Compound();
		//fc.method();
		
		G_Triple gt=new G_Triple();
		gt.method1();
	}

}

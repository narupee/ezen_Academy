package kr.co.ezen.hw1.run;

import java.text.DecimalFormat;

import kr.co.ezen.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		
		emp[0]=new Employee(); // 값 없음
		emp[1]=new Employee(1,"루피",19,'W',"01022223333","서울시 노원구"); // 값 있는건 있고 없는건 없구
		emp[2]=new Employee(2,"뽀로로","초통령","연예인",20,'M',1000000,0.01,"01033335555","서울시 강북구"); // 값 다있음
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("emp["+i+"]"+emp[i].inforamtion());
		}
		System.out.println("=========================================================================");
		emp[0].setEmpNo(0);   // 0번째 객체 값주기
		emp[0].setEmpName("루피");
		emp[0].setDept("홍보부");
		emp[0].setJob("부사장");
		emp[0].setAge(20);
		emp[0].setGender('W');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01022223333");
		emp[0].setAddress("서울시 노원구");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부사장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0]: "+emp[0].inforamtion());
		System.out.println("emp[1]: "+emp[1].inforamtion());
		
		System.out.println("=========================================================================");
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산 하여 출력
		// 연봉=(급여+(급여*보너스 포인트))*12
		DecimalFormat de= new DecimalFormat("###,###,###");
		
		int sum=0;
		for(int i=0;i<emp.length;i++) {
			int sumSalary=(int)(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
			
			System.out.println(emp[i].getEmpName()+"의 연봉: "+sumSalary+"원");
			sum+=sumSalary;
		}
		System.out.println("=========================================================================");
		System.out.println("직원들의 연봉 평균: "+sum/emp.length+"원");
	}
	
}

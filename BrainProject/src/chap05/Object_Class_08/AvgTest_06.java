package chap05.Object_Class_08;

import org.omg.CORBA.PRIVATE_MEMBER;

class Avg3 {
	String name;
//	String kor;
//	String lish;
//	String math;
	private int avg;
	
//	Avg3 (String name, int age, String kor)   
//		this.name=name;
//		this.age=age;
//		this.kor=kor;
		public String average(int kor, int lish) {    // 두과목 평균 구하는 메서드
			avg=(kor+lish)/2;
			
			return name+"두 과목의 평균:"+avg;
		}

	
//	Avg3 (String name, int age, String kor, String lish, String math) {   
//		this.name=name;
//		this.age=age;
//		this.kor=kor;
//		this.lish=lish;
//		this.math=math;
		public String average(int kor, int lish, int math) {   // 세과목 평균 구하는 메서드
			avg=(kor+lish+math)/3;
			
			return name+"두 과목의 평균:"+avg;
		}
	}
	
//	public String Avg3(int i, int j) {
//		int st_avg=(i+j)/2;
//		return name+" "+st_avg;
//	}

public class AvgTest_06 {

	public static void main(String[] args) {
		Avg3 student1=new Avg3();
		Avg3 student2=new Avg3();
		
		student1.name="김철수";
		student2.name="김영희";
		
		String st1_avg=student1.average(70,80);
		String st2_avg=student2.average(80,90,100);
		
		System.out.println(st1_avg);
		System.out.println(st2_avg);
	}
}

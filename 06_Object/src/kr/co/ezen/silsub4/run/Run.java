package kr.co.ezen.silsub4.run; //08-31

import kr.co.ezen.silsub4.model.vo.Student.Student;

public class Run {

	public static void main(String[] args) {
		Student st=new Student();
		
		 st.setGrade(1);
		 st.setClassroom(1);
		 st.setName("루피");
		 st.setHeight(163.0);
		 st.setGender('여');
		 
		 
	System.out.println(st.getGrade());
	System.out.println(st.getClassroom());
	System.out.println(st.getName());
	System.out.println(st.getHeight());
	System.out.println(st.getGender());
	
	System.out.println(st.information());
	
	}
}

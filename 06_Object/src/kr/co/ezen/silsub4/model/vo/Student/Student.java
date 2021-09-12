package kr.co.ezen.silsub4.model.vo.Student; //08-31

public class Student {  // 필드
	public int grade;
	public int classroom;
	public String name;
	public double height;
	public char gender;
	
	
	public int getGrade() {  // 메서드 
		return grade;
	}
	public void setGrade(int grade) {  
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() { 
		return grade+"학년"+classroom+"반"+name+height+gender+"입니다.";
	}
}

package kr.co.ezen.silsub7.model.vo;
	// 겟또셋또 쓰는 이유는 : 중간에 혹시라도 값을 바꿔서 하거나 그 값으로 조건을 처리할려고 할때 사용 ( 하기위해서 미리 선언해놓고 나중에 불러서 쓰는것임)
public class Employee {   // 필드

	private static int count = 1;
	private int empNo;
	private String empName;
	private String dept;
	private int age;
	private char gender;
	private int salary;
	private String phone;
	private String address;

	{
		empNo = count++;  
	}

	public Employee() {  // 생성자

	}

	public Employee(String empName, String dept, int age, char gender, int salary, String phone, String address) {
		this.empName = empName;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String information() { // 임포메이션으로 이미 밑의 값 메서드(변수)를 불러옴(초기화되어있는값 (위에서 필드 부분에 이미 초기화됨))--> 프라이빗으로 필드에 선언되어있음 그래서 런에 들어가서 임포메이션을 호출 하면 값이 나옴 ( 겟을 안써두)

		return "[" + "사번 = " + empNo +
				", 사원명 = " + empName +
				", 부서명 = " + dept +
				", 나이 = " + age +
				", 성별 = " + gender +
				", 연봉 = " + salary +
				", 번호 = " + phone +
				", 주소 = " + address;
	}
}

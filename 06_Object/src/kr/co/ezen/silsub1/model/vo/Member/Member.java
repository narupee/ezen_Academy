package kr.co.ezen.silsub1.model.vo.Member;

public class Member {
	public String memberId;
	public String memberPwd;
	public String memberName;
	public String age;   // 나이
	public char gender;   // 성별
	public String phone;
	public String email;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String string) {
		this.age = string;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
//	}
	
//	public String information() {
//		
//		return "Member[memberId="+memberId+", memberPwd="+memberPwd+", memberName="+memberName+", age="+age+", gender="+gender+",phone="+phone+",email="+email+"]";
//		
//	}
//	public static int getStock() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public void setGender(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public static void setStock(int i) {
//		// TODO Auto-generated method stub
//		
	}
}
	
	
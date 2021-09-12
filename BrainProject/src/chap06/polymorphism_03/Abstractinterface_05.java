package chap06.polymorphism_03;

abstract class PersonalNumberStorage{
	public abstract void addPersonalInfo(String name, String perNum);
	public abstract String searchName(String perNum);
}

 class PersonalNumInfo{   // 1번 여기 String 2개의 생성자 값
	 String name;
	 String number;
	 
	 PersonalNumInfo(String name, String number){
		 this.name=name;
		 this.number=number;
	 }
	 
	 String getName() {
		 return name;
	 }
	 
	 String getNumber() {
		 return number;
	 }
 }

 class PersonalNumberStorageImpl extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;   // 배열만듬
	int numOfPerInfo;
	
	
	public PersonalNumberStorageImpl(int sz) {
		perArr=new PersonalNumInfo[sz];     // 얘를 초기화 시킨다
		numOfPerInfo=0;
	}
	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo]=new PersonalNumInfo(name, perNum);   // 객체생성 (생성자 값 받아옴 위에 1번꺼 받아옴)
		numOfPerInfo++;   // 후위연산자 (단독으로 있을땐 전위 또는 후위 상관없음)
	}

	@Override
	public String searchName(String perNum) {   // 주민번호 들어가고, 반복문, 문자열비교, 해당문, 리턴 시켜야함 ^^
		for(int i=0;i<numOfPerInfo;i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0) {   // equals 나 compareTo 문자열비교는 같음 // 0은 perNum 과 compareTo가 같을때 ==0이다 라는 뜻
				return perArr[i].getName(); 
			}
		}
		return null;  // for 반복문에서 해당되는 번호가 없을 경우 땜에 리턴 null; 이 들어감!
	}
 }
 
public class Abstractinterface_05 {

	public static void main(String[] args) {
		PersonalNumberStorage storage=new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("김기동","950000-1122333");
		storage.addPersonalInfo("장산길","970000-1122334");
		storage.addPersonalInfo("루피","930000-1122334");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
		System.out.println(storage.searchName("930000-1122334"));
	}
	
}







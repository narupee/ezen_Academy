package kr.co.ezen.chap03_field.part01_KindsOfVariable.model.vo;

public class FieldTest2 {
	public String pubA="public";
	String defB="default";
//	public 이랑 private 이 접근 제한자
//	접근 제한자를 안쓰면 default
	// protected 상속에서 사용
	private String priC = "private";

	public static String pubSta = "public static";
	private static String priSta = "private static";

	public FieldTest2() {

	}

	public String getPubA() {
		return pubA;
	}

	public void setPubA(String pubA) {
		this.pubA = pubA;
	}

	public String getDefB() {
		return defB;
	}

	public void setDefB(String defB) {
		this.defB = defB;
	}

	public String getPriC() {
		return priC;
	}

	public void setPriC(String priC) {
		this.priC = priC;
	}

	public static String getPubSta() {
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		FieldTest2.pubSta = pubSta;
	}

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest2.priSta = priSta;
	}
}


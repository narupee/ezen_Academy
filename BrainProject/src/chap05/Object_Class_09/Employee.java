package chap05.Object_Class_09;

public class Employee { // 고용인
	private int myMoney;

	public Employee(int money) {
		myMoney = money;
	}

	public void earnMoney(int money) {
		myMoney += money;
	}

	public void showMyMoney() {
		System.out.println(myMoney);
	}
	
	public static void main(String[] args) {
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);

		emr.payForWork(eme, 1000);

		emr.showMyMoney();
		eme.showMyMoney();
	}

}
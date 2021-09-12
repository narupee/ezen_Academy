package chap05.Object_Class_09;

public class Employer { // 고용주
	private int myMoney;

	public Employer(int money) {
		myMoney = money;
	}

	public void payForWork(Employee emp, int money) { // 급여

		if (myMoney < money)
			return;
		emp.earnMoney(money);
		myMoney -= money;
	}

	public void showMyMoney() {
		System.out.println(myMoney);
	}
	/*
	public static void main(String[] args) {
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);

		emr.payForWork(eme, 1000);

		emr.showMyMoney();
		eme.showMyMoney();
	}
	*/
}
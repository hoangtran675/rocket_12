package Abstraction;

public class Waiter extends User {

	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay(double lcb) {
		return super.getSalaryRatio() * 220;
	}

}

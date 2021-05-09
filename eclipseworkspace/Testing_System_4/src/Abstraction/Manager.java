package Abstraction;

public class Manager extends User{

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay(double lcb) {
		return super.getSalaryRatio() * 520;
	}

}

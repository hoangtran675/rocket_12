package Abstraction;

public class Manager extends User{

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay(double lcb) {
		// TODO Auto-generated method stub
		return super.getSalaryRatio() * 520;
	}

}

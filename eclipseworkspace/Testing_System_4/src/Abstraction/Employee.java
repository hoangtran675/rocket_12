package Abstraction;

public class Employee extends User{

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay(double lcb) {
		// TODO Auto-generated method stub
		return super.getSalaryRatio() * 420;
	}

	
	

}

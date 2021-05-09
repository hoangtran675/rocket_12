package Abstraction;

public abstract class User {
	private String name;
	private double salaryRatio;
	
	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	public abstract double calculatePay(double lcb);
	public String displayInfor(){
		return "Name : " + getName() +
				"\nSalary Ratio : "+ getSalaryRatio();
		}
}

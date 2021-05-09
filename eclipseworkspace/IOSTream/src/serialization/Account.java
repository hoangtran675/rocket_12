package serialization;
import java.io.Serializable;
public class Account implements Serializable{
	int id;
	String name;
	double salary;
	transient int snn;
	
	Account(int id, String name, double salary, int snn){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.snn = snn;
	}
}

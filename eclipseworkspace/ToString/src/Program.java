
public class Program {

	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.firstName = "Tran";
		passenger.lastName = "Hoang";
		passenger.id = 1;
		System.out.println(passenger);
		System.out.println(passenger.hashCode());
	}

}

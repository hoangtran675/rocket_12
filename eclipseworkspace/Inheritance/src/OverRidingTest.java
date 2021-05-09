
public class OverRidingTest {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Bus bus = new Bus();
		System.out.println("Car : " + car.fuel());
		System.out.println("Bus : " + bus.fuel());
		System.out.println("Bike : " + bike.fuel());
	}
}

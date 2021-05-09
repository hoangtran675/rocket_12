
public class Passenger {
	int id;
	String firstName;
	String lastName;
	@Override
	public String toString() {
		return "Passenger Information is First Name:" + this.firstName + " Last Name: "+this.lastName;
	}
	@Override
	public int hashCode() {
		return id;
	}
	public int getId(){
		return id;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	@Override
	public boolean equals(Object obj) {
		Passenger passenger = new Passenger();
		if( (passenger.getId() == this.id ) && (passenger.getFirstName().equals(this.firstName)) && (passenger.getLastName().equals(this.lastName))){
			return true;
		}
		else{
			return false;
		}
	}
}


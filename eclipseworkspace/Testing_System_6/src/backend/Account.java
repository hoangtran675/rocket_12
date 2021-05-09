package backend;

public class Account {
	private int id;
	private String email;
	private String userName;
	private int age;

	public void inputAge(int age){
		try{
			if(age <= 0 ){
				throw new InvalidAgeInputingException("The age must be greater than 0");
			} else{
				this.age = age;
			}
		}catch(InvalidAgeInputingException e){
			System.err.println(e.getMessage());
		}
		
	}
}

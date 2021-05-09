import java.time.LocalDate;
import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		// Question 1
		
		System.out.println(random.nextInt());
		// Question 2
		System.out.println(random.nextFloat());
		// Question 3
		String[] name = {"Hoang","Ngoc","Tuyen","Le","Huyen","Vu"};
		int a = random.nextInt(name.length);
		System.out.println(name[a]);
		
		// Question 4
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		
		// Question 5
		int maxDay1 = (int) LocalDate.now().toEpochDay();
		long randomInt1 = maxDay1 - random.nextInt(365);
		LocalDate randomDay1 = LocalDate.ofEpochDay(randomInt1);
		System.out.println(randomDay1);
		
		// Question 6
		int maxDay2 = (int) LocalDate.now().toEpochDay();
		long randomInt2 = random.nextInt(maxDay2);
		LocalDate randomDay2 = LocalDate.ofEpochDay(randomInt2);
		System.out.println(randomDay2);
		
		// Question 7
		System.out.println(random.nextInt(999-100+1) + 100);
		
	}

}

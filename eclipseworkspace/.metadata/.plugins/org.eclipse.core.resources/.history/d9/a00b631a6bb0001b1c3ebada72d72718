package comparing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		// students.add(new Student(1, "Hoang", LocalDate.of(1998,10,10), 9));
		// students.add(new Student(2, "Lan", LocalDate.of(1998,10,10), 7));
		// students.add(new Student(3, "Yen", LocalDate.of(1998,10,10), 10));
		// students.add(new Student(4, "Toan", LocalDate.of(1998,10,10), 8));
		// students.add(new Student(5, "Trinh", LocalDate.of(1998,10,10),5));
		// // sap xep theo ten
		// Collections.sort(students, new ComparatorName());
		// System.out.println("Sap xep theo ten");
		// for (Student student : students) {
		// System.out.println(student.toString());
		// }

		students.add(new Student(1, "Hoang", LocalDate.of(1998, 10, 8), 7));
		students.add(new Student(2, "Hoang", LocalDate.of(1998, 10, 8), 9));
		students.add(new Student(3, "Yen", LocalDate.of(1998, 10, 10), 10));
		students.add(new Student(4, "Yen", LocalDate.of(1998, 9, 10), 8));
		students.add(new Student(5, "Yen", LocalDate.of(1998, 10, 10), 5));
		students.add(new Student(6, "Hoang", LocalDate.of(1998, 5, 10), 5));
		students.add(new Student(7, "Hoang", LocalDate.of(1998, 9, 8), 10));

		// Sap xep theo ten, ngay sinh, diem
		Collections.sort(students, new ComparatorName().thenComparing(new ComparatorDate().thenComparing(new ComparatorScore())));
		for (Student student : students) {
			System.out.println(student.toString());
		}

	}

}

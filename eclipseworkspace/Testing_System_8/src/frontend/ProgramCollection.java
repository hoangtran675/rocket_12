package frontend;

import java.util.ArrayList;
import java.util.List;

import entity.StudentCollection;

public class ProgramCollection {
	public static List<StudentCollection> s ;
	public static void main(String[] args) {
		s = new ArrayList<StudentCollection>();
		s.add(new StudentCollection("Hoang"));
		s.add(new StudentCollection("Hoang"));
		s.add(new StudentCollection("Hieu"));
		s.add(new StudentCollection("Yen"));
		s.add(new StudentCollection("Hoang"));
		s.add(new StudentCollection("Loan"));
	}
}

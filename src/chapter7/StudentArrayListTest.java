package chapter7;

import java.util.ArrayList;

public class StudentArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> learn = new ArrayList<Student>();

		learn.add(new Student(1001, "James"));
		learn.add(new Student(1002, "Tomas"));
		learn.add(new Student(1003, "Edward"));

		for (int i = 0; i < learn.size(); i++) {
			Student student = learn.get(i);
			student.showStudentInfo();
		}
	}
}

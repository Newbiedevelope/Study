package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentChoi = new Student(1001, "Choi");
		studentChoi.addSubject(" ���� ", 95);
		studentChoi.addSubject(" ���� ", 70);
		studentChoi.addSubject(" ���� ", 60);

		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject(" ���� ", 90);
		studentKim.addSubject(" ���� ", 80);

		studentChoi.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
	}
}

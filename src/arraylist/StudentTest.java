package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentChoi = new Student(1001, "Choi");
		studentChoi.addSubject(" 국어 ", 95);
		studentChoi.addSubject(" 영어 ", 70);
		studentChoi.addSubject(" 수학 ", 60);

		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject(" 국어 ", 90);
		studentKim.addSubject(" 영어 ", 80);

		studentChoi.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
	}
}

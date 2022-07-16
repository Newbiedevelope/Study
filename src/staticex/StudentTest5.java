package staticex;

public class StudentTest5 {
	public static void main(String[] args) {
		Student3 studentChoi = new Student3();
		studentChoi.setStudentName("Choi");
		System.out.println(Student3.serialNum);
		System.out.println(studentChoi.studentCard);

		Student3 studentKim = new Student3();
		studentKim.setStudentName("Kim");
		System.out.println(Student3.serialNum);
		System.out.println(studentKim.studentCard);

	}
}

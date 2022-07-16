package staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student2 studentChoi = new Student2();
		studentChoi.setStudentName("Choi");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentChoi.studentName + " 학번: " + studentChoi.studentID);

		Student2 studentKim = new Student2();
		studentKim.setStudentName("Kim");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentKim.studentName + " 학번: " + studentKim.studentID);
	}

}

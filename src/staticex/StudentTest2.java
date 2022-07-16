package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentChoi = new Student1();
		studentChoi.setstudentName("Choi");
		System.out.println(Student1.serialNum);
		System.out.println(studentChoi.studentName + " 학번: " + studentChoi.studentID);

		Student1 studentKim = new Student1();
		studentKim.setstudentName("Kim");
		System.out.println(Student1.serialNum);
		System.out.println(studentKim.studentName + " 학번: " + studentKim.studentID);
	}

}

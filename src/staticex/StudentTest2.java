package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentChoi = new Student1();
		studentChoi.setstudentName("Choi");
		System.out.println(Student1.serialNum);
		System.out.println(studentChoi.studentName + " �й�: " + studentChoi.studentID);

		Student1 studentKim = new Student1();
		studentKim.setstudentName("Kim");
		System.out.println(Student1.serialNum);
		System.out.println(studentKim.studentName + " �й�: " + studentKim.studentID);
	}

}

package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentChoi = new Student();
		studentChoi.studentName = "Choi";
		System.out.println(Student.serialNum);
		studentChoi.serialNum++;
		
		Student studentKim = new Student();
		studentKim.studentName = "Kim";
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
	}

}

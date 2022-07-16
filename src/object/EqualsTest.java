package object;

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String toString() {
		return studentID + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentID == std.studentID)
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}

}

public class EqualsTest {
	public static void main(String[] args) {
		Student student1 = new Student(100, "개발 초보");
		Student student2 = student1;
		Student student3 = new Student(100, "개발 초보");

		if (student1 == student2) {
			System.out.println("student1과 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다.");
		}

		if (student1.equals(student2)) {
			System.out.println("student1과 student2는 동일합니다.");
		} else {
			System.out.println("student1과 student2는 동일하지 않습니다.");
		}

		if (student1 == student3) {
			System.out.println("student1과 student3의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student3의 주소는 다릅니다.");
		}

		if (student1.equals(student3)) {
			System.out.println("student1과 student3는 동일합니다.");
		} else {
			System.out.println("student1과 student3는 동일하지 않습니다.");
		}

		System.out.println("student1의 hashCode : " + student1.hashCode());
		System.out.println("student3의 hashCode : " + student3.hashCode());

		System.out.println("student1의 실제 주소값 : " + System.identityHashCode(student1));
		System.out.println("student3의 실제 주소값 : " + System.identityHashCode(student3));
	}
}

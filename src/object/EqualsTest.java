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
		Student student1 = new Student(100, "���� �ʺ�");
		Student student2 = student1;
		Student student3 = new Student(100, "���� �ʺ�");

		if (student1 == student2) {
			System.out.println("student1�� student2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("student1�� student2�� �ּҴ� �ٸ��ϴ�.");
		}

		if (student1.equals(student2)) {
			System.out.println("student1�� student2�� �����մϴ�.");
		} else {
			System.out.println("student1�� student2�� �������� �ʽ��ϴ�.");
		}

		if (student1 == student3) {
			System.out.println("student1�� student3�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("student1�� student3�� �ּҴ� �ٸ��ϴ�.");
		}

		if (student1.equals(student3)) {
			System.out.println("student1�� student3�� �����մϴ�.");
		} else {
			System.out.println("student1�� student3�� �������� �ʽ��ϴ�.");
		}

		System.out.println("student1�� hashCode : " + student1.hashCode());
		System.out.println("student3�� hashCode : " + student3.hashCode());

		System.out.println("student1�� ���� �ּҰ� : " + System.identityHashCode(student1));
		System.out.println("student3�� ���� �ּҰ� : " + System.identityHashCode(student3));
	}
}

package staticex;

public class Student3 {
	static int serialNum = 1000;
	int studentID;
	int studentCard;
	String studentName;

	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCard = studentID + 100;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

}

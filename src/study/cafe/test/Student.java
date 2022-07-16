package study.cafe.test;

public class Student {

	private int age;
	private String name;

	public Student() {
		System.out.println(" 생성되었습니다 ");
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

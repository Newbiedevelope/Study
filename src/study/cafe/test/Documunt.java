package study.cafe.test;

public class Documunt {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setAge(10);
		s1.setName("최현지");
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		
		Student s2 = new Student();
		s2.setAge(10);
		s2.setName("김태양");
		
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		
		Student s3 = new Student(12, "규석이");
		System.out.println(s3.getAge());
		System.out.println(s3.getName());
	}
}

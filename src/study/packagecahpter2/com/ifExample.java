package study.packagecahpter2.com;

public class ifExample {
	public static void main(String[] args) {
		int score = 94;
		char grade;
		if(score >= 90 ) {
			grade = 'A';
			System.out.println(grade);
		}
		if(score >= 80) {
			grade = 'B';
			System.out.println(grade);
		}
		if(score >= 70) {
			grade = 'C';
			System.out.println(grade);
		}
		if (score >= 60) {
			grade = 'D';
			System.out.println(grade);
		}
		else {
			grade = 'F';
			System.out.println(grade);
		}
		System.out.println("학점은" + grade + "입니다.");
	}
}
	



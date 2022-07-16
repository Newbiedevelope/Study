package study.packagecahpter2.com;

public class loopExample {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int x = 2; x <= 9; x++) {
				System.out.print(x + " x " + i + " = " + i * x + "\t");
			}
			System.out.println();
		}
	}
}

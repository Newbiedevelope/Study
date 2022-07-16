package study.packagecahpter2.com;

public class MethodEx {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;
		
		int sum = min(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum + "ÀÔ´Ï´Ù." );
	}
	
	public static int min(int n1, int n2) {
		return n1 - n2;
	}
}

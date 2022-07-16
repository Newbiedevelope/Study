package study.packagecahpter2.com;

public class continueExample {
	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 500)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}
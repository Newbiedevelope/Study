package chapter7;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("어린왕자", "생텍쥐페리");
		library[1] = new Book("호빗", "톨킨");
		library[2] = new Book("반지의 제왕", "톨킨");
		library[3] = new Book("노인과 바다", "헤밍웨이");
		library[4] = new Book("헝거게임", "콜린스");

		for (int i = 0; i < library.length; i++) {
			library[i].showInfo();
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}

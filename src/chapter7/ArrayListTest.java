package chapter7;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("어린 왕자", "생텍쥐페리"));
		library.add(new Book("호빗", "톨킨"));
		library.add(new Book("반지의 제왕", "톨킨"));
		library.add(new Book("노인과 바다", "헤밍웨이"));
		library.add(new Book("헝거게임", "콜린스"));

		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		System.out.println();

		System.out.println("===향상된 for문 사용===");
		for (Book book : library) {
			book.showInfo();
		}
	}
}

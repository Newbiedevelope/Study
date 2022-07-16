package chapter7;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("어린 왕자", "생텍쥐페리");
		bookArray1[1] = new Book("호빗", "톨킨");
		bookArray1[2] = new Book("반지의 제왕", "톨킨");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].gerBookName());
			bookArray2[i].setAutohr(bookArray1[i].getAuthor());
		}

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}

		bookArray1[0].setBookName("나목");
		bookArray1[0].setAutohr("박완서");
		System.out.println("===bookArray1===");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}

		System.out.println("===bookArray2===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
	}
}

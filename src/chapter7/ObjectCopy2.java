package chapter7;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("� ����", "�������丮");
		bookArray1[1] = new Book("ȣ��", "��Ų");
		bookArray1[2] = new Book("������ ����", "��Ų");

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

		bookArray1[0].setBookName("����");
		bookArray1[0].setAutohr("�ڿϼ�");
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

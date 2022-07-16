package chapter7;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("� ����", "�������丮"));
		library.add(new Book("ȣ��", "��Ų"));
		library.add(new Book("������ ����", "��Ų"));
		library.add(new Book("���ΰ� �ٴ�", "��ֿ���"));
		library.add(new Book("��Ű���", "�ݸ���"));

		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		System.out.println();

		System.out.println("===���� for�� ���===");
		for (Book book : library) {
			book.showInfo();
		}
	}
}

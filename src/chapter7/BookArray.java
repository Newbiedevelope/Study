package chapter7;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("�����", "�������丮");
		library[1] = new Book("ȣ��", "��Ų");
		library[2] = new Book("������ ����", "��Ų");
		library[3] = new Book("���ΰ� �ٴ�", "��ֿ���");
		library[4] = new Book("��Ű���", "�ݸ���");

		for (int i = 0; i < library.length; i++) {
			library[i].showInfo();
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}

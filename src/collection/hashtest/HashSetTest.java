package collection.hashtest;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("�̼���");
		hashSet.add("�̹��");
		hashSet.add("�̵�");
		hashSet.add("�̼���");
		hashSet.add("�̼���");

		System.out.println(hashSet);
	}
}

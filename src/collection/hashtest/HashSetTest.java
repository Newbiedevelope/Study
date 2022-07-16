package collection.hashtest;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("이성계");
		hashSet.add("이방원");
		hashSet.add("이도");
		hashSet.add("이순신");
		hashSet.add("이순신");

		System.out.println(hashSet);
	}
}

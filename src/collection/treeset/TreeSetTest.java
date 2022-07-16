package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("척준경");
		treeSet.add("권율");
		treeSet.add("강감찬");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}

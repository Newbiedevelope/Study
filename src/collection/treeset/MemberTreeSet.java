package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberID) {
		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + " 가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

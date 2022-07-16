package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberID) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + " 가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

	public void insertMember(Member member, int index) {
		int i = index;
		arrayList.add(i, member);

	}
}

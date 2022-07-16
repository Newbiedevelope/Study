package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();

		Member member1 = new Member(1001, "���� �ʺ�");
		Member member2 = new Member(1002, "�����");
		Member member3 = new Member(1003, "����");
		Member member4 = new Member(1004, "����");

		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(member4.getMemberID());
		memberArrayList.showAllMember();

		memberArrayList.insertMember(member4, 1);
		memberArrayList.showAllMember();
	}
}

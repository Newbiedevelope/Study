package collection.hashtest;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member member1 = new Member(1001, "���� �ʺ�");
		Member member2 = new Member(1002, "�����");
		Member member3 = new Member(1003, "����");

		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.showAllMember();

		Member member4 = new Member(1003, "����");
		memberHashSet.addMember(member4);
		memberHashSet.showAllMember();
	}
}

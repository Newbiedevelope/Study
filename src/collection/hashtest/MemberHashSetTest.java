package collection.hashtest;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member member1 = new Member(1001, "개발 초보");
		Member member2 = new Member(1002, "손흥민");
		Member member3 = new Member(1003, "케인");

		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.showAllMember();

		Member member4 = new Member(1003, "콘테");
		memberHashSet.addMember(member4);
		memberHashSet.showAllMember();
	}
}

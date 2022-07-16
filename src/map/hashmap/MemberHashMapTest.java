package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		Member member1 = new Member(1001, "�����");
		Member member2 = new Member(1002, "����");
		Member member3 = new Member(1003, "�θ޷�");
		Member member4 = new Member(1004, "����");

		memberHashMap.assMember(member1);
		memberHashMap.assMember(member2);
		memberHashMap.assMember(member3);
		memberHashMap.assMember(member4);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}

package chapter12_3.treemap;

import chapter12_3.Member;

public class MemberTreeMapTest {
	public static void main(String[]args) {
		MemberTreeMap list = new MemberTreeMap();
		list.addMember(new Member(1001, "이름 1"));
		list.addMember(new Member(1002, "이름 2"));
		list.addMember(new Member(1003, "이름 3"));
		list.addMember(new Member(1004, "이름 4"));
		
		list.showMembers();
	}
}

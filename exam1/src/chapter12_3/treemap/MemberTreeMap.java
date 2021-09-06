package chapter12_3.treemap;

import java.util.TreeMap;
import chapter12_3.Member;

/** 추가, 삭제, 조회 */
public class MemberTreeMap {
	private TreeMap<Integer, Member> memberList;
	
	public MemberTreeMap() {
		memberList = new TreeMap<Integer, Member>();
	}
	
	/** 추가 */
	public void addMember(Member member) {
		memberList.put(member.getMemberId(), member);
	}
	
	/** 삭제 */
	public boolean removeMember(int memberId) {
		if(memberList.containsKey(memberId)) {
			memberList.remove(memberId);
			return true;
		} else {
			return false;
		}
	}
	
	/** 출력 */
	public void showMembers() {
		
	}
}

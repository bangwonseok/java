package chapter10_5;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[]args)throws IOException {
		System.out.println("전화 상담 배분 방식 선택");
		System.out.println("R - 순서대로 배분");
		System.out.println("L - 짧은 대기열 찾아 배분");
		System.out.println("P - 우선 순위에 따라서 배분");
		
		/*
		 * 1바티으 문자 1개
		 * int -> 엔터 -1
		 */
		int ch = System.in.read();
		Scheduler scheduler = null;
		if(ch == 'R') {
			scheduler = new RoundRobin();
		} else if( ch=='L') {
			scheduler = new LestJob ();
		} else if(ch=='P') {
			scheduler = new PriorityAllocation();
		}
		
		scheduler.getNextCall();	
		scheduler.sendCallToAgent();
	}
}

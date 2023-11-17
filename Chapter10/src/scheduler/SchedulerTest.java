package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 가장 높은 고객 먼저 할당");
		System.out.println("A : 상담원이 필요에 따라 대기열에서 가져옴");

		int ch = System.in.read();
		Scheduler scheduler = null;
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		} else {
			System.out.println("지원하지 않는 기능입니다.");
			return; // 메인 메서드를 리턴 해서 이 밑의 내용을 실행하지 않고 그대로 종료시키기 위해 사용
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

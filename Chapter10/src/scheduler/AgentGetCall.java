package scheduler;

public class AgentGetCall implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담원이 다음 전화를 요청합니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("상담원이 전화 상담을 가져 갔습니다.");
	}
}

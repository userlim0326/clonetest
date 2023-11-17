package scheduler;
//예제 시나리오
// 고객센터에는 전화 상담을 하는 상담원들이 있다.
// 고객센터로 전화가 오면 대기열에 저장된다.
// 상담원이 지정되기 전까지 대기 상태가 된다.
// 각 전화를 상담원에게 배분하는 정책은 이와 같다.

//1. 순서대로 배분하기
//2. 짧은 개기열 찾아 배분하기
//3. 우선순위에 따라 배분하기
//4. 상담원이 필요에 따라 대기열에서 가져오는 정책

//class name : AgentGetCall
//getNextCall() : 상담원이 다음 전화 요청
//sendCallToAgent() : 상담원이 전화 상담을 가져 갔습니다.
// A, a : 위의 내용이 실행되도록 만들어주기
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
	
}

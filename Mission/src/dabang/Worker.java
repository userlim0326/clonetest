package dabang;

public class Worker {
	//1.아침 출근길에 김씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 이씨는 콩
//	다방에서 4500원을 내고 라테를 사 마셨습니다. 학생, 버스, 지하철 실습과 같이 객체간 협력
//	을 이용하여 위의 내용의 코드를 작성하세요.
	public String workerName;
	public int money;
	
	public Worker(String workerName, int money) {
		this.workerName =  workerName;
		this.money = money;
	}
	
	public void takeStar(Star star) {
		star.take("아메리카노");
		this.money -= 4000;
	}
	public void takeBean(Bean bean) {
		bean.take("라테");
		this.money -= 4500;
	}
	public void showInfo() {
		System.out.println(workerName + "씨의 잔액은 " + money + " 원 입니다.");
	}
}

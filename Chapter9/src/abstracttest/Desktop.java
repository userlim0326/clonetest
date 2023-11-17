package abstracttest;

public class Desktop extends Computer {
	
	//추상 클래스를 상속 받은 후 추상메서드를 구현하면 일반 클래스 사용할 수 있음.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing()");
	} 
	
	//클래스가 추상 클래스를 상속 받는법 
	//1. 수동이던 오버라이드던 상속 받은 후의 추상메서드를 구현한다.(위의 각주랑 같은 말)
	//2. 상속 받는 클래스를 추상클래스로 만든다. (class에 abstract 첨가하라는 뜻)
}

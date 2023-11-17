package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // class Animal로부터 상속받음
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal { // class Animal로부터 상속받음
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리는 하늘을 날 수 있습니다.");
	}
}

class Tiger extends Animal { // class Animal로부터 상속받음
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 잘 합니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Animal());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Tiger());
		System.out.println("--------------다운 캐스팅----------------");

		// 다운 캐스팅
		// 상위 클래스로 형 변환 되어있던 클래스를 본래의 하위 클래스로 형 변환하는 것
		Animal human = new Human(); //
//		human.readBook();	상위클래스 Animal엔 readBook이 없어서 오류.
		Human cHuman = (Human) human; // Human으로 다운 캐스팅하여 오류 해결
		cHuman.readBook();

		// 다운 캐스팅이 가능하려면 형 변환 되기전의 자료형과 같아야 한다.
//ex)		Animal human = new Eagle(); 변환 되기전 Eagle
//			human.cHuman = (Human)human; Human으로 다운캐스팅
//			cHuman.readBook(); 형 변환 되기전과 자료형이 달라서 외관상 오류는 없지만
//								출력시 오류 발생

		Animal human2 = new Eagle(); // new Human,Eagle,Tiger시 각각의 결과가 출력됨
		if (human2 instanceof Human) {
			Human cHuman2 = (Human) human;
			cHuman2.readBook();
		} else if (human2 instanceof Eagle) {
			Eagle cEagle = (Eagle) human2;
			cEagle.flying();
		} else if (human2 instanceof Tiger) {
			Tiger cTiger = (Tiger) human2;
			cTiger.hunting();
		} else {
			human2.move();
		}
	}

	public void moveAnimal(Animal animal) { // 매개변수Animal을 통해 4가지 move를 다 사용
		animal.move();
	}
	// 상속(extends Animal)을 지운다면 Human, Eagle, Tiger매개변수를 가져올 수 없음
	// 그러면 자료형을 하나 하나 만들어야하는 번거로운 작업을 해야함
}

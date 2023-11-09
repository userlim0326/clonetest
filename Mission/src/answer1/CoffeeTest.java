package answer1;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarCafe sCafe = new StarCafe("서면점");
		BeanCafe bCafe = new BeanCafe("서면점");
		Customer kim = new Customer("김씨", 10000);
		Customer lee = new Customer("이씨", 10000);
		kim.takeStarCafe(sCafe, 4000);
		lee.takeBeanCafe(bCafe, 4500);
		kim.showInfo();
		lee.showInfo();
		
	}

}

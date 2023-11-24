package lambda;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calcTest = (num1, num2) -> num1 + num2;
		System.out.println(calcTest.add(22, 24));
	}
}

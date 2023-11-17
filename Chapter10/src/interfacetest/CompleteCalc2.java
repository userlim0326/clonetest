package interfacetest;

public class CompleteCalc2 implements Calc {
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num1 == 0 || num2 == 0) {
			return Calc.ERROR;
		} else {
			return num1 / num2;

		}
	}

	@Override
	public int square(int num) {
		// TODO Auto-generated method stub
		return num * num;
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}

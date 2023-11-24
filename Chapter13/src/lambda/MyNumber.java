package lambda;
//함수형 인터페이스를 뜻하는 어노테이션
@FunctionalInterface

//함수형 인터페이스는 한개의 추상 메서드만 만들 수 있습니다.
public interface MyNumber { 
	int getMax(int num1, int num2);
//	int getMin(int num1, int num2);

}

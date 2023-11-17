package interfacetest;

//인터페이스들 끼리 상속할 땐 extends를 사용해야함.
public interface MyInterface extends X, Y{// extends가 아닌 implements 사용시 오류
	void myMethod();
}

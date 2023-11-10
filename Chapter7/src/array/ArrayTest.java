package array;

import java.util.Arrays;

class Student1 {
	
}

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array : 배열
		int student1 = 1001;
		int student2 = 1002;
		int student3 = 1003;
		//자료형 : 기본자료형, **객체자료형 가능**
		
		//1. 자료형 [] 배열이름 = new 자료형[배열의 갯수]; or 자료형 배열이름 [] = new 자료형[배열의 갯수];
		int [] studentArray = new int[100]; // int [] ...Array = new int [x];
		Student1[] students = new Student1[100];
		
		//2. 자료형 [] 배열이름 = {자료형에 맞는 값,자료형에 맞는 값};
		int [] studentIDs = {1001, 1002, 1003, 1004, 1005};
		
		//배열의 인덱스(목차)는 0번부터 시작함
		studentArray[0] = 1001;
		studentArray[1] = 1002;
		System.out.println(studentArray[0]);
		System.out.println(studentArray[1]);
		
		int id = 1003;
		for(int i=0; i<100; i++) {
			studentArray[i] = id;
			id++;
			System.out.println(studentArray[i]);
		}
		//length : 배열 갯수를 세어줌 >> 배열의 갯수 확인 변수, 배열의 데이터가 저장되어있는 크기가 아닌 처음에 설정한 크기 변환
		System.out.println(studentArray.length);
		
		char[] charArray = new char[26];
		char start = 'A';
		for(int i=0; i<charArray.length; i++) {
			charArray[i] = start;
			start++;
			System.out.println(charArray[i] + "," + (int)charArray[i]); //(int) : 명시적 형변환(캐스트)
		}
		System.out.println(Arrays.toString(charArray));
		
	}
}

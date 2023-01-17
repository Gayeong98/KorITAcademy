package chapter01;

public class Example02 {

	public static void main(String[] args) {
		// 배열
		// 변수가 나열된 형태
		int[] numbers;
		numbers = new int[10];
		System.out.println(numbers);
		
		char[] characters;
		characters = new char[10];
		System.out.println(characters);
		
		System.out.println("------------------");

		// 배열 초기화
		int[] arrNumber = new int[] {1,2,3};
		System.out.println(arrNumber);
		System.out.println(arrNumber[0]);
		System.out.println(arrNumber[1]);
		System.out.println(arrNumber[2]);
		System.out.println(arrNumber.length);
		
		char[] string = {'h','e','l','l','o'};
		System.out.println(string);
		System.out.println(string.length);
		
		System.out.println("------------------");
		
		// 다차원 배열
		// 배열의 요소가 배열인 형태
		int[][] arrNum2 = {{1,2,3}, {4,5,6}};
		System.out.println(arrNum2[0][1]);
		
		System.out.println("------------------");
		
		// 문자열
		// 단어 혹은 문장을 쉽게 표기하기 위한 Java object class
		String str1;
		str1 = new String();
		str1 = "apple";
		System.out.println(str1);
		String str2 = "banana";
		System.out.println(str2);
		System.out.println("------------------");
	}

}

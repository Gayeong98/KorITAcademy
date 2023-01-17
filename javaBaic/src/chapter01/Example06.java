package chapter01;

public class Example06 {

	public static void main(String[] args) {
		// 제어문(반복문) for
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		int[] numbers = new int[5];
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = i + 1;
//		}
//		
//		System.out.println(numbers[8]);
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("==============");
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}

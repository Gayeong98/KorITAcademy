package chapter01;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 제어문(조건문) if
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 >> ");
//		int age = sc.nextInt();
//		if(age > 19) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
		
//		int number = 0;
//		if(number > 0) {
//			System.out.println("양수입니다.");
//		} else if(number < 0) {
//			System.out.println("음수입니다.");
//		} else { 
//			System.out.println("0입니다.");
//		}
		
		// 0이 아닐 경우에만 연산을 실행해라.
		// 0이면 0이라고 출력.
		int inputValue = sc.nextInt();
		
//		if(inputValue != 0) {
//		
//			int a = 10 / inputValue;
//			int b = a * inputValue;
//			b++;
//			System.out.println(a * b);
//			
//		} else {
//			System.out.println("0입니다.");
//		}
		
		// 아래 코드와 결과는 같다.
		
		if(inputValue == 0) {
			System.out.println("0입니다.");
			return;
		}
		int a = 10 / inputValue;
		int b = a * inputValue;
		b++;
		System.out.println(a * b);
		
	}

}

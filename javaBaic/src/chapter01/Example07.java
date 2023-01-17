package chapter01;

public class Example07 {

	public static void main(String[] args) {
		// 제어문(반복) while
		boolean flag = true;
		int number = 0;
		
		while (flag) {
			System.out.println("loop" + number);
//			number += 1;
//			number++;
//			if(number++ == 10) {
//				flag = false;
//			}
			flag = ++number != 10;
		}

		// 제어문(반복) do - while
		// continue : 반복문이 continue문을 만났을 때 아래에 존재하는 코드를 무시하고 상단의 조건 검사부로 넘어간다.
		while(flag) {
			System.out.println("While Loop!");
		}
		
		do {
			System.out.println("Do While Loop!");
		} while(flag);
		
		System.out.println("=================");
		
		number = 0;
		while (true) {
			if(number++ % 3 == 0) {
				System.out.println("Continue!");
				continue;
			}
			if(number > 10) {
				System.out.println("break!");
				break;
			}
			
			System.out.println(number);
		}
		System.out.println("out of Loop");
	}

}

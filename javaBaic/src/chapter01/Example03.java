package chapter01;

public class Example03 {

	public static void main(String[] args) {
		// 산술 연산자
		// 더하기 (+)
		System.out.println(8 + 3);
		
		// 빼기 (-)
		System.out.println(8 - 3);
		
		// 곱하기 (*)
		System.out.println(8 * 3);
		
		// 나누기 (/)
		System.out.println(8 / 3);
		System.out.println(8.0 / 3);
		
		// 나머지 (%)
		System.out.println(8 % 3);
		
		// 증가 (++)
		int plus1 = 0;
		System.out.println(plus1++);
		System.out.println(plus1);
		
		// 감소(--)
		int minus1 = 0;
		System.out.println(minus1--);
		System.out.println(minus1);
		
		System.out.println("---------------------");
		
		// 대입 연산자
		int number = 8;
		number += 3; // number = number + 3과 같다
		System.out.println(number);
		number -= 3;
		System.out.println(number);
		number *= 3;
		System.out.println(number);
		number /= 3;
		System.out.println(number);
		number %= 3;
		System.out.println(number);
		System.out.println("---------------------");
		
		// 비교 연산자
		// 같다 (==)
		System.out.println(8 == 3);
		
		// 다르다 (!=)
		System.out.println(8 != 3);
		
		// 크다
		System.out.println(8 > 3);
		
		// 작다
		System.out.println(8 < 3);
		
		// 크거나 같다
		System.out.println(8 >= 3);
		
		// 작거나 같다
		System.out.println(8 <= 3);
		
		System.out.println("---------------------");
		
		// 논리 연산자
		// and 연산자 (&&)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println("---------------------");
		
		// 연산 과정 중 false가 있으면 무조건 false
		// 해당 논리 뒤의 연산은 실행하지 않음
		
		// or 연산자 (||)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println("---------------------");
		
		// 연산 과정 중 true가 존재하면 무조건 true
		// 해당 논리 뒤의 연산은 실행하지 않음
		
		// not 연산자
		System.out.println(!true);

	}

}

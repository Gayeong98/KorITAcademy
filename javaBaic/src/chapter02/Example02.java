package chapter02;

import javax.print.attribute.standard.DateTimeAtCreation;

class Triangle {
	// 밑변
	double base;
	// 높이
	double height;
	// 대각선
	double diagonal;
	
	void createAndPrint() {
		base = 3;
		height = 4;
		diagonal = 5;
		
		System.out.println("==========================");
		System.out.println("base : " + base + "/ height : " + height + " / diagonal : " + diagonal);
		System.out.println("==========================");
	}
	
}

class Pythagoras {	
	// Math.pow() : 제곱
	// Math.sqrt() : 제곱근(루트)
	
	// 대각선의 길이
	static double getDiagonal(double base, double height) {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	
	// 밑변의 길이
	static double getBase(double diagonal, double height) {
		return Math.sqrt(Math.pow(diagonal, 2) - Math.pow(height, 2));
	}
	
	// 높이의 길이
	static double getHeight(double diagonal, double base) {
		return Math.sqrt(Math.pow(diagonal, 2) - Math.pow(base, 2));
	}
}

public class Example02 {
	public static void main(String[] args) {
		SmartPhone[] phones = new SmartPhone[3];
		
		// 초기화 작업
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
			phones[i] = new SmartPhone();
		}
		
		System.out.println("==================");
		System.out.println(phones);
		System.out.println("==================");
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.nation = "United State";
			phone.os = "IOS";
			phone.owner = "John";
			phone.telNumber = "010-1111-1111";
			
		}
		System.out.println("==================");
		for(SmartPhone phone : phones) {
			System.out.println(phone.nation);
			System.out.println(phone.os);
			System.out.println(phone.owner);
			System.out.println(phone.telNumber);
		}
		System.out.println("==================");
		
//		Pythagoras p1 = new Pythagoras();
		
//		p1.base = 10;
//		p1.height = 20;
		
//		System.out.println(p1.creator);
		
//		Pythagoras p2 = new Pythagoras();
		
		System.out.println(Pythagoras.getDiagonal(10,20));
		
		// 삼각형 인스턴스
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Triangle t3 = new Triangle();
		Triangle t4 = new Triangle();
		Triangle t5 = new Triangle();
		Triangle t6 = new Triangle();
		Triangle t7 = new Triangle();
		Triangle t8 = new Triangle();
		Triangle t9 = new Triangle();
		Triangle t10 = new Triangle();
		
		// Triangle 인스턴스를 초기화하고 출력
		t1.createAndPrint();
		t2.createAndPrint();
		t3.createAndPrint();
		t4.createAndPrint();
		t5.createAndPrint();
		t6.createAndPrint();
		t7.createAndPrint();
		t8.createAndPrint();
		t9.createAndPrint();
		t10.createAndPrint();
		
		
		
	}
}

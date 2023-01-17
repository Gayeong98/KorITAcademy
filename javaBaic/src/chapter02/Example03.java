package chapter02;

class MyMath {
	static double getEquilateralTraingleArea(double side) {
		// 매개변수 검증
		if(side <= 0) return 0;
		
		double result = (Math.sqrt(3)/4) * Math.pow(side, 2);
		return result;
	}
	
	static double getEquilateralTriangleHeight(double side) {
		// 매개변수 검증
		if(side <= 0) return 0;
		
		double equilateralTriangleHeight = (Math.sqrt(3)/2) * side;
		return equilateralTriangleHeight;
	}
	
	static int Increase(int number) {
		number++;
		System.out.println("In of Method");
		System.out.println(number);
		return number;
	}
	
	static void IncreaseTriangle(Triangle triangle) {
		triangle.base++;
		triangle.height++;
		triangle.diagonal++;
		
	}
}


public class Example03 {
	
	public static void main(String[] args) {
		double side = 10.0;
		double EquilateralTraingleArea = MyMath.getEquilateralTraingleArea(side);
		System.out.println(EquilateralTraingleArea);
		
		double equilateralTriangleHeight = MyMath.getEquilateralTriangleHeight(-10);
		System.out.println(equilateralTriangleHeight);
		
		int number = 10;
		int afterNumber = MyMath.Increase(number);
		System.out.println("Out of Method");
		System.out.println(number);

		Triangle triangle = new Triangle();
		triangle.createAndPrint();
		System.out.println(triangle);
		
		MyMath.IncreaseTriangle(triangle);
		System.out.println(triangle.base);
		System.out.println(triangle);
	}

}


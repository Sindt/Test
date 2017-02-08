package cphbusiness.test.sp1.triangle;

public class Game {

	private final static double a = 1;
	private final static double b = 1;
	private final static double c = 1;

	public static void main(String[] args) {
		if (a * b * c > 0) {
			Triangle t = new Triangle(a, b, c);
			
			if (t.isTriangleEqu()) {
				System.out.println("equilateral");
			}
			if (t.isTriangleIso()) {
				System.out.println("isosceles");
			}
			if (t.isTriangleSca()) {
				System.out.println("scalene");
			}
		}

	}

	

}

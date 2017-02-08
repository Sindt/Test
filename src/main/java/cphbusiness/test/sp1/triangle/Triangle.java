package cphbusiness.test.sp1.triangle;

public class Triangle {

	private final static double a = 3;
	private final static double b = 1;
	private final static double c = 2;

	public static void main(String[] args) {
		if (a * b * c > 0) {
			if (isTriangleEqu(a, b, c)) {
				System.out.println("equilateral");
			}
			if (isTriangleIso(a, b, c)) {
				System.out.println("isosceles");
			}
			if (isTriangleSca(a, b, c)) {
				System.out.println("scalene");
			}
		}

	}

	private static boolean isTriangleSca(double a2, double b2, double c2) {
		if ((a2 != b2) && (a2 != c2) && (b2 != c2))
			return true;

		return false;
	}

	private static boolean isTriangleIso(double a2, double b2, double c2) {
		if (((a2 == b2) && (a2 != c2)) || ((a2 == c2) && (a2 != b2)) || ((b2 == c2) && (b2 != a2)))
			return true;
		return false;
	}

	private static boolean isTriangleEqu(double a2, double b2, double c2) {
		if (a2 == b2 && a2 == c2) {
			return true;
		}
		return false;
	}

}

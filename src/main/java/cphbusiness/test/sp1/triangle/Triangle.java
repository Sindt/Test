package cphbusiness.test.sp1.triangle;

public class Triangle {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangleSca() {
		if ((this.a != this.b) && (this.a != this.c) && (this.b != this.c))
			return true;

		return false;
	}

	public boolean isTriangleIso() {
		if (((this.a == this.b) && (this.a != this.c)) || ((this.a == this.c) && (this.a != this.b)) || ((this.b == this.c) && (this.b != this.a)))
			return true;
		return false;
	}

	public boolean isTriangleEqu() {
		if (this.a == this.b && this.a == this.c) {
			return true;
		}
		return false;
	}


}

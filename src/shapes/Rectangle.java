package shapes;

public class Rectangle {
	double length, width;

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return this.length * this.width;
	}

	public double calculatePerimeter() {
		return 2 * (this.length + this.width);
	}

}

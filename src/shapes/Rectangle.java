package shapes;

public class Rectangle {
	int length,width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int calculateArea()
	{
		return this.length*this.width;
	}
	public int calculatePerimeter()
	{
		return 2*(this.length+this.width);
	}

}

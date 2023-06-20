package root;

import shapes.*;

public class App {

	public static void main(String[] args) {

//		Create a class named 'Rectangle' with two data members 'length' and ‘width’. 
//		Its constructor has parameters for length and width to initialize length and width of the rectangle. 
//		Create another class 'Square' that inherits the 'Rectangle' class with its constructor having a parameter for its side. 
//		Calling the constructor of its parent class as 'super(side, side)'. 
//		Complete these classes and print the area and perimeter of a rectangle and a square.

//		Area & Perimeter of rectangle
		Rectangle ractangleShape = new Rectangle(3, 5);
		System.out.println("The area of the rectangle is: " + ractangleShape.calculateArea());
		System.out.println("The perimeter of the rectangle is: " + ractangleShape.calculatePerimeter());
		
		
		System.out.println();

//		Area & Perimeter of square
		Square squareShape = new Square(6);
		System.out.println("The area of the square is: " + squareShape.calculateArea());
		System.out.println("The perimeter of the square is: " + squareShape.calculatePerimeter());

	}

}

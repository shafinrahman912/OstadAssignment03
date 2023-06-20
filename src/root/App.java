package root;
import shapes.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a class named 'Rectangle' with two data members 'length' and ‘width’. 
//		Its constructor has parameters for length and width to initialize length and width of the rectangle. 
//		Create another class 'Square' that inherits the 'Rectangle' class with its constructor having a parameter for its side. 
//		Calling the constructor of its parent class as 'super(side, side)'. 
//		Complete these classes and print the area and perimeter of a rectangle and a square.

		System.out.println("hello...");
		Rectangle ractangleShape=new Rectangle(3,5);
		Square squareShape=new Square(6);
		System.out.println("The area of rectangle is: "+ractangleShape.calculateArea());
		System.out.println("The perimeter of rectangle is: "+ractangleShape.calculatePerimeter());
		System.out.println("The area of square is: "+squareShape.calculateArea());
		System.out.println("The perimeter of square is: "+squareShape.calculatePerimeter());
		
		

	}

}

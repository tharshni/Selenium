package Assignments;

public class staticmethods {
	public static void main(String[] args) {
		staticmethods.Perimeterofrectangle();
		staticmethods.Averageof3numbers();
		staticmethods.productof2decimals();
	}
	/*perimeter of rectangle*/
	public static void Perimeterofrectangle() {
	double l=10.5;
	double w=5.5;
	System.out.println("The perimeter of rectangle is:" +2*(l*w));
		
	}
	
	/*staticmethods.Perimeterofrectangle();*/
	private static void Averageof3numbers() {
		int a=2;
		float b=2.2f;
		double c=3.345;
				System.out.println("Average of 3 numbers is:" +(a+b+c)/3);
		
	}
	
 /*product of two decimal numbers*/
	public static void productof2decimals() {
		float b=2.2f;
		double c=3.345;
				System.out.println("Product of 2 decimal numbers is:" +(b*c));	
	}
}









/*Doubts:
 * This syntax is only for Non static? 
 
staticmethods shapesformula = new staticmethods();
shapesformula.Perimeterofrectangle();*/
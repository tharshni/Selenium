package Basics;

/*import Assignments.staticmethods;*/

public class Day4Methods_m3 {
	public static void main(String[] args) {
		Day4Methods_m3.areaofsquare(10);
		Day4Methods_m3 ob=new Day4Methods_m3();
		ob.productof2numbers(90.1, 8.6f);
		
		/*return types*/
		ob.firstaddition();
		System.out.println("The addition of two numbers is:" +ob.addition());
		System.out.println("Welcome home " +ob.welcome("Priya"));
		
	}
	public static void areaofsquare(int a) {
		System.out.println("The area of square is:" +(a*a));
		
	}
 public void productof2numbers(double a, float b) {
	 System.out.println("The product of 2 numbers is:" +(a*b));
 }
 
 /*return type*/
 public static int firstaddition() {
	 int a=1;
			 int b=1;
			 int x=a+b;
	return x;
}

 public int addition() {
	 int a=1;
	 int b=2;
	 int x=a+b;
	 return x;
	
}
public String welcome(String name) {
	return name;
	
}
	
}
 


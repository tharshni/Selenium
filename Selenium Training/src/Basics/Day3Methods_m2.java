package Basics;

public class Day3Methods_m2 {
	public static void main(String[] args) {
		Day3Methods_m2 ob=new Day3Methods_m2();
		
		ob.areaofcircle();
		ob.additionof3numbers() ;
	}
	public void areaofcircle() {
		double a=3.14;
		int r=2;
		System.out.println("Area of circle is:" +(a*r*r));
		
		
	}
	private void additionof3numbers() {
		int a=2;
		float b=2.2f;
		double c=3.345;
				System.out.println("Product of 3 numbers is:" +(a+b+c));
		
	}
	

}

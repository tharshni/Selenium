package Basics;

import java.util.jar.Attributes.Name;

import Assignments.nonstaticmethods;
import Assignments.staticmethods;

public class Day1Intro2sample {
	
public static void main(String[] args) {
	System.out.println("The First Name is:" +"Priyatharshni");
	System.out.println("The Last name is:" + 'K');
	System.out.println("Age of the person is:" +31);
	
	/*Methods: 1.static */
	Day3Methods.product();
	
	/*Methods: 2.Non static */	 
	Day3Methods_m2 ob=new Day3Methods_m2();
	ob.areaofcircle();
	
	/*Assignments Methods:Non static-BMI*/
	nonstaticmethods bodymassindex=new nonstaticmethods();
	bodymassindex.BMI();
	
	/*Assignments Methods:static-Perimeter of the rectangle */
	staticmethods.Perimeterofrectangle();
	
	/*Assignments Methods:static-product of two decimal numbers */
	staticmethods.productof2decimals();
}
}

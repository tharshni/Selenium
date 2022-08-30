package builtinclass;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("ENter your salary:");
		double sal1=s.nextDouble();
		
		System.out.println("Enter the details:");
		System.out.println("Name is:" +name);
		System.out.println("Age is:" +age);
		System.out.println("Salary is:" +sal1);
		
	}

}

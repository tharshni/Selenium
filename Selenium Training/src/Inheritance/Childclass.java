package Inheritance;

public class Childclass extends Parentclass {
	public static void main(String[] args) {
		
		//calling its own method
		Childclass.cs();//calling its own static class
		Childclass ob=new Childclass(); //calling its own non static class
		ob.cc();
		//after inheritance  child is having full control over parent class
		ob.ps();
		ob.pc();
	}
		
		
		public static void cs() {
			System.out.println("child class static method");
			
		}
		public void cc() {
			System.out.println("child class nonstatic method");
			
		}
	}



package Assignments;

public class nonstaticmethods {
	public static void main(String[] args) {
		nonstaticmethods bodymassindex=new nonstaticmethods();
		bodymassindex.BMI();
		bodymassindex.perimeterofcircle();
		
	}
	/*Program:Bodymass index*/
	public void BMI() {
	int Height=52;
	double Weight=60.5;
	System.out.println("The bodymass index of X is:" +(Weight/Height*Height));	
	
	}
	
	/*Program:perimeter of circle*/
	private void perimeterofcircle() {
		float pi=3.14f;
		double r=1.2344;
	System.out.println("The Perimeter of circle is:" +(2*pi*r));
		
				
		
	}

}

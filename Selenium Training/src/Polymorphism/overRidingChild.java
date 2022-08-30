package Polymorphism;

public class overRidingChild extends overRidingParent{
	public static void main(String[] args) {
		//overriding method
		overRidingChild C =new overRidingChild();
		C.Area();
		
		//overridden method
		overRidingParent P=new overRidingParent();
				P.Area();
	
	}
	//overriding
	public void Area() {
		int S=10;
		System.out.println("Area of Square" +S*S);
		
	}

}

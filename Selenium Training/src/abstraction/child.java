package abstraction;

public class child extends parent{
	
	public static void main(String[] args) {
		child ob =new child();
		ob.area();
		ob.ab();
	
	}
	
	@Override
	public void ab() {
		System.out.println("Abstract method");
		
	}

	

}

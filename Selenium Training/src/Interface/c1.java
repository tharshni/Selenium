package Interface;

public class c1 implements int1 {
	public static void main(String[] args) {
		c1 ob =new c1();
		ob.ns();
		ob.ab();
		
		
	}

	@Override
	public void ab() 
	{
		System.out.println("abstarct method");
		
	}
	
}

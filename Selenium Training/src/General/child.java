package General;

import abstraction.parent;

public class child extends Parent{
	public static void main(String[] args) {
		
		//generalisation: child=>parent
		//(desired) to be converted
		
		/*Parent p=(Parent)new child();
				p.pn();//can call parent method
				//p.cn();//cannot call parent method */
		
		//specialisation pare t=>child
		
		child c=new child();
		c.cn();
		//p.pn();
		
				
	}
	public void cn() {
		System.out.println("can call child method");
		
	}

}

package encapsulation;

import javax.management.loading.PrivateClassLoader;

public class c1 {
	
	private String password;
	//setter
	 public void setp(String p) {
		 password =p;
		
	}
	 //getter
	 public void getp() {
		 System.out.println(password);
		
	}

}

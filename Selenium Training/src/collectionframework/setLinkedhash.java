package collectionframework;

//import java.util.Iterator;
import java.util.LinkedHashSet;

public class setLinkedhash {
	public static void main(String[] args) {
		LinkedHashSet<String> animals=new LinkedHashSet<>();
		
		//add
		animals.add("cat");
		animals.add("cow");
		animals.add("Elephant");
		animals.add("TIGER");
		System.out.println(animals);
		
		//remove
		animals.remove("Elephant");
		System.out.println(animals);
		
		//
		for(String x:animals)
		{
			System.out.println(x);
		}
		
		
				
	}

}

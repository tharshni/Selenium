package collectionframework;

import java.util.TreeMap;

public class maptreemap {
	public static void main(String[] args) 
	{
		//add
		TreeMap<String, Integer> fruits=new TreeMap<>();
		fruits.put("apple", 0);
		fruits.put("mango",1);
		fruits.put("kiwi", 1000);
		fruits.put("pineapple", 0);
		System.out.println(fruits);
		
		//remove
		fruits.remove("mango");
		System.out.println(fruits);
		
		//retrieval
		System.out.println(fruits.get("pineapple"));
		
		//keyset=>ordered keys
		System.out.println(fruits.keySet());
		
		//iterate through the keyset
		
			
		for(String x:fruits.keySet())
		{
			System.out.println(x+":"+fruits.get(x));
		}
	}

}

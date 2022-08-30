package collectionframework;

import java.util.ArrayList;import builtinclass.string;

public class list {
	public static void main(String[] args) 
	{
		//syntax:ArrayList<Datatype> name=new ArrayList<>()
		//add,remove.retrieve only head of queue,size limitation
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("kiwi");
		System.out.println(fruits);
		
		//remove=>know the index
		fruits.remove(1);
		System.out.println(fruits);
		
		//display elements
		//for(datatype temporaryvariable :name of the collection)
		for(String x:fruits)
		{
			System.out.println(x);
		}
		
	}

}

package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class queue {
	public static void main(String[] args) {
		
		//ArrayBlockingQueue<Datatype> name=new ArrayBlockingQueue<>(size)
		////add,remove.retrieve only head of queue,no size limitation,index format,iteration possible
		
		ArrayBlockingQueue<Float> f= new ArrayBlockingQueue<>(4);
				f.add(10.4f);
				f.add(20.4f);
				f.add(30.4f);
				f.add(40.4f);
				System.out.println(f);
				
				//remove value
				f.remove(30.4f);
				System.out.println(f);
				
				//display of elements
				for(float x:f)
				{
					System.out.println(x);
				}
	}

}

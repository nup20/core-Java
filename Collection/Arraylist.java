package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
	
	public static void main(String arg []){
		ArrayList<String> l =new ArrayList<String> ();
		
		l.add("neha");
		l.add("kanak");
		l.add("nupur");
		l.add("riya");
		
		
		
		Iterator<String> itr=l.iterator();
		
		while(itr.hasNext()){//hasnext();
			System.out.println(itr.next()+",");//next();
		}
		
		System.out.println("using get methhod:--"+l.get(2));//get();
		l.set(2, "orange");//set();
		System.out.println("using get methhod:--"+l.get(2));
		
		
		Collections.sort(l);  //sort();
		System.out.println("After Sorting ------");
		  for(String fruit:l)  
		  {
			  
		    System.out.println(fruit);  
		  }
	}

}

package iteratorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorRemover {
	
	String[] words = "a b c d e f g h i j k".split(" ");
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
	String b;
	
	public IteratorRemover(String let){
		b = let;
		System.out.println("remove " + b);
	}
	
	public void remove(){
		System.out.println(list);
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			if(iter.next().equals(b)) {
				iter.remove();
			}
			
		}
		System.out.println(list);
	}

}

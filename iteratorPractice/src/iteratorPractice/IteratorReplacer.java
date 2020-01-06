package iteratorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorReplacer {
	
	String[] words = "a b c d b g s b a b l".split(" ");
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
	String b;
	
	public IteratorReplacer(String let){
		b = let;
		System.out.println("replace " + b);
	}
	
	public void replace(){
		System.out.println(list);
		ListIterator<String> iter = list.listIterator();
		
		while(iter.hasNext()) {
			
			if(iter.next().equals(b)) {
				iter.remove();
				iter.add("+");
			}
			
		}
		System.out.println(list);
	}

}
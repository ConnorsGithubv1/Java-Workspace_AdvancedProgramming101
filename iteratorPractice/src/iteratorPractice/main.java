package iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
		ArrayList<Integer> w = new ArrayList<Integer>();
		w.add(4);
		w.add(6);
		w.add(8);
		Iterator<Integer> iter = w.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
		}
		System.out.println(w);
		
	}

}

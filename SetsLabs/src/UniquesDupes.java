import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes {
	
	String[] words = "a b c d e f g h a b c d e f g h i j k".split(" "); 
	
	Set<String> set = new TreeSet<String>(Arrays.asList(words));
	
	Set<String> uniqSet = new TreeSet<String>();
	Set<String> dupSet = new TreeSet<String>();
	
	List<String> list = new ArrayList<String>(Arrays.asList(words));

	public UniquesDupes() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void originList() {
		System.out.println("origin list:" + list);
	}

	public void uniqueList() {
		// TODO Auto-generated method stub
		System.out.println("uniques:" + set);
	}

	public void dupesList() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < list.size(); i++) {
			if (!uniqSet.add(list.get(i))) {
				dupSet.add(list.get(i));
			}
		}
		System.out.println("duplicates:" + dupSet);
		
	}

}

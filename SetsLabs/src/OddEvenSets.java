import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {

	String[] nums = "1 5 9 4 6 8 12 ".split(" ");
	
	List<String> list = new ArrayList<String>(Arrays.asList(nums));
	
	List<Integer> oddlist = new ArrayList<Integer>();
	
	List<Integer> evenlist = new ArrayList<Integer>();

	
	public OddEvenSets() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void findVal() {
		
		int x = 0;
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			
			x = Integer.parseInt(list.get(i));
			
			
			if (x % 2 == 0) {
			      evenlist.add(x);
			}
			else{
			      oddlist.add(x);
			    }
		}

	}
	
	public String toString()
	{
		return "ODDS : " + oddlist + "\nEVENS : " + evenlist + "\n\n";
	}

}

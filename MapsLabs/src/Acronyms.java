
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	TreeMap<String,String > map = new TreeMap<String,String>();
	
	public Acronyms()
	{



	}
	
	public ArrayList<String> listcreate() throws Exception {
		
		// Creates an Array list from a .dat file
		
		ArrayList<String> acroList = new ArrayList<String>();
		
		String yob = "acro.dat";
		
		File file = new File(yob); 
		
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) {
		    acroList.add(st);
		  } 
		  
		  return acroList;
	}

	  public void putEntry(ArrayList<String> arrayList)
	  {
		  
		  System.out.println("TreeMap:");
		  
		  //Creates the tree map using arraylist made in listcreate();
		  
		   for(int i= 0; i < arrayList.size(); i++)
		   {
			   	
			   	String key = arrayList.get(i).substring(arrayList.get(i).lastIndexOf(0)+1,arrayList.get(i).lastIndexOf("-")-1);
			   	
			   	String value = arrayList.get(i).substring(arrayList.get(i).lastIndexOf("-")+1,arrayList.get(i).length());
			   	
			   	map.put(key, value);
			   	
			   	
		   }
		   
		   System.out.println(map);

		}


		public ArrayList<String> convert(String[] list)
		{
			
			// Creates Arrays with input data and splits
			
			ArrayList<String> t = new ArrayList<String>(Arrays.asList(list));
			
			System.out.println(" "); 
			
			//Arraylist before translation
			System.out.println("Sentence:");
			System.out.println(t);
			
			System.out.println(" ");
			System.out.println("translation:");
			
			for(int i = 0; i < t.size(); i++) {
			
				if(map.get(t.get(i)) == null) {
					System.out.println(t.get(i));
				}else {
					System.out.println(map.get(t.get(i)));
				}
			}
			
			return t;
		}
	public String toString()
	{
		return "";
	}
}
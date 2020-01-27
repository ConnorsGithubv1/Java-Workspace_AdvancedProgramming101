import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SpanishToEnglish {

		TreeMap<String,String > map = new TreeMap<String,String>();

		public SpanishToEnglish()
		{
		}
		
		public ArrayList<String> listcreate() throws Exception {
			
			// Creates an Array list from a .dat file
			
			ArrayList<String> spanList = new ArrayList<String>();
			
			String yob = "spantoeng.dat";
			
			File file = new File(yob); 
			
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) {
			    spanList.add(st);
			  } 
			  
			  return spanList;
		}

		  public void putEntry(ArrayList<String> arrayList)
		  {
			  
			  System.out.println("TreeMap:");
			  
			  //Creates the tree map using arraylist made in listcreate();
			  
			   for(int i= 0; i < arrayList.size(); i++)
			   {
				   	
				   	String key = arrayList.get(i).substring(arrayList.get(i).lastIndexOf(0)+1,arrayList.get(i).lastIndexOf(" "));
				   	
				   	String value = arrayList.get(i).substring(arrayList.get(i).lastIndexOf(" ")+1,arrayList.get(i).length());
				   	
				   	map.put(key, value);
				   	
				   	
			   }
			   
			   System.out.println(map);

			}
		  

		public ArrayList<String> translate()
		{
			
			// Creates Arrays with input data and splits
			
			String[] spanwords = "yo quiero una ordenador virus todas de los muchachos tienen interno memoria mi pelo es cafe tu quieres tinta con su papel rearrancar el ordenador a vacio el pantalla".split(" ");
			
			ArrayList<String> t = new ArrayList<String>(Arrays.asList(spanwords));
			
			System.out.println(" "); 
			
			//Arraylist before translation
			System.out.println("Sentences:");
			System.out.println(t);
			
			System.out.println(" ");
			
			System.out.println("Translation:");
			for(int i=0;i<t.size();i++) {
				System.out.print(map.get(t.get(i)) + " ");
			}
			
			return t;
		}

}

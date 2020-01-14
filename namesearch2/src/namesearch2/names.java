package namesearch2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class names {
	
	private int year;
	private String name;

	public names() {
		// TODO Auto-generated constructor stub
	}

	public int findyear() {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		do {
			
		
		try {
			
		System.out.println("enter year between 1880 and 2018:");
		
		year = S.nextInt();
		
		
		} catch(Exception e) {
			
			System.out.println(year + " is not a year between 1880 and 2018");
			System.out.println("enter year between 1880 and 2018:");
		}
		} while(year > 2018 || year < 1880);
		
		year = 1880;
		
		System.out.println("year:" + 1880);
		
		return 1880;
	}

	public String askname() {
		
		Scanner A = new Scanner(System.in);
		boolean b = false;
		do {
			
			
			try {
				
			System.out.println("enter a name: ");
			
			name = A.next();
			
			name = name.toLowerCase();
			
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			
			b = true;
			
			} catch(Exception e) {
				
				
			}
			
			} while(b != true);
		
		System.out.println("-----------------------------------------------");
		System.out.println(name + " found in year: " + year);
		System.out.println("-----------------------------------------------");
		
		return name;
	}
	
	public ArrayList<String> listcreate() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<String> yearlist = new ArrayList<String>();
		
		//String yob = "/home/compsci/eclipse-Workspace/names/yob" + i + ".txt";
		String yob = "yob1880.txt";
		
		File file = new File(yob); 
		
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) {
		    yearlist.add(st);
		  } 
		  
		  System.out.println("-----------------------------------------------");
		  System.out.println(yearlist.size() + " names found in year: " + year);
		  System.out.println("-----------------------------------------------");
		  
		  
		  return yearlist;
	}

	public static int linearSearch(ArrayList<String> arrayList, String name)
	{
	   int count = 0;
	   for(int i= 0; i < arrayList.size(); i++)
	   {
	      if(arrayList.get(i).substring(0,arrayList.get(i).indexOf(",")).equals(name))
		   	count += Integer.parseInt(arrayList.get(i).substring(arrayList.get(i).lastIndexOf(",")+1,arrayList.get(i).length()));
	   }
	   return count;   //returns -1 if not found
	}
}

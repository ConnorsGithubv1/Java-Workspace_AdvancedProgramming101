package nameSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class names {
	
	private int year;
	private String name;
	private static String results;
	private ArrayList<String> yearlist = new ArrayList<String>();

	public names() {
		
	}
	
	public void createYearList(ArrayList<String> yearlist) {
		this.yearlist = yearlist;
	}
	
	public ArrayList<String> getYearList() {
		return yearlist;
	}

	
	public int askyear() {
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
		
		return year;
	}
	
	
	public ArrayList<String> listcreate(int i) throws Exception {
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
	
	public String askname() {
		// TODO Auto-generated method stub
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

	
	
  public static String linear(ArrayList<String> yearlist, String name) 
	{ 
		results = "number of boys nad number of girls";
	    int n = yearlist.size();

	    for(int i = 0; i < n; i++) 
	    { 
	        if(yearlist.get(i) == name) {
				
	        }
	            
	    } 
	   
	    return results; 
	} 
	
	
	
	int binary(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binary(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binary(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }
}
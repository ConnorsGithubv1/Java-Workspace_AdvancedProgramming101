package nameSearch;

import java.util.Scanner;

public class names {
	
	private int year;

	public names() {
		// TODO Auto-generated constructor stub
	}

	public int ask() {
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
		} while(year > 2018 | year < 1880 );
		
		return 1880;
	}
	
	public static int linear(int arr[], int x) 
	{ 
	    int n = arr.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	            return i; 
	    } 
	    return -1; 
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
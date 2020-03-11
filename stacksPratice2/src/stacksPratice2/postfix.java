package stacksPratice2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class postfix {
	
	private Integer result = 0;
	
	private Integer finalres = 0;

	private String input = "";
	
	
	public postfix() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] listcreate(String a){
		
		input = a;
		
		String[] list = a.split(" ");
		 
		
		return list;
		
	}

	public void fix(String[] list){
		
		Stack<Integer> sym = new Stack<Integer>();

		
		for(int a = 0; a < list.length; a++) {
	
			try {
			int c = Integer.parseInt(list[a]);
			
			if(c == (int)c) {
				sym.push(c);
			}
			}
			
			catch(NumberFormatException e) {
				String d = list[a];
				
				int x = sym.pop();
				int y = sym.pop();
				
				
				if(d.equals("+")) {
					result = (x + y);
				}else if (d.equals("-")) {
					result = x - y;
				}else if (d.equals("/")) {
					result = y / x;
				}else if (d.equals("*")) {
					result = y * x;
				}
				
				sym.push(result);
				
			}
			
			
			
		}
		
		finalres = sym.peek();
		
		
	}
	
	public void tostring() {
		// TODO Auto-generated method stub
		System.out.println(input + " = " + finalres);
	}


}

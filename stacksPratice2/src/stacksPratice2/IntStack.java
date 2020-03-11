package stacksPratice2;

import java.util.ArrayList;


public class IntStack {

	private ArrayList<Integer> sym = new ArrayList<Integer>();
	
	public IntStack(){
		
	}
	
	public void push(int item) {
		sym.add(item);
	}
	
	public int pop() {
		return sym.remove(sym.size() - 1);
	}
	
	public boolean isEmpty(){

		if(sym.size() < 1) {
			return true;
		}
		
		return false;

	}
	
	public int peek(){
		
		return sym.get(sym.size() - 1);

		}
	
	public String toString(){
		return sym + "";

		}
	

}

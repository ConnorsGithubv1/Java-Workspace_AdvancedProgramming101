import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class palinlist {
	
	Queue<String> queue = new LinkedList<String>();
	
	String list;

	public palinlist() {
		// TODO Auto-generated constructor stub
	}

	public String[] getlist(String a) {
		
		list = a;
		
		String[] b = a.split(" ");
		return b;

	}

	public boolean startqueue(String[] list) {
		
		int y = 0;
		
		if(list.length % 2 == 0) {

		for(int i = 0; i <list.length/2; i ++) {
			queue.add(list[i].toString());
		}
		while(!queue.isEmpty()) {
			if(queue.remove().compareTo(list[list.length-1  - y]) == 0) {
				
			}else {
				return false;
			}
				
				y++;
				
		}
		
		return true;

		}

		if(list.length % 2 == 1) {
			int x = 0;
			while(x != ((list.length - 1)- x)) {
				if(list[x].compareTo(list[list.length - 1 - x]) == 0) {
					
				}else {
					return false;
				}
				x++;
			}
		return true;
		
		}
		
		return true;
		
	}
	
	public void getlist() {
		
	}

	public void tostring(boolean b) {
		// TODO Auto-generated method stub
		if(b == true) {
			System.out.println(list + " is a palinlist");
		}else {
			System.out.println(list + " is not a palinlist");
		}
			
	}
	


}

import java.util.ArrayList;

public class IntQueue {

	private ArrayList<Integer> loi = new ArrayList<Integer>();;
	
	public IntQueue() {
	}

	public void add(Integer item) {
		loi.add(item);
	}

	public int remove() {
		
		int i = 0;
		
		if(loi.isEmpty() != true) {
			i = loi.get(0);
			loi.remove(0);
		}else {
			System.out.println("queue empty");
		}
		
		
		return i;
	}

	public boolean isEmpty() {
		
		if(loi.size() <= 0) {
			return true;
		}
		
		return false;	
	}

	public int peek() {
		
		int d = loi.get(0);
				
		return d;
		
	}

	public String tostring() {
		
		String c = loi.toString();
		
		return c;
		
	}

}

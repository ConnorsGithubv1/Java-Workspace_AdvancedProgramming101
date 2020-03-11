import java.util.PriorityQueue;

public class PQtest {
	
	PriorityQueue<String> pq = new PriorityQueue<String>();

	public PQtest() {
		
		
	}
	
	public String[] getlist(String a) {	
		
		System.out.println(" ");
		
		String[] b = a.split(" ");
		
		return b;

	}

	public void readlist(String[] list) {
		for(int i = 0; i < list.length; i++) {
			pq.add(list[i]);
		}
		
		System.out.println(" readlist(): " + pq);
	}

	public void getmin() {
		String min = pq.peek();
		System.out.println(" getmin(): " + min);
	}

	public void getnaturalorder() {
		PriorityQueue<String> aq = new PriorityQueue<String>();
		
		System.out.println(" natural order(): ");
		
		while(pq.isEmpty() != true) {
			aq.add(pq.peek());
			System.out.print(pq.poll() + " ");
		}
		
		pq = aq;		
	}

}

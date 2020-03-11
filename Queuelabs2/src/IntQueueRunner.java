
public class IntQueueRunner {

	public static void main(String[] args) {
		
		IntQueue i = new IntQueue();
		
		System.out.println(i.isEmpty());
		
		i.add(5);
		i.add(7);
		i.add(7);
		
		System.out.println(i.tostring());
		
		System.out.println(i.remove());
		System.out.println(i.remove());
		
		i.add(9);
		
		System.out.println(i.remove());
		
		System.out.println(i.peek());
		
		System.out.println(i.isEmpty());
		
		System.out.println(i.tostring());
		
	}

}

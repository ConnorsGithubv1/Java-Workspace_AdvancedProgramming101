
import java.util.LinkedList;
import java.util.Queue;

public class qpractice {

	public qpractice() {

		
	}

	public void test1() {
	
			Queue<Integer> a = new LinkedList<Integer>();
			
			a.add(45);
			a.add(76);
			a.add(34);
			System.out.println(a);
			System.out.println(a.remove());
			
	}
	
	public void test2() {
		
		Queue<Integer> a = new LinkedList<Integer>();
		
		a.add(45);
		a.remove();
		a.add(34);
		System.out.println(a);
		System.out.println(a.remove());
		
	}
	
	public void test3() {
	
	Queue<Integer> a = new LinkedList<Integer>();
	
	a.add(45);
	System.out.println(a.peek());
	a.add(34);
	System.out.println(a.remove());
	a.add(67);
	System.out.println(a);
	
	}
	
	public void test4() {
		
		Queue<Double> a = new LinkedList<Double>();
		
		a.add(9.2);
		a.add(1.1);
		a.add(7.3);
		a.add(5.6);
		System.out.println(a.remove());
		
	}
	
	public void test5() {
		
		Queue<String> a = new LinkedList<String>();
		
		a.add("ab");
		a.add("78");
		a.add("ET");
		System.out.println(a.remove());
		a.add("one");
		System.out.println(a.remove());
		System.out.println(a.size());
		System.out.println(a.remove());

		
	}
	
	public void test6() {
		
		Queue<String> a = new LinkedList<String>();
		
		a.add("it");
		a.add("go");
		a.add("we");
		a.add("by");
		while (!a.isEmpty()) {
			System.out.println(a.remove());
		}

		
	}
	

}

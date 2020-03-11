package stacksPratice2;

public class IntStackRunner {

	public static void main(String[] args) {
		
		IntStack i = new IntStack();

		i.push(2);
		System.out.println(i);
		i.push(2);
		System.out.println(i.peek());
		i.pop();
		i.toString();
		System.out.println(i);
	}

}

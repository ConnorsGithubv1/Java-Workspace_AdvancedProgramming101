package practice;

public class factorial {
	
	private int number;
	private int answer = 1;

	public factorial(int num) {
		// TODO Auto-generated constructor stub
		number = num;
		
	}


	public void findfactorial() {
		// TODO Auto-generated method stub
		
		for( int i = 1; number >= i; i++) {
			
			System.out.println(i);
			answer = i * answer;
			
		}
		
		System.out.println(answer);
		
	}

}

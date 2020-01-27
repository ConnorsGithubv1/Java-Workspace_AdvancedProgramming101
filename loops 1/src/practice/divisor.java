package practice;

public class divisor {
	
	private int number;
	
	public divisor(int num) {
		// TODO Auto-generated constructor stub
		number = num;
		
	}
	
	public void finddivisors(int number) {
		
		for(int r = 1; r <= number; r++) {
			
			if (number % r == 0) {
			System.out.println(r);
			
			}
			
		}
		
	}
	

}

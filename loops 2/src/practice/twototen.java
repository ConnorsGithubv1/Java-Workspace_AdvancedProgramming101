package practice;

public class twototen {
	
	private String num;
	private double answer = 0;
	private int len;

	public twototen(String number) {
		// TODO Auto-generated constructor stub
		num = number;
		len = num.length();
		System.out.println(num);
		
	}

	public void converter() {
		// TODO Auto-generated method stub
		for ( int i = 1; i <= len; i++ ) 
		{
			System.out.println(i);
			
			if( num.charAt(i) + 1 == '1') {
				System.out.println("yes");
				answer += Math.pow(2, i);
			}
			
		}
		System.out.println(answer);
	}

}

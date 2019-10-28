package practice;

public class twototen {
	
	private String check;

	public twototen() {
		// TODO Auto-generated constructor stub

	}
	
	//Successful code

	public void converter(int binary) {
		// TODO Auto-generated method stub
			int num = binary; 
	        int dec_value = 0; 
	  
	        // Initializing base 
	        // value to 1, i.e 2^0 
	        int base = 1; 
	  
	        int temp = num; 
	        while (temp > 0) { 
	            int last_digit = temp % 10; 
	            temp = temp / 10; 
	  
	            dec_value += last_digit * base; 
	  
	            base = base * 2; 
	        } 
	  
	        System.out.println(dec_value);
	}
	
	//what i was trying to do
	
	public void convert(String binaryword) {
		// TODO Auto-generated method stub
		
		String bin = binaryword;
		int answer = 0;
		
		System.out.println(bin);
		System.out.println(' ');
		for ( int i = 0; i <= bin.length() - 1; i++ ){
			System.out.println(bin.charAt(i));
			
			if(bin.charAt(i) == '1') {
				answer = (int) (answer + Math.pow(2, i));
			}
			
			/*if(bin.charAt(i) == '1') {
				System.out.println("yes");
				answer = (int) (answer + Math.pow(i, 2));
				System.out.println(answer);
			}
			else {
				System.out.println("no");
			}
			System.out.println(' ');
				*/
			}
		System.out.println(' ');
		System.out.println(answer);
		System.out.println(' ');	
		}
		
	}



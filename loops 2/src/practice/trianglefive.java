package practice;

public class trianglefive {
	

	public trianglefive() {
		// TODO Auto-generated constructor stub

	}

	public void convert(char let, int x) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < x; i ++){
			
			for(int j = 0; j < x-i; j++) {
				
		
				for(int k = 0; k < x - j; k++ ){
					System.out.print((char)(let + j));
					
				}
				System.out.print(' ');
			}
			System.out.println();
			
		}
		
	}

}

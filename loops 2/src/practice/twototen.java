package practice;

public class twototen {

	public twototen() {
		// TODO Auto-generated constructor stub

	}

	public void converter(int binary) {
		// TODO Auto-generated method stub
		int temp = binary;
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		
		String check = String.valueOf(binary);
		for ( int i = 1; i <= count; i++ ){
			System.out.println(i);
			if(check.charAt(i) == '1') {
				System.out.print("yes");
			}
		}

	}

}

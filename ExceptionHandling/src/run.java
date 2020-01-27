import java.util.Scanner;

public class run {

	private int length;
	private int a;
	private String[] StringArray;
	

	public run() {
		// TODO Auto-generated constructor stub
		StringArray = new String[]{"dog", "cat", "parrot", "sloth", "snake", "ferret"};
		length = StringArray.length;
	}

	public void ask() {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		do {
			
		
		try {
			
		System.out.println("enter a number between 0 and " + (length - 1));
		
		a = S.nextInt();
		
		System.out.println(a);
		
		System.out.println(StringArray[a]);
		
		} catch(Exception e) {
			
			System.out.println(a + " is not a number between 0 and 5");
		}
		} while(a > 5 | a < 0 );
		
	}

}

import java.util.Scanner;

public class run {

	private int length;
	private int a;
	private String[] StringArray;
	

	public run() {
		// TODO Auto-generated constructor stub
		length = StringArray.length;
		StringArray = new String[]{"dog", "cat", "parrot", "sloth", "snake", "ferret"};
	}

	public void ask() {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("enter a number between 1 and " + length);
		a = S.nextInt();
		System.out.println(a);
	}

	public void check() {
		// TODO Auto-generated method stub
		System.out.println(StringArray);
	}

}

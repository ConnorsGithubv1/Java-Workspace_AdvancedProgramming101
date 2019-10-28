import javax.swing.JOptionPane;
import java.util.Scanner;

public class MovieRate {
	
	private int movies = 0;

	public MovieRate(int i) {
		// TODO Auto-generated constructor stub
		movies = i;
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println(movies);
		while (movies < 0 || movies > 3) {
			System.out.println(movies);
			System.out.println("error");
			String input = JOptionPane.showInputDialog("enter movies 1 to 3:");
			movies = Integer.parseInt(input);
		}
	}
	
	public void website() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for(int b = 1; b < movies + 1; b++) {
			System.out.println("Please enter ratings for the movie review #"+ b);
			double review1 = scanner.nextDouble(); 
			double review2 = scanner.nextDouble(); 
			double review3 = scanner.nextDouble(); 
			System.out.println(review1);
			System.out.println(review2);
			System.out.println(review3);
		}
	}
	
	public void focusgroup(double c , double d) {
		
	}
	
	public void average(double a) {
		
	}

	

}

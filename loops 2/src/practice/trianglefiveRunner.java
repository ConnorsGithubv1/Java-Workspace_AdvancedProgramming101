package practice;

import javax.swing.JOptionPane;

public class trianglefiveRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letter = JOptionPane.showInputDialog("enter a letter");
		int num = Integer.parseInt( JOptionPane.showInputDialog("enter number:"));
		trianglefive triangle = new trianglefive(letter, num);
		
		triangle.convert();
	}

}

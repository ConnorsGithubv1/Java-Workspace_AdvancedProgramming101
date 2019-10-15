package practice;

import javax.swing.JOptionPane;

public class reverseRunner {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "enter a number to get it in reverse order");
		int num = Integer.parseInt( JOptionPane.showInputDialog("enter number:"));
		reverse number = new reverse(num);
		
		number.findreverse(num);
	}
}

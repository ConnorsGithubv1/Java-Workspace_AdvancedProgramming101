package practice;

import javax.swing.JOptionPane;

public class twototenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog("enter binary number:");
		twototen binary = new twototen(number);
		
		binary.converter();
	}

}

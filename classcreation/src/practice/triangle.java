package practice;

import java.util.Scanner;


public class triangle {
	
	private double a;
	private double b;
	private double c;
	private double s;
	private double area;

	public triangle() {
		// TODO Auto-generated constructor stub
	}

	public void getvalues() {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("enter side A : ");
		a = S.nextInt();
		System.out.println("enter side B : ");
		b = S.nextInt();
		System.out.println("enter side C : ");
		c = S.nextInt();
		System.out.println(" ");
	}
	
	public double getperimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	public double findarea() {
		// TODO Auto-generated method stub
		s = getperimeter() / 2;
		System.out.println(a + " " + b + " " + c);
		area = (double) Math.sqrt( s*(s -a)*(s - b)*(s - c));
		return area;
	}


}

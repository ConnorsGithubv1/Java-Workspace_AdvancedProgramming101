import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.*;

public class MathSetRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	  
		MathSet m = new MathSet();
		System.out.println(" ");
		System.out.println("union: " + m.union());
		System.out.println("intersection: " + m.intersection());
		System.out.println("a - b: " + m.differenceAMinusB());
		System.out.println("b - a: " + m.differenceBMinusA());
		System.out.println("symetric difference:" + m.symmetricDifference());
		
	}
	}

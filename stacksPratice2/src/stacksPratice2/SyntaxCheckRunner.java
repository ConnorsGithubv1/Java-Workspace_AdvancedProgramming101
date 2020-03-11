package stacksPratice2;

public class SyntaxCheckRunner {

	public static void main(String[] args) {
		//add test cases		
				SyntaxChecker s = new SyntaxChecker("(ad(ad)");
				s.toString(s.checkExpression());
				
				System.out.println();
				
			   SyntaxChecker t = new SyntaxChecker("[{}]");
			   t.toString(t.checkExpression());
			   
				System.out.println();
				
				SyntaxChecker u = new SyntaxChecker("[{<()>}]");
				u.toString(u.checkExpression());
				
				System.out.println();
				
				SyntaxChecker v = new SyntaxChecker("(()()))");
			    v.toString(v.checkExpression());
	}

}

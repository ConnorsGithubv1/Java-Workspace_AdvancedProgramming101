//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		SyntaxChecker s = new SyntaxChecker("(abc(*def)");
		s.toString(s.checkExpression());
		
		//SyntaxChecker t = new SyntaxChecker("[{}]");
		//t.toString(t.checkExpression());
	}
}
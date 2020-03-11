

import java.util.Stack;

//import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;
//import com.sun.tools.sjavac.server.SysInfo;

import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
	}

	//takes string from runner class and gives value to expression
	public SyntaxChecker(String s)
	{
		exp = s;
	}
	
	// Checks the string exp if true or false 
	//example : "(asd(as)" = false   "(asd(as))" = true
	
	public boolean checkExpression()
	{
		Stack<Character> sym = new Stack<Character>();
		
		boolean z = false;
		
		for(int i = 0; i < exp.length(); i++) {
			
			char a = exp.charAt(i);
			
			if(a == '{' ||a == '(' ||a == '[' ||a == '<') {
		
				sym.push(a);
				System.out.println(sym);
				
			}else if(a == ')') {
				sym.pop();
			}else if(a == '}') {
				sym.pop();
			}else if(a == ']') {
				sym.pop();
			}else if(a == '>') {
				sym.pop();
			}
			
			if(sym.empty() == true) {
				z = true;
				return z;
			}
				
			
		}
	return z;
}

	// takes boolean and makes it into a statement including expression and value
	public String toString(boolean b) {
		
		String string = null;
		
		if(b == true) {
			string = exp + " = true";
			System.out.println(string);
		}
		
		else {
			string = exp + " = false";
			System.out.println(string);
		}
		
		return string;
	}
}
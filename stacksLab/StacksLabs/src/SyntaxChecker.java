//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

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
		for(int i = 0; i < exp.length(); i++) {
			char a = exp.charAt(i);
			if(a == '{' ||a == '(' ||a == '[' ||a == '<') {
		
			}else if (a == '}') {
				if(symbols.isEmpty() || symbols.pop() != '}') {
					return false;
				}
			}else if () {
				if() {
					
				}
			}
		}
		
		System.out.println(exp);
		return false;
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
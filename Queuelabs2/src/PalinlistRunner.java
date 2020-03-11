
public class PalinlistRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palinlist p = new palinlist();
	
		String s = "one two three two one";
		String t = "a b c d e f g x y z g f h";
		String u = "racecar is racecar";
		String v = "1 2 3 4 5 one two three four five";
		
		p.tostring(p.startqueue(p.getlist(s)));
		
		System.out.println();
		
		p.tostring(p.startqueue(p.getlist(t)));
		
		System.out.println();
		
		p.tostring(p.startqueue(p.getlist(u)));
		
		System.out.println();
		
		p.tostring(p.startqueue(p.getlist(v)));
		
	}

}

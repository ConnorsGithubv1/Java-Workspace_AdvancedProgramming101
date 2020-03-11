
public class PQtestrunner {

	public static void main(String[] args) {
		

		PQtest p = new PQtest();
		
		p.readlist(p.getlist("one two three four five six seven"));
		p.getmin();
		p.getnaturalorder();
		
		System.out.println(" ");
		
		PQtest q = new PQtest();
		
		q.readlist(q.getlist("1 2 3 four five six seven"));
		q.getmin();
		q.getnaturalorder();
		
		System.out.println(" ");
		
		PQtest r = new PQtest();
		
		r.readlist(r.getlist("a b c d e f g h i j k l m n o p"));
		r.getmin();
		r.getnaturalorder();
		
		
	}

}

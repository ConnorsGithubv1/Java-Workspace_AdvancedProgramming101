package namesearch2;

public class run {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		names n = new names();
		n.findyear();
		System.out.println(n.linearSearch(n.listcreate(), n.askname()));
	}

}

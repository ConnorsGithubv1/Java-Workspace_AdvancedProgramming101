package nameSearch;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws Exception {
		//for(int i = 0; i < 1; i++) {
			names n = new names();
			n.createYearList(n.listcreate(n.askyear()));
			System.out.println(n.getYearList());
			//n.askname();
		//}
	}

}

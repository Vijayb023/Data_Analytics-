import java.util.ArrayList;

public class Client {
	public static void main(String[]args, int target) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(8);
		alist.add(6);
		alist.add(3);
	    alist.add(7);
		alist.add(2);
		target = 2; 
		System.out.println(alist);
		System.out.println(seq(alist, target));

}


	}
}

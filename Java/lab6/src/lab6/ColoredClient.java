package lab6;

import java.util.ArrayList;
import java.util.List;

public class ColoredClient {
	public static void main(String[]args) {
		ArrayList<ColoredRectangle> cr = new ArrayList<ColoredRectangle>();
		cr.add(new ColoredRectangle(3,5,"Red"));
		cr.add(new ColoredRectangle(23,4,"Blue"));
		cr.add(new ColoredRectangle(6,7,"Green"));
		System.out.println(cr);
		System.out.println(cr.get(0).equals(cr.get(0)));
		System.out.println(cr.get(0).equals(cr.get(2)));
		System.out.println(cr.get(1).equals(cr.get(2)));
		ArrayList<Integer> t= new ArrayList<Integer>();
		for(int i =0; i<10;i++) {
			t.add((int)(Math.random()*10));
		}
		System.out.println(t);
		minToFront(t);
		System.out.println(t);


	
}

	private static void minToFront(ArrayList<Integer> t) {
		int min= t.get(0);
		int index  =0;
		for(int i=0; i<t.size(); i++) {
			if(min> t.get(i)) {
				min = t.get(i);
				index = i;
			
			}
		}
	    t.remove(index);
		t.add(0,min);
	}
}

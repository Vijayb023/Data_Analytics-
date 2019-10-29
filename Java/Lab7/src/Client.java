import java.util.ArrayList;


public class Client {
	public static void main(String[]args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(8);
		alist.add(6);
		alist.add(3);
	    alist.add(7);
		alist.add(2);
		System.out.println(alist);
		System.out.println(removeOdds(alist));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("to");
		list.add("not");
		list.add("car");
		list.add("dog");
		list.add("so");
		list.add("ok");
		System.out.println(list);
		System.out.println(markLength3(list));
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(5);
		list1.add(67);
		list1.add(7);
		list1.add(8);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(0);
		list2.add(6);
		list2.add(7);
		list2.add(87);
		list2.add(51);
		list2.add(65);
		list2.add(1);

		System.out.println(list2);		
	}



	public static ArrayList<Integer> removeOdds (ArrayList<Integer> alist){
	for (int k=0; k < alist.size(); k++){
	if (alist.get(k) % 2 == 1) {
	alist.remove(k);
	k++;
	}
	}
	return alist;

	}
	public static ArrayList<String> markLength3 (ArrayList<String> list){
		for (int i=0; i< list.size();i++) {
			if(list.get(i).length()==3);
				list.add(i,"**");
				i++;
		}
		return list;
		
	}
	
	public static ArrayList<Integer> Interesect (ArrayList<Integer> list1, ArrayList<Integer>list2){
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for(int k=0;k<list1.size();k++) {
			for(int l=0;l<list2.size();l++) {
				if (list1.get(k)==list2.get(l)) {
					list3.add(k);
				}
			}
		}
		return list3;
	}
	
} 




package hw3;
import java.util.ArrayList;

public class repeating {

    private static ArrayList<String> arrayList;

    public static void main(String[] args) {
    	
        arrayList = new ArrayList<>();
        
        arrayList.add("how");
        arrayList.add("are");
        arrayList.add("you");

        System.out.println(arrayList);
        doubleList(arrayList);
        System.out.println(arrayList);
    }

    private static void doubleList(ArrayList<String> list) {
    	
    	
    	
        ArrayList<String> t = new ArrayList<>();
        for (String element : list) {
            int Repeats = 2; 
            while (Repeats > 0) {
                t.add(element);
                Repeats--;
            }
        }

        arrayList = new ArrayList<>(t);
    }
}
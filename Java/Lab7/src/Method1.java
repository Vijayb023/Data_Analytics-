import java.util.ArrayList;
public class Method1{
private ArrayList<Integer> removeOdds() {
        ArrayList<Integer> alist = new ArrayList<Integer>();
 
        for (int i = 6; i <= 45; i += 3) {
            alist.add(i);
        }
 
        System.out.println(alist);
 
        java.util.Iterator<Integer> itr = alist.iterator();
        while (itr.hasNext()) {
            int val = itr.next();
            if (val % 9 == 0 || val % 2 == 0) {
                itr.remove();
            }
        }
            
        System.out.println(alist);
}
}

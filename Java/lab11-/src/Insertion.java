import java.util.Arrays;

public class Insertion {
	public static void main(String [] args) {
		String [] array = {"h","i","t","v"};
		insertion(array);
		System.out.println(Arrays.toString(array));

	}	
	public static void insertion(String [] array) {
		for(int i = 1; i < array.length;i++) {
			String h = array[i];
			int a = i - 1;
			while(a >= 0) {
				if(h.compareTo(array[a]) > 0) {
					break;
				}
				array[a + 1]= array[a];
				a--;
			}
			array[a + 1] = h;
		}
	}
}

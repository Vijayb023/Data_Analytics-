import java.util.Arrays;
public class arrange1 {
	public static void main(String [] args) {
		String x = "hello";
		int n = 3;
		String A = r(x, n);
		System.out.println(A);
	}	
	
	public static String r(String x, int n) {
		if (n == 1) {
			return x;
		}
		else if (n == 0) {
			return "";
		}
		else
			return x + r(x, n- 1);
	}
}
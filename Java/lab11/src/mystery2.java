public class mystery2 {

public void m2(int n){
	n=113;
	if (n > 100) {
		System.out.print(n);
		}
	else {
		m2(2 * n);
		System.out.print(", " + n);
		}
}
}
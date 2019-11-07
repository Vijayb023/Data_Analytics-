
public class num3 {
public static void main(String[]args) {
		writeSquares(11);
}
public static void writeSquares(int n) {
	if (n>0) {
		if(n%2==0) {
			System.out.print((n*n+" "));}
		writeSquares(n-1);
		if(n%2==1) {
			System.out.print((n*n+" "));
		}
	}
}
}

package hw2;

public class LineClient {
	public static void main(String[]args) {
		point p1 = new point(30,40);
		point p2 = new point(44,-6);
		Line l = new Line(p1 , p2);
		System.out.println(l.toString());
		System.out.println(l.getSlope());

	}
}

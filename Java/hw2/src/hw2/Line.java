package hw2;

public class Line {
private point p1;
private point p2;
public Line(point p1,point p2) {
	this.p1 =p1;
	this.p2 =p2;
}
public point getP1() {
	return p1;
}
public Point getP2() {
	return p2;
}
public String toString() {
	return("["+this.getP1().toString()+","+this.getP2().toString()+"]");
}
public double getSlope() {
	if (p1.getx()==p2.getx()) {
		System.out.println("Error occured");
		System.out.println()
		
	}
	double slope = ((double)(p2.gety()-p1.gety())/(p2.getx()-p1.getx()));
	return slope;
}
}

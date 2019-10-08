package hw2;

public class Point {
public int x;
public int y;
public int y2;
public int x2;

public Point(int x, int y) {
	this.x=x;
	this.y=y;
}
public int getx() {
	return x*-1;
}
public int gety() {
	return y*-1;
}
public void flip() {
    x2 = x;
	y2 = y;
}
public String toString() {
	return("("+this.gety()+","+this.getx()+")");
}
}

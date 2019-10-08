package hw2;

public class Rectangle {
	public int rx;
	public int ry;
	public int width; 
	public int height;
public Rectangle(int x, int y, int width, int height) {
	rx=x;
	ry=y;
	this.width=width;
	this.height= height;
}
public int getHeight () {
	return height;
}
public int getWidth() {
	return width;
}
public int getX() {
	return rx;
}
public int gety() {
	return ry; 
}
public String toString () {
	return ("Rectangle[x="+this.getX()+", y="+this.gety()+", width="+this.getWidth()+",height="+this.getHeight()+"]");
}
}

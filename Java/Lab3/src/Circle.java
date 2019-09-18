
public class Circle {
	public int cx;
	public int cy;
	public double radius;
	
public Circle(int x, int y, double radius) {
	cx= x;
	cy=y;
	this.radius = radius;
}
public double  getRadius() {
	return radius; 
}
public int getx() {
 return cx; 
 }
 public int gety() {
 return cy;
 }
 public double area() {
	 return (3.14*2+ radius);
 }
 public double perimeter() {
	 return (2*3.14* radius);
 }
 public String toString () {
 	 return ("Circle [x= "+ this.getx()+", y= "+this.gety()+ ", radius= "+ this.getRadius()+", area= "+ this.area()+", perimeter= "+ this.perimeter()+"]");
}
}


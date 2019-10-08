package lab6;

public class Rectangle {
	int height; 
	int width; 
	
	public Rectangle(int x , int y) {
		this.height=x;
		this.width=y; 
	}
	public boolean equals(Object O) {
		if( O instanceof Rectangle) {
			Rectangle other = (Rectangle) O;
			return height == other.height&&width ==other.width;
		}else {
			return false;
		}}
	public int getHeight() {
		return height; 
	}
	public int getWidth() {
		return width;
	}
	public String toString() {
		return "Rectangle ["+height+","+width+"]";
	}
		
	}


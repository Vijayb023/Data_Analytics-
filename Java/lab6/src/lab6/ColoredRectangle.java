package lab6;

public class ColoredRectangle extends Rectangle implements Colored {
	String color; 
	public ColoredRectangle(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return super.toString()+ "Color: "+ color;
	}
	public boolean equals(Object O) {
		if(O instanceof ColoredRectangle) {
			ColoredRectangle other = (ColoredRectangle)O;
			return super.equals(other)&& this.getColor()==other.getColor();
		}else return false; 
			
		}
	}

 
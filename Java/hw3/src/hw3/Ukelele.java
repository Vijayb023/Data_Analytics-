package hw3;


public class Ukelele extends Stringed{
	String size;
	public Ukelele(String madeIn, double price, int numberofStrings, String size) {
		super(madeIn, price,numberofStrings);
		this.size=size;
	}
	public String getSize() {
		return size;
	}
	public String toString() {
		return "Made in:"+getMadeIn()+ ", Price:"+getPrice()+", Number of Strings:"+getNumberofStrings()+", Size:"+getSize();
	}
public boolean equals(Ukelele other) {
	if (super.equals(other) && size== other.size) {
		return true; }
	else {
		return false; 
	
	}
}
}
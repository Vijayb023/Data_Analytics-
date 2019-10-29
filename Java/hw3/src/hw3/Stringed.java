package hw3;

public class Stringed extends Instrument {
	int numberofStrings;
	public Stringed(String madeIn, double price, int numberofStrings) {
		super(madeIn, price);
		this.numberofStrings=numberofStrings;
	}
	public int getNumberofStrings() {
		return numberofStrings;
	}

public String toString() {
	return "Made in:"+getMadeIn()+ ", Price:"+getPrice()+", Number of Strings:"+getNumberofStrings();
}
public boolean equals(Stringed other) {
	if(super.equals(other) && numberofStrings== other.numberofStrings) {
		return true; }
	else {
		 return false; }
	
	}
}


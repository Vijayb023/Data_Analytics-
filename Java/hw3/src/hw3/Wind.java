package hw3;

public class Wind extends Instrument{
	String type;
	public Wind(String madeIn, double price, String type) {
		super(madeIn, price);
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		return "Made in:"+getMadeIn()+ ", Price:"+getPrice()+", Type:"+getType();
	}
	public boolean equals(Wind other) {
		if ( super.equals(other) && type== other.type) {
			return true; }
		else {return false;
		}
	}

}

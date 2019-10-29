package hw3;


public class Instrument {
String MadeIn;
double price;
Instrument(String MadeIn,double price) {
	this.MadeIn=MadeIn;
	this.price=price;

}
 public String getMadeIn() {
	 
	 return MadeIn;
	 
 }
 public double getPrice() {
	 
	 return price;
 }
 public String toString() {
	 
	 return "Made in: "+getMadeIn()+ " Price: "+getPrice();
	 
 }
 public boolean equals(Instrument other) {
	 
	 if (MadeIn== other.MadeIn && price == other.price) {
		 return true; 
		 }
	 else { 
		 return false; 
	 }
	 }
 }
package hw3;

public class InstrumentMain {
public static void main(String args[]) {
	Wind w1= new Wind("India", 45.8,"Brass");
	Stringed s1= new Stringed("Brazil",78.0,5);
	Ukelele U1= new Ukelele("Africa", 30.4,4,"Baritone");
	Object [] instrumentArray = {w1,s1,U1};
	System.out.println("Wind instrument: "+ instrumentArray[0]);
	System.out.println("Stringed instrument: "+ instrumentArray[1]);
	System.out.println("Ukelele, Stringed instrument: "+ instrumentArray[2]);
	Ukelele U2= new Ukelele("Africa", 30.4,4,"Baritone");
	System.out.println(U1.equals(U1));
	
	
}
}

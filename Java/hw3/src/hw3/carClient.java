package hw3;


public class carClient {
public static void main(String args[]) {
	
	Car c1= new Car("green", "Tesla","Model T",true);
	Car c2 = new Car("silver", "Audi","R8",false);
	Car c3 = new Car("silver", "Audi","R8",false);

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c2.equals(c3));
	
}
}

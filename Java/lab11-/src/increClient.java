public class increClient {
	public static void main(String [] args) {
		SequentialIncrementer sequential1 = new SequentialIncrementer();
		System.out.println("Before Sequential : " + sequential1.getValue());
		sequential1.Increment();
		
		System.out.println("After Sequential : " + sequential1.getValue());
		RandomIncrementer random1 = new RandomIncrementer();
		
		System.out.println("Before Random:" + random1.getValue());
		random1.Increment();
		
		System.out.println("Random Increment after:" + random1.getValue());
	}
}

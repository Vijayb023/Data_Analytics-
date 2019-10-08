package Undergraduate;

public class gradClient {
	public static void main(String[]args) {
		undergrade Alex = new undergrade("Computer Science",3.9,54,true);
		graduate Mary = new graduate("Masters",4.10,"Computer Science","Cybersecurity", 1);
		Exchange bob = new Exchange(" Math",3.7,36,true," sophmore","Japan");
		System.out.println(Alex.toString());
		System.out.println(Mary.toString());
		System.out.println(bob.toString());
}
}
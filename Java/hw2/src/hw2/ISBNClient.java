package hw2;
import java.util.Scanner;
public class ISBNClient {
public static void main(String[]args) {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter isbn digits:");
	String digits = console.nextLine();
	System.out.print("Enter check symbol of isbn:");
	String checkSymbol = console.next().charAt(0)+"";
	ISBN isbn = new ISBN(digits, checkSymbol);
	System.out.println(isbn.toString());
	if(isbn.isValid()==true) {
	System.out.println("This ISBN entered: "+isbn.toString()+"is working");
	}
	else {
		System.out.println("This ISBN entered: "+isbn.toString()+"is correct");
	}
}

}

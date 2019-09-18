
import java.util.*;
 
public class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner palli = new Scanner(System.in);
     
      System.out.println("See if its a palindrom");
      original = palli.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string isn't a palindrome.");
         
   }
}      
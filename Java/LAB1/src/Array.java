
	import java.util.Arrays;
	public class Array{
	  public static void main (String args[]){
	    int [] numbers = {22,34,21,35,12,4,2,3,99,81};
	    System.out.println("array: "+ Arrays.toString(numbers));
	    System.out.println("array in reverse: ");
	    System.out.println( reverse(numbers));
	    System.out.println("The smallest number is "+ getMinValue(numbers));


	}

	public static int getMinValue(int[] numbers){
	  int minValue = numbers[0];
	  for(int i=1;i<numbers.length;i++){
	    if(numbers[i] < minValue){
		  minValue = numbers[i];
		}
	  }
	  return minValue;
	}  
	private static int reverse (int[] numbers) { 
			int rev = numbers[0];  
	        for (int i = numbers.length-1; i >= 0; i--) {  
	            System.out.print(numbers[i] + " ");  
	        }
			return rev;
		  
	    }  
	}
	

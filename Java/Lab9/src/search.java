

import java.lang.reflect.Array;
import java.util.*; 
public class search{
  
    public static int findIndex(int arr[], int t)  { 
        if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
   
        while (i < len) {   
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
   public static int bSearch(int[] arr2, int element){
        int min = 0;
        int max = arr2.length-1;
        while(min<=max){
            int mid_ele = (min+max)/2;
           
            if(arr2[mid_ele] == element)
                return mid_ele+1;
           
            if(arr2[mid_ele] < element)
                min=mid_ele+1;
           
            else
                max=mid_ele-1;       
        }  
       
        return Arrays.binarySearch(arr2,element);      
    }
  
    public static int bSearch2(int [] arr3, int first, int last, int key){  
    	   int mid = (first + last)/2;  
    	   while( first <= last ){  
    	      if ( arr3[mid] < key ){  
    	        first = mid + 1;     
    	      }else if ( arr3[mid] == key ){  
        	    System.out.println("Question 3");  
      	        System.out.println("Array: "+Arrays.toString(arr3));  
    	        System.out.println("Element: "+ key);  
    	        System.out.println("Index: "+ mid);  

    	        break;  
    	      }else{  
    	         last = mid - 1;  
    	      }  
    	      mid = (first + last)/2;  
    	   }
    		   return -1; 
    	   }
    	   
    	   public static void main(String[] args)  { 
    	        int[] my_array = { 0, 4, 6, 1, 3, 2, 7, 8, 9 }; 
    	        int x = 4;
        	    System.out.println("Question 1");  
    	        System.out.println("Array: "+ Arrays.toString(my_array));
    	        System.out.println("Element: "+x);
    	        System.out.println("Index: "+findIndex(my_array,x));
    	        int[] arr2 = {12,14,17,18,56,32};
    	        int element= 13;
        	    System.out.println("Question 2");  
     	       System.out.println("Array: "+Arrays.toString(arr2));
     	       System.out.println("Element: "+element);
     	       System.out.println("Index: "+ bSearch(arr2,element));
    	        int [] arr3 = {10,20,30,40,50};  
    	        int key = 30;  
    	        int last=arr3.length-1;  
    	        bSearch2(arr3,0,last,key);  
 
    	        
    	 }  
    	  
    }

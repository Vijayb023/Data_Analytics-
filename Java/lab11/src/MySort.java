import java.util.Arrays;

public class MySort {
	public static int[] selectionSort(int[] list1) {
		for(int i = 0; i< list1.length-1; i++) {
			int x= i;
			for (int j = i + 1; j < list1.length; j++)
                if (list1[j] > list1[x]) 
                    x = j;
      
            int maxNumber = list1[i];  
            list1[i] = list1[x];
            list1[x] = maxNumber;
        }
        return list1;

    }
     
	public static int[] bubbleSort(int[] arr){
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] < arr[j]){  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                 }    
	                 }
			return arr; 
	}
	  public static void insertionSort(int array[]) {  
	        int n = array.length; 
	        
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	public static void main(String []args){
        int[] list1 = {10,34,2,56,7,67,88,42};
        System.out.println(Arrays.toString(list1));
        int[] list2 = selectionSort(list1);
        for(int i:list2){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print( "\n\n\n" );
        int arr[] ={3,60,35,2,45,320,5};  
        
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + ", ");  
        }  
        System.out.println();  
          
        bubbleSort(arr); 
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + ", ");  
        }  
        System.out.print( "\n\n\n" );
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        for(int i:arr1){    
            System.out.print(i+", ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);   
           
        for(int i:arr1){    
            System.out.print(i+", ");    
        }    


            
        }
	
        
    
	                

		
	}

 

			

			
		
	
package lab13;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SortForm extends JFrame{
   private JButton Sort;
   private JTextField input1, input2, input3,input4,input5;
   private JLabel label, answer;
   public SortForm(){
       label = new JLabel();
       Sort = new JButton("Sort");
   	   add(input1);
       add(input2);
       add(input3);
       add(input4);
       add(input5);
       add(Sort);
       add(answer);
   	   Sort.addActionListener(new Button1Listener());

       add(label);
       setVisible(true);
       setPreferredSize(new Dimension(500, 500));
  
   }
   private class Button1Listener implements ActionListener{
       public void actionPerformed(ActionEvent event) {
           int a[] = new int[5];
           a[0] = Integer.parseInt(input1.getText());
           a[1] = Integer.parseInt(input2.getText());
           a[2] = Integer.parseInt(input3.getText());
           a[3] = Integer.parseInt(input4.getText());
           a[4] = Integer.parseInt(input5.getText());
           insertion(a);
           String s = "";
           for(int i=0; i<a.length; i++){
               if(i == a.length-1){
                   s = s + a[i];
               }
               else{
               s = s + a[i]+", ";
               }
           }
           answer.setText(s);
       }
      
   }
   public static void main(String[] args) {
   }
   private static void insertion(int[] a) {
	   int n = a.length;
	   for(int i=0; i < n; i++){
			   int key = a[i]; 
	            int j = i - 1; 
	            while (j >= 0 && a[j] > key) { 
	                a[j + 1] = a[j]; 
	                j = j - 1; 
	            } 
	            a[j + 1] = key; 
	   }

}
	   static void printArray(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i = 0; i < n; ++i);
}

}

package hw5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SortNumber {
   static JFrame frame = new JFrame("Sort");
   static int arr[]=new int[10];
   public static void main(String s[]) {
       JPanel panel = new JPanel();
       panel.setLayout(null);

      
       JLabel label2 = new JLabel("0,0,0,0,0,0,0,0,0,0");
       label2.setBounds(250, 50, 250, 30);

       JButton check = new JButton();
       check.setText("Generate numbers: ");
       check.setBounds(100, 200, 250, 20);
       JButton sort = new JButton();
       sort.setText("Sort");
       sort.setBounds(400, 200, 120, 20);
       sort.addActionListener(new ActionListener() {
          
           @Override
           public void actionPerformed(ActionEvent aE) {
                       sort(arr);
                       append(arr);
           }
           private void append(int[] arr) {
               String s="";
               for(int i=0;i<arr.length;i++) {
                   s=s+arr[i]+",";

               }
               s.substring(0,s.length()-1);
               label2.setText(s);
              
           }

           public void sort(int arr[]){
               int N = arr.length;
               int i, j, pos, temp;
               for (i = 0; i < N - 1; i++) {
                   pos = i;
                   for (j = i + 1; j < N; j++) {
                       if (arr[j] < arr[pos]) {
                           pos = j;
                       }
                   }
                   temp = arr[i];
                   arr[i] = arr[pos];
                   arr[pos] = temp;
               }
           }
       }
       );
       check.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent aE) {
              
               for(int i=0;i<10;i++)
                   arr[i]=(int)(Math.random()*50+1);
               append(arr);
           }

           private void append(int[] arr) {
               String s="";
               for(int i=0;i<arr.length;i++) {
                   s=s+arr[i]+",";
               }
               s.substring(0,s.length()-1);
               label2.setText(s);
              
           }

           public void sort(int arr[]){
               int N = arr.length;
               int i, j, pos, temp;
               for (i = 0; i < N - 1; i++) {
                   pos = i;
                   for (j = i + 1; j < N; j++) {
                       if (arr[j] < arr[pos]) {
                           pos = j;
                       }
                   }
                   temp = arr[i];
                   arr[i] = arr[pos];
                   arr[pos] = temp;
               }
           }

       });

       panel.add(label2);
       panel.add(check);
       panel.add(sort);
       frame.add(panel);

       frame.setSize(700, 800);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class IDCounterPanel extends JPanel
{
	private int count, count2;
    Random ran = new Random(); 
    private int x;
    private JButton incrementButton, decrementButton;
	private JLabel label, label2;
	public IDCounterPanel()
	{
		count = 0;
		count2= 0 ;
		incrementButton = new JButton ("Increment");
		incrementButton.addActionListener (new ButtonListener());
		decrementButton = new JButton("Decrement");
		decrementButton.addActionListener (new ButtonListener()); 
		label = new JLabel ("Number: " + count++);
		label2 = new JLabel ("Number: " + count2--); 
		      add (incrementButton);
		      add (label);
		      add(decrementButton);
		      add(label2);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
	private class ButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event) {
			 if(event.getSource() == incrementButton) {
			   count++;
			 }
			 else if(event.getSource() == decrementButton) {
			  count--;
			 }
			}
	}
	}
 

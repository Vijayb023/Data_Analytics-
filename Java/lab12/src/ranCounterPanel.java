import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ranCounterPanel extends JPanel
{
	private int count;
    Random ran = new Random(); 
	private JButton push;
	private JLabel label;
	public ranCounterPanel()
	{
		count = 0;push = new JButton("Push Me!");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		add(push);
		add(label);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
		private class ButtonListener implements ActionListener
		{
			
public void actionPerformed(ActionEvent event)
			{
				count =ran.nextInt((100-1)+1)+1;
				label.setText("Pushes: " + count);
				}
			}
		}
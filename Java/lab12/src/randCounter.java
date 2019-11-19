import javax.swing.JFrame;
 import java.util.Random;


public class randCounter{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("PushCounter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ranCounterPanel panel = new ranCounterPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		}
	}


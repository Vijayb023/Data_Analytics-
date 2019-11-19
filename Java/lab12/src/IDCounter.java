import javax.swing.JFrame;
 import java.util.Random;


 public class IDCounter{
		public static void main(String[] args)
		{
			JFrame frame = new JFrame("IncCounter");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			IDCounterPanel panel = new IDCounterPanel();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
			}
		}


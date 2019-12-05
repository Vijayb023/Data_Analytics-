package lab13;
import javax.swing.JFrame;
public class Temp{
	public static void main(String[] args){
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TempPanel panel = new TempPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		}
	}

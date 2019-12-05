package lab13;

import java.awt.*;
import javax.swing.*;
public class SlideFont{
	
	public static void main(String[] args){
		JFrame frame = new JFrame("SlideFont");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SlideFontPanel());
		frame.pack();
		frame.setVisible(true);
		}
	}

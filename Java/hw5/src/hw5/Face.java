package hw5;

import java.awt.Color;
import java.awt.Graphics;

public class Face
{
	public static void main(String[]args){
		DrawingPanel panel=new DrawingPanel(320,180);
		Graphics g=panel.getGraphics();
		Graphics x=panel.getGraphics();
		g.setColor(Color.BLACK);
		g.drawOval(10,30,100,100);//faceoutline
		g.setColor(Color.BLUE);
		g.fillOval(30,60,20,20);//eyes
		g.fillOval(70,60,20,20);
		g.setColor(Color.RED);//mouth
		g.drawLine(40,100,80,100);
		x.setColor(Color.BLACK);
		x.drawOval(150,50,100,100);//faceoutline
		x.setColor(Color.BLUE);
		x.fillOval(170,80,20,20);//eyes
		x.fillOval(210,80,20,20);
		x.setColor(Color.RED);//mouth
		x.drawLine(180,120,220,120);
		}
	
}
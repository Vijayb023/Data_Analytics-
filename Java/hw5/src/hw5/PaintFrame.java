package hw5;

import javax.swing.JFrame;

public class PaintFrame extends JFrame{

private final int WIDTH = 600;
private final int HEIGHT = 600;

public void init(){

this.getContentPane().add (new drawCircle());
setSize (WIDTH, HEIGHT);
this.setVisible(true);
this.setResizable(false);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public PaintFrame(){
init();
}
public static void main(String[] args) {
new PaintFrame();


}
}

package lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TempPanel extends JPanel{
	private JLabel inputLabel, CelsLabel, FahLabel, result1;
	private JTextField input;
    private JButton Fahrenheit, Celsius;
    private int result;
	public TempPanel(){
	result = 0;
	inputLabel= new JLabel("Enter Fahrenheit:");
	
	CelsLabel= new JLabel("              Temperature in Celsius: ");
	Celsius = new JButton("Celsius"); 
	result1= new JLabel("temp="+result);
	FahLabel= new JLabel("Temperature in Fahrenheit: ");
	input= new JTextField(5);
	Fahrenheit = new JButton("Fahrenheit");
	Celsius.addActionListener(new TempListener());
	Fahrenheit.addActionListener(new TempListener());
	add(inputLabel);
	add(input);
	add(CelsLabel);
	add(Celsius);
	add(Fahrenheit);
	add(FahLabel);
	setPreferredSize(new Dimension(300, 150));
	setBackground(Color.yellow);
}
private class TempListener implements ActionListener{ 
	public void actionPerformed(ActionEvent event){
		int inputtemp, fahrenheitTemp, celsiusTemp, x;
		if(event.getSource() == Celsius) {
		String text = input.getText();
		fahrenheitTemp= Integer.parseInt(text);
		celsiusTemp= (fahrenheitTemp-32) * 5/9;
		CelsLabel.setText("Temp: " + celsiusTemp);
		}
		 else if(event.getSource() == Fahrenheit) {
		String text = input.getText();
		x = Integer.parseInt(text);
		FahLabel.setText("Temp: " + x);

		}
	}
}
}


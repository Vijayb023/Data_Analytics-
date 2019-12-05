package lab13;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SlideFontPanel extends JPanel{
	private JPanel controls, colorPanel;
	private JSlider rSlider;
	private JLabel rLabel;
	public SlideFontPanel(){
		rSlider= new JSlider(JSlider.HORIZONTAL, 0, 100,0);
		rSlider.setMajorTickSpacing(10);
		rSlider.setMinorTickSpacing(2);
		rSlider.setPaintTicks(true);
		rSlider.setPaintLabels(true);
		rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

		
		SliderListener listener = new SliderListener();
		rSlider.addChangeListener(listener);
		
		rLabel= new JLabel("Font Size: 0");
		rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		controls = new JPanel();
		BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
		controls.setLayout(layout);
		controls.add(rLabel);
		controls.add(rSlider);
		controls.add(Box.createRigidArea(new Dimension (0, 20)));
		controls.add(Box.createRigidArea(new Dimension (0, 20)));
		colorPanel= new JPanel();
		colorPanel.setPreferredSize(new Dimension(100, 100));
		add(controls);add(colorPanel);
		}
	private class SliderListener implements ChangeListener{
		private int font;
		public void stateChanged(ChangeEvent event){
			font = rSlider.getValue();
			rLabel.setText("Font Size: " + font);
			}
		}}
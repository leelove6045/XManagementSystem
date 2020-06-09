package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HealthAdder extends JPanel{
	
	WindowFrame frame;
	
	public HealthAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		
		JLabel labelName = new JLabel("Program Name : ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelID = new JLabel("Member ID : ",JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelWeight = new JLabel("Weight : ",JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelBreaktime = new JLabel("Breaktime : ",JLabel.TRAILING);
		JTextField fieldBreaktime = new JTextField(10);
		labelBreaktime.setLabelFor(fieldBreaktime);
		panel.add(labelBreaktime);
		panel.add(fieldBreaktime);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);

	}
}

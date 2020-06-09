package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;		
	HealthAdder healthadder;
	HealthViewer healthviewer;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);		
		this.healthadder = new HealthAdder(this);
		this.healthviewer = new HealthViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public HealthAdder getHealthadder() {
		return healthadder;
	}

	public void setHealthadder(HealthAdder healthadder) {
		this.healthadder = healthadder;
	}

	public HealthViewer getHealthviewer() {
		return healthviewer;
	}

	public void setHealthviewer(HealthViewer healthviewer) {
		this.healthviewer = healthviewer;
	}

}

package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import healthManagement.HealthManager;

public class WindowFrame extends JFrame{
	
	HealthManager healthManager;
	MenuSelection menuselection;		
	HealthAdder healthadder;
	HealthViewer healthviewer;

	public WindowFrame(HealthManager healthManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		this.healthManager = healthManager;
		this.menuselection = new MenuSelection(this);		
		this.healthadder = new HealthAdder(this);
		this.healthviewer = new HealthViewer(this, this.healthManager);

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

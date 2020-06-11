package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import health.HealthInput;
import healthManagement.HealthManager;

public class HealthViewer extends JPanel{
	
	WindowFrame frame;
	
	HealthManager healthManager;

	public HealthViewer(WindowFrame frame, HealthManager healthManager) {
		this.frame = frame;
		this.healthManager = healthManager;
		
		System.out.println("***"+healthManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Weight");
		model.addColumn("Breaktime");
		
		for(int i=0; i< healthManager.size(); i++) {
			Vector row = new Vector();
			HealthInput hi = healthManager.get(i);
			row.add(hi.getId());
			row.add(hi.getProgramName());
			row.add(hi.getWeight());
			row.add(hi.getBreaktime());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}

}

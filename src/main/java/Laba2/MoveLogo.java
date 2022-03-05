package Laba2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class MoveLogo implements ActionListener {

	private JPanel Panel;
	private JComponent image;
	
	public MoveLogo(JPanel Panel, JComponent image){
		this.Panel = Panel;
		this.image = image;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JCombo box = (JCombo)e.getSource();
		String item = (String)box.getSelectedItem();
		
		if(image==null) 
		{}
		else
		{
        
		if (item=="Перемесить логотип УГАТУ в верхний левый угол") 
		{
			image.setSize(100, 150);
			image.setLocation(0, 0);
			Panel.repaint(); 		
		}
		
		if (item=="Перемесить логотип УГАТУ в середину") 
		{
			image.setSize(100, 150);
			image.setLocation(150,50);
			Panel.repaint();
		}
		
		if (item=="Перемесить логотип УГАТУ в верхний правый угол") 
		{
			image.setSize(100, 150);
			image.setLocation(300, 0);
			Panel.repaint(); 
		}
		

		}
	}

	public JPanel getPanel() {
		return Panel;
	}

	public void setPanel(JPanel panel) {
		Panel = panel;
	}

}
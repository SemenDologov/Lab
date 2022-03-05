package Laba2;

import java.awt.event.*;

import javax.swing.JFrame;


public class infoExitListener implements ActionListener {
	private JFrame infoFr;
	public infoExitListener(JFrame infoFr) {
		this.infoFr = infoFr;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		infoFr.dispose();
	}


	public JFrame getInfoFr() {
		return infoFr;
	}


	public void setInfoFr(JFrame infoFr) {
		this.infoFr = infoFr;
	}
	
	
}

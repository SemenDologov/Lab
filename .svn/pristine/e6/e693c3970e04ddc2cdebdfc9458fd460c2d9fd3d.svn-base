package Laba2;

import java.awt.event.ActionListener;


import javax.swing.*;

public class studInfo {
	private JFrame   infoFr ;
	public studInfo(String nameText) {
		infoFr =  new  JFrame();
		infoFr.setTitle("Information");
		infoFr.setBounds(400,300,300,550);
		infoFr.setResizable(false);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoFr.add(infoPanel);
		
		JLabel infoText = new JLabel(nameText);
		infoText.setBounds(0,0,200,80);
		infoPanel.add(infoText);
		
		JLabel infoFileText = new JLabel("Filetext");
		infoFileText.setBounds(0,150,300,300);
		infoPanel.add(infoFileText);
		
		infoFr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		ActionListener exitListener = new infoExitListener(infoFr);
		
		JButton buttonExit = new JButton("Назад");
		buttonExit.setBounds(210,100,70,50);
		buttonExit.addActionListener(exitListener);
		infoPanel.add(buttonExit);
		
		ActionListener fileListener = new infoFileListener(infoFileText);
		
		JButton buttonFile = new JButton("Файл");
		buttonFile.setBounds(210,50,70,50);
		buttonFile.addActionListener(fileListener);
		infoPanel.add(buttonFile);
		
		infoFr.setVisible(true);
		
	}
	public JFrame getInfoFr() {
		return infoFr;
	}
	public void setInfoFr(JFrame infoFr) {
		this.infoFr = infoFr;
	}
	
	
	
	
}
		
	

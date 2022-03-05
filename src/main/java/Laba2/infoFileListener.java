

package Laba2;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JLabel;


public class infoFileListener implements ActionListener {
	private String texten;
	private JLabel infoFileText;
	public infoFileListener(JLabel infoFileText) {
		this.infoFileText = infoFileText;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		try {
			texten ="<html>";
			BufferedReader fin = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResource("ourfile.txt").openStream()));
			String line;
			while ((line = fin.readLine()) != null) texten = texten+ line +"<br>";
			texten = texten+ "</html>";
			infoFileText.setText(texten);
				fin.close();
		}
		catch(IOException j) {
			j.printStackTrace();
		}
	}


	public String getTexten() {
		return texten;
	}


	public void setTexten(String texten) {
		this.texten = texten;
	}


	public JLabel getInfoFileText() {
		return infoFileText;
	}


	public void setInfoFileText(JLabel infoFileText) {
		this.infoFileText = infoFileText;
	}
	
	
}
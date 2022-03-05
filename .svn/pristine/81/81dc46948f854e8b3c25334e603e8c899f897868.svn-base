package Laba2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
public class imagelistener implements ActionListener {
	private JPanel panel;
	private JComponent image = new logo();
	
	public imagelistener(JPanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		image.setSize(100, 150);
		image.setLocation(0, 0);
		panel.add(image);
		panel.repaint();
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JComponent getImage() {
		return image;
	}

	public void setImage(JComponent image) {
		this.image = image;
	}
}

package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MathListener implements ActionListener{
	private JTextField textfield;
    private JTextField textfield1;
    private Integer z;
    private JLabel text3;

    public MathListener(JTextField textfield, JTextField textfield1, JLabel text3) {
        this.textfield = textfield;
        this.textfield1 = textfield1;
        this.text3 = text3;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
        z = (Integer.parseInt(textfield.getText()) + Integer.parseInt(textfield1.getText()))*2;
        text3.setText(z.toString());
        } catch (NumberFormatException e) {
        text3.setText("Необходимо ввести число");
        }
    }

	public JTextField getTextfield() {
		return textfield;
	}

	public void setTextfield(JTextField textfield) {
		this.textfield = textfield;
	}

	public JTextField getTextfield1() {
		return textfield1;
	}

	public void setTextfield1(JTextField textfield1) {
		this.textfield1 = textfield1;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public JLabel getText3() {
		return text3;
	}

	public void setText3(JLabel text3) {
		this.text3 = text3;
	}
}


	


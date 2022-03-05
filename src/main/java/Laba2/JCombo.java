package Laba2;


import javax.swing.*;



class JCombo extends JComboBox<String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComponent image;
	
	public JCombo(JPanel Panel, JComponent image) {
	
		this.addItem("���������� ������� ����� � ������� ����� ����");
		this.addItem("���������� ������� ����� � ��������");
		this.addItem("���������� ������� ����� � ������� ������ ����");
		this.addItem("������������� ������ � ������� 15");
		this.setBounds(10,180,300,20);
	
		this.addActionListener(new MoveLogo(Panel, image));
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JComponent getImage() {
		return image;
	}

	public void setImage(JComponent image) {
		this.image = image;
	}
}

package Laba2;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class menu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComponent image;

	public menu(JPanel panel) {
	
		JMenu optionOne = new JMenu("Подробнее");
		
		
		this.add(optionOne);
		
		
		JMenuItem itemOne = new JMenuItem("Показать логотип УГАТУ");
		JMenuItem itemTwo = new JMenuItem("Выход");
		JMenuItem itemThree = new JMenuItem("Загрузить файл в проект15");
		
		
		optionOne.add(itemOne);
		optionOne.add(itemTwo);
		optionOne.add(itemThree);
	
		
		
		
		ListenerButton Knopka1 = new ListenerButton();
		itemTwo.addActionListener(Knopka1);
		
		imagelistener Knopka2 = new imagelistener(panel);
		itemOne.addActionListener(Knopka2);
		
		image = Knopka2.getImage();
	
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

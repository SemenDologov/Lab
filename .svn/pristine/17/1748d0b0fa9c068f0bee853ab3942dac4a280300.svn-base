package Laba2; //пакет Java классов

import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {
private JComponent image;
	
	public subversion() {
			
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,600,400,400);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	menu menu = new menu(main_panel); // создание JMenuBar
	main_GUI.setJMenuBar(menu); // Добавили в нашу форму созданный JMenuBar
	image = menu.getImage();
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,300,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JCombo JCombo = new JCombo(main_panel, image);
	main_panel.add(JCombo);
	
	//информация о студентах
	
	
	infoListener informListener = new infoListener();
	
	JButton buttonInf = new JButton("Информация");
	buttonInf.setBounds(120,30,130,30);
	buttonInf.addActionListener(informListener);
	main_panel.add(buttonInf);
	
	//конец информации о студентах
	
	JTextField textfield = new JTextField();
	JTextField textfield1 = new JTextField();
	JLabel text1 = new JLabel("длина");
	JLabel text2 = new JLabel("высота");
	text1.setBounds(50,190,50,50);
	textfield.setBounds(50,220,80,20);
	text2.setBounds(50,230,50,50);
	textfield1.setBounds(50,260,80,20);
	main_panel.add(text1);
	main_panel.add(text2);
	main_panel.add(textfield);
	main_panel.add(textfield1);
	
	JLabel text4 = new JLabel("Периметр прямоугольника");
    text4.setBounds(200,-5,200,500);
    main_panel.add(text4);
    
	JLabel text3 = new JLabel("Результат: ");
    text3.setBounds(200,10,200,500);
    main_panel.add(text3);
	
     
    JButton buttonInf1 = new JButton("Расчет");
    buttonInf1.setBounds(100,300,120,30);
    ActionListener MathListener = new MathListener(textfield, textfield1, text3);
    buttonInf1.addActionListener(MathListener);
    main_panel.add(buttonInf1);
     
    
    
	main_GUI.setVisible(true);
	
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	

		
	}
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		new subversion();
		
	}
	public JComponent getImage() {
		return image;
	}
	public void setImage(JComponent image) {
		this.image = image;
	}

}




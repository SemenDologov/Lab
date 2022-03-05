package Laba2;

import java.awt.event.*;


public class infoListener implements ActionListener {
	
	
	public void actionPerformed(ActionEvent arg0) {
			
		//studInfo.studCrt();
		new studInfo("<html>Номера зачетных книжек: <br>Долгов Семен - 20130847<br>Бикбулатов Данил - 20130717<br>Трофимов Данил - 20130841<br>Харисов Рафаэль - 20210066</html>");
	}
	
	
}
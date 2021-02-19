package Calcultor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Calc implements ActionListener {
	public static String operation;
	@Override
	public void actionPerformed(ActionEvent e) {
		// This will unset all input fields and set to zero the counts
		if(((JButton)e.getSource()).getText()=="C") {
			Cal.label1.setText("");
			Cal.label2.setText("");
			Cal.labelope.setText("");
			Cal.dot1=0;
			Cal.dot2=0;
		}
		else if(Cal.label1.getText()!=""){
			// Show the typed operation
			Cal.labelope.setText(((JButton)e.getSource()).getText());
		}
	}

}
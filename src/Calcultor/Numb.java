package Calcultor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Numb implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		/* 
		 * Test if the operation has been chosen, so that we will decide where to set
		   the  entered number, if no, then its the beginning, label1 will be used else label2
		 */
		if(Cal.labelope.getText()!="") { 
			
			/* there is only numbers with one dot, so if the dot is used, we can not use it any more.
			 * Example : 1.2 accepted but not 1..2
			 */
			if((((JButton)e.getSource()).getText()==".")&Cal.dot2==0) {// the dot not used yet
				
				Cal.dot2 =1; // to mark that the dot is used
				Cal.label2.setText(Cal.label2.getText()+((JButton)e.getSource()).getText());
		}
			else if((((JButton)e.getSource()).getText()==".")&Cal.dot2==1){
				// we can not use a dot any more
				Cal.label2.setText(Cal.label2.getText()+"");
				}
			else // no dots, the user is typing numbers only
				Cal.label2.setText(Cal.label2.getText()+((JButton)e.getSource()).getText());
		
			// Extract numbers and the operation
			Cal.number1 = Double.parseDouble(Cal.label1.getText());
			Cal.number2 = Double.parseDouble(Cal.label2.getText());
			Cal.operation = Cal.labelope.getText();
		}else {
			//
			if((((JButton)e.getSource()).getText()==".")&Cal.dot1==0) {// the dot not used yet
				Cal.dot1 =1; // to mark that the dot is used
				Cal.label1.setText(Cal.label1.getText()+((JButton)e.getSource()).getText());
		}
			else if((((JButton)e.getSource()).getText()==".")&Cal.dot1==1){
				// we can not use a dot any more
				Cal.label1.setText(Cal.label1.getText()+"");
				}
			else // no dots, the user is typing numbers only 
				Cal.label1.setText(Cal.label1.getText()+((JButton)e.getSource()).getText());
				} 
	}
}

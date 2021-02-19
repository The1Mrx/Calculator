package Calcultor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Result extends Exception implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		switch(Cal.operation) {
		case "+" :
			Cal.label1.setText(String.valueOf(Cal.number1+Cal.number2));
			Cal.label2.setText("");
			Cal.labelope.setText("");
			break;
		case "-":
			Cal.label1.setText(String.valueOf(Cal.number1-Cal.number2));
			Cal.label2.setText("");
			Cal.labelope.setText("");
			break;
		case "x" :
			Cal.label1.setText(String.valueOf(Cal.number1*Cal.number2));
			Cal.label2.setText("");
			Cal.labelope.setText("");
			break;
		case "/":
			if(Double.parseDouble(Cal.label2.getText())!=0.0)
				Cal.label1.setText(String.valueOf(Cal.number1/Cal.number2));
			else Cal.label1.setText("Error: Division by Zero ");
			Cal.label2.setText("");
			Cal.labelope.setText("");
			
			break;
			}
		}
	}

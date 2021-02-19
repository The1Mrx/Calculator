package Calcultor;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Exe {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					JFrame frmCal;
					frmCal = window.getFrame();
					frmCal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

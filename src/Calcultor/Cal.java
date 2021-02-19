package Calcultor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class Cal {

	private JFrame frmCalculatrice;
	public static JLabel label1;
	public static JLabel labelope;
	public static JLabel label2;
	public static int dot1;
	public static int dot2;
	public static double number1;
	public static double number2;
	public static String operation;
	
	// Buttons representing Numbers
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	// Buttons representing Operations
	private JButton btnAdi;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JButton btnCan;
	private JButton btnDot;
	private JButton btnEqu;
	
	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// frame settings
		frmCalculatrice = new JFrame();
		frmCalculatrice.setResizable(false);
		frmCalculatrice.setTitle("Calculator");
		frmCalculatrice.setBounds(150, 200, 277, 429);
		frmCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// The panel where number's label will be situated
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(25);
		frmCalculatrice.getContentPane().add(panel, BorderLayout.NORTH);
		
		// Label for the first number 
		label1 = new JLabel("");
		label1.setHorizontalTextPosition(SwingConstants.LEFT);
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		label1.setPreferredSize(new Dimension(90, 25));
		panel.add(label1);
		
		// Label for the operation
		labelope = new JLabel("");
		labelope.setHorizontalTextPosition(SwingConstants.LEFT);
		labelope.setHorizontalAlignment(SwingConstants.LEFT);
		labelope.setPreferredSize(new Dimension(25, 25));
		panel.add(labelope);
		
		// Label for the second number
		label2 = new JLabel("");
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		label2.setPreferredSize(new Dimension(90, 25));
		panel.add(label2);
		
		// Panel where buttons will be situated
		Panel panelButtons = new Panel();
		panelButtons.setBackground(new Color(211, 211, 211));
		frmCalculatrice.getContentPane().add(panelButtons, BorderLayout.CENTER);
		panelButtons.setLayout(null);
		
		// Button to unset all other numbers, operations and dots attributes
		btnCan = new JButton("C");
		btnCan.addActionListener(new Calc());
		btnCan.setBackground(Color.LIGHT_GRAY);
		btnCan.setForeground(Color.BLACK);
		btnCan.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCan.setBounds(205, 140, 55, 109);
		btnCan.setToolTipText("Cancel");
		panelButtons.add(btnCan);
		
		// Multiplication button
		btnMul = new JButton("x");
		btnMul.addActionListener(new Calc());
		btnMul.setBackground(Color.LIGHT_GRAY);
		btnMul.setForeground(Color.BLACK);
		btnMul.setFont(new Font("Dialog", Font.BOLD, 14));
		btnMul.setBounds(75, 20, 55, 49);
		btnMul.setToolTipText("Multiplication");
		panelButtons.add(btnMul);
		
		// Division button
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new Calc());
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDiv.setBackground(Color.LIGHT_GRAY);
		btnDiv.setToolTipText("Division");
		btnDiv.setBounds(10, 20, 55, 49);
		panelButtons.add(btnDiv);
		
		// Subscription button
		btnSub = new JButton("-");
		btnSub.addActionListener(new Calc());
		btnSub.setBackground(Color.LIGHT_GRAY);
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSub.setToolTipText("Substraction");
		btnSub.setBounds(140, 20, 55, 49);
		panelButtons.add(btnSub);
	
		// Adition button
		btnAdi = new JButton("+");
		btnAdi.addActionListener(new Calc());
		btnAdi.setBackground(Color.LIGHT_GRAY);
		btnAdi.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAdi.setForeground(Color.BLACK);
		btnAdi.setToolTipText("Adition");
		btnAdi.setBounds(205, 20, 55, 49);
		panelButtons.add(btnAdi);
		
		// Dot button
		btnDot = new JButton(".");
		btnDot.addActionListener(new Numb());
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDot.setToolTipText("Point");
		btnDot.setBounds(205, 80, 55, 49);
		panelButtons.add(btnDot);
		
		// Equal to button
		btnEqu = new JButton("=");
		btnEqu.addActionListener(new Result());
		btnEqu.setFont(new Font("Dialog", Font.BOLD, 14));
		btnEqu.setForeground(Color.BLACK);
		btnEqu.setBackground(new Color(255, 153, 0));
		btnEqu.setToolTipText("Equals");
		btnEqu.setBounds(140, 270, 120, 49);
		panelButtons.add(btnEqu);
		
		// Number 0
		btn0 = new JButton("0");
		btn0.addActionListener(new Numb());
		btn0.setBackground(new Color(211, 211, 211));
		btn0.setFont(new Font("Dialog", Font.BOLD, 14));
		btn0.setBounds(10, 270, 120, 49);
		panelButtons.add(btn0);
		
		// Number 1
		btn1 = new JButton("1");
		btn1.addActionListener(new Numb());
		btn1.setBackground(new Color(211, 211, 211));
		btn1.setFont(new Font("Dialog", Font.BOLD, 14));
		btn1.setBounds(10, 200, 55, 49);
		panelButtons.add(btn1);
		
		// Number 2
		btn2 = new JButton("2");
		btn2.addActionListener(new Numb());
		btn2.setBackground(new Color(211, 211, 211));
		btn2.setFont(new Font("Dialog", Font.BOLD, 14));
		btn2.setBounds(75, 200, 55, 49);
		panelButtons.add(btn2);
		
		// Number 3
		btn3 = new JButton("3");
		btn3.addActionListener(new Numb());
		btn3.setBackground(new Color(211, 211, 211));
		btn3.setFont(new Font("Dialog", Font.BOLD, 14));
		btn3.setBounds(140, 200, 55, 49);
		panelButtons.add(btn3);
		
		// Number 4
		btn4 = new JButton("4");
		btn4.addActionListener(new Numb());
		btn4.setBackground(new Color(211, 211, 211));
		btn4.setFont(new Font("Dialog", Font.BOLD, 14));
		btn4.setBounds(10, 140, 55, 49);
		panelButtons.add(btn4);
		
		// Number 5
		btn5 = new JButton("5");
		btn5.addActionListener(new Numb());
		btn5.setBackground(new Color(211, 211, 211));
		btn5.setFont(new Font("Dialog", Font.BOLD, 14));
		btn5.setBounds(75, 140, 55, 49);
		panelButtons.add(btn5);
		
		// Number 6
		btn6 = new JButton("6");
		btn6.addActionListener(new Numb());
		btn6.setBackground(new Color(211, 211, 211));
		btn6.setFont(new Font("Dialog", Font.BOLD, 14));
		btn6.setBounds(140, 140, 55, 49);
		panelButtons.add(btn6);
		
		// Number 7
		btn7 = new JButton("7");
		btn7.addActionListener(new Numb());
		btn7.setBackground(new Color(211, 211, 211));
		btn7.setFont(new Font("Dialog", Font.BOLD, 14));
		btn7.setBounds(10, 80, 55, 49);
		panelButtons.add(btn7);
		
		// Number 8
		btn8 = new JButton("8");
		btn8.addActionListener(new Numb());
		btn8.setBackground(new Color(211, 211, 211));
		btn8.setFont(new Font("Dialog", Font.BOLD, 14));
		btn8.setBounds(75, 80, 55, 49);
		panelButtons.add(btn8);
		
		// Number 9
		btn9 = new JButton("9");
		btn9.addActionListener(new Numb());
		btn9.setBackground(new Color(211, 211, 211));
		btn9.setFont(new Font("Dialog", Font.BOLD, 14));
		btn9.setBounds(140, 80, 55, 49);
		panelButtons.add(btn9);
		
	}
	
	// getters
	public JFrame getFrame() {
		return this.frmCalculatrice;
	}
}

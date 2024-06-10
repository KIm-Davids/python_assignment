import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	
public class Calculator implements ActionListener {

	JFrame frame;
	JTextField textfield;
	JButton[] numberButton = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton,multiplyButton,divideButton;
	JButton decimalButton,equalsButton,deleteButton,clearButton, negativeButton;
	JPanel panel;

	Font myFont = new Font("Ink Free", Font.BOLD,30);

	double number1 = 0, number2 = 0, result = 0;
	char operator;


	Calculator() {
		frame = new JFrame("Calculator");
		//frame.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);

		addButton = new JButton("+");
		subButton = new JButton("-");
		multiplyButton = new JButton("*");
		divideButton = new JButton("/");
		decimalButton = new JButton(".");
		equalsButton = new JButton("=");
		deleteButton = new JButton("Delete");
		clearButton = new JButton("clear");
		negativeButton = new JButton("(-)");
			
		functionButtons[0]  = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = multiplyButton;
		functionButtons[3] = divideButton;
		functionButtons[4] = decimalButton;
		functionButtons[5] = equalsButton;
		functionButtons[6] = deleteButton;
		functionButtons[7] = clearButton;
		functionButtons[8] = negativeButton;

		for(int counter = 0; counter < 8; counter++) {
			functionButtons[counter].addActionListener(this);
			functionButtons[counter].setFont(myFont);
			functionButtons[counter].setFocusable(false);

		}
		
		for(int counter = 0; counter < 10; counter++) {
			numberButton[counter] = new JButton(String.valueOf(counter));
			numberButton[counter].addActionListener(this);
			numberButton[counter].setFont(myFont);
			numberButton[counter].setFocusable(false);
	}


		



		
		frame.add(textfield);
		frame.setVisible(true);

		
		
	

	}
	public static void main(String[] arss) {
		Calculator calc = new Calculator();
	}
	public void actionPerformed(ActionEvent e) {
	}
}
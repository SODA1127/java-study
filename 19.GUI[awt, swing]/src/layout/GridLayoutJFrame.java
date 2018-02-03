package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutJFrame extends JFrame{
	JLabel numberL;
	JPanel buttonP;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton plusB, subB, mulB, divB, equalB;
	
	public GridLayoutJFrame() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Container contentPane = getContentPane();
		contentPane().setLayout(gl);*/
		
		/*
		 * North
		 */
		numberL = new JLabel("0", JLabel.RIGHT);
		numberL.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		
		numberL.setBackground(Color.WHITE);
		numberL.setOpaque(true);
		
		numberL.setForeground(Color.DARK_GRAY);
		
		buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(0, 4));
		
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		plusB = new JButton("+");
		subB = new JButton("-");
		mulB = new JButton("x");
		divB = new JButton("÷");
		
		buttonP.add(b1);
		buttonP.add(b2);
		buttonP.add(b3);
		buttonP.add(plusB);
		buttonP.add(b4);
		buttonP.add(b5);
		buttonP.add(b6);
		buttonP.add(subB);
		buttonP.add(b7);
		buttonP.add(b8);
		buttonP.add(b9);
		buttonP.add(mulB);
		buttonP.add(b0);
		buttonP.add(new JButton());
		buttonP.add(new JButton());
		buttonP.add(divB);
		
		/*
		 * south
		 */
		equalB = new JButton("=");
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(numberL, BorderLayout.NORTH);
		getContentPane().add(equalB, BorderLayout.SOUTH);
		getContentPane().add(buttonP, BorderLayout.CENTER);
		
		
		
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutJFrame();
	}
}

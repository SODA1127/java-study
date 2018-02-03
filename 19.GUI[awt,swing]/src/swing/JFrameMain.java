package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVAIOT\\workspaceSE\\20.\uC785\uCD9C\uB825[IO]\\android.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("login");
		btnNewButton.setBounds(72, 181, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("cancle");
		btnNewButton_1.setBounds(244, 181, 97, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("id");
		lblNewLabel.setIcon(null);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(82, 66, 57, 15);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("pass");
		lblNewLabel_1.setBounds(82, 121, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(225, 63, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 118, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}

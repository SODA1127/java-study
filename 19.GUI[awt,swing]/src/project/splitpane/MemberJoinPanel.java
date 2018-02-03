package project.splitpane;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import project.cardLayout.MemberManager;
import javax.swing.JCheckBox;

public class MemberJoinPanel extends JPanel {
	private JTextField idTF;
	private JPasswordField pwTF;
	private JTextField nameTF;
	private JTextField adressTF;

	/**
	 * Create the panel.
	 */
	public MemberJoinPanel() {
		setBackground(Color.ORANGE);
		setLayout(null);
		
		JLabel ID = new JLabel("ID");
		ID.setBounds(120, 64, 61, 16);
		add(ID);
		
		JLabel PW = new JLabel("PW");
		PW.setBounds(120, 92, 61, 16);
		add(PW);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(120, 120, 61, 16);
		add(Name);
		
		JLabel Adress = new JLabel("Adress");
		Adress.setBounds(120, 148, 61, 16);
		add(Adress);
		
		JLabel married = new JLabel("married");
		married.setBounds(120, 176, 61, 16);
		add(married);
		
		idTF = new JTextField();
		idTF.setBounds(193, 59, 130, 26);
		add(idTF);
		idTF.setColumns(10);
		
		pwTF = new JPasswordField();
		pwTF.setBounds(193, 87, 130, 26);
		add(pwTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(193, 115, 130, 26);
		add(nameTF);
		nameTF.setColumns(10);
		
		adressTF = new JTextField();
		adressTF.setBounds(193, 143, 130, 26);
		add(adressTF);
		adressTF.setColumns(10);
		
		JButton joinB = new JButton("Join");
		joinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//memberManager.
				
			}
		});
		joinB.setBounds(108, 204, 117, 29);
		add(joinB);
		
		JCheckBox marriedCB = new JCheckBox("married");
		marriedCB.setBounds(193, 172, 128, 23);
		add(marriedCB);

	}
}

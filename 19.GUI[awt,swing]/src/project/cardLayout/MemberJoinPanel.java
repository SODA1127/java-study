package project.cardLayout;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MemberJoinPanel extends JPanel {
	private JTextField idTF;
	private JTextField passTF;
	private JTextField nameTF;
	private JTextField addressTF;
	/*
	 * Frame 의 참조변수
	 */
	CardLayoutFrame frame;
	private JCheckBox marriedCB;

	/**
	 * Create the panel.
	 */
	public MemberJoinPanel() {
		setBackground(new Color(204, 204, 51));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(62, 40, 57, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(62, 88, 57, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setBounds(62, 124, 57, 15);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("address");
		lblNewLabel_3.setBounds(62, 165, 57, 15);
		add(lblNewLabel_3);

		idTF = new JTextField();
		idTF.setBounds(129, 37, 116, 21);
		add(idTF);
		idTF.setColumns(10);

		passTF = new JTextField();
		passTF.setBounds(129, 85, 116, 21);
		add(passTF);
		passTF.setColumns(10);

		nameTF = new JTextField();
		nameTF.setBounds(129, 121, 116, 21);
		add(nameTF);
		nameTF.setColumns(10);

		addressTF = new JTextField();
		addressTF.setBounds(129, 162, 116, 21);
		add(addressTF);
		addressTF.setColumns(10);

		JButton joinB = new JButton("\uAC00\uC785");
		joinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idStr = idTF.getText();
				String nameStr = nameTF.getText();
				String passStr = passTF.getText();
				String addressStr = addressTF.getText();
				boolean married = marriedCB.isSelected();
				Member joinMember = new Member(idStr, passStr, nameStr,
						addressStr, married);
				try {

					boolean success = frame.memberManager
							.joinMember(joinMember);
					if (success) {
						JOptionPane.showMessageDialog(null, "가입성공 로그인하세요.");
						// frame.cardLayout.show(frame.memberContentP, "login");
						// frame.changePanel(CardLayoutFrame.LIST);
						MemberLoginDialog loginDialog = new MemberLoginDialog(
								frame);
						loginDialog.setModal(true); // 한번 열면 다른 곳을 열 수 없음
						loginDialog.setFrame(frame);
						loginDialog
								.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						loginDialog.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null,
								"아이디가 중복되었습니다. 다시해바바요");
						idTF.select(0, idStr.length());
						idTF.requestFocus();
					}

				} catch (Exception e1) {

					JOptionPane.showMessageDialog(null, "가입실패!!");
					e1.printStackTrace();
				}
			}
		});
		joinB.setBounds(38, 254, 97, 23);
		add(joinB);

		JButton cancleB = new JButton("\uCDE8\uC18C");
		cancleB.setBounds(183, 254, 97, 23);
		add(cancleB);

		marriedCB = new JCheckBox("\uACB0\uD63C\uC5EC\uBD80");
		marriedCB.setBounds(62, 204, 115, 23);
		add(marriedCB);

	}

	public CardLayoutFrame getFrame() {
		return frame;
	}

	public void setFrame(CardLayoutFrame frame) {
		this.frame = frame;
	}

}
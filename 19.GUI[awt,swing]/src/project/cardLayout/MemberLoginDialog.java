package project.cardLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.omg.CORBA.FREE_MEM;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberLoginDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JTextField passTF;
	private CardLayoutFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { try { MemberLoginDialog dialog =
	 * new MemberLoginDialog();
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */
	/**
	 * Create the dialog.
	 */
	public MemberLoginDialog(CardLayoutFrame frame) {
		super(frame);
		setBounds(100, 100, 273, 195);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(22, 39, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uD328\uC4F0\uC6CC\uB4DC");
			lblNewLabel_1.setBounds(22, 80, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			idTF = new JTextField();
			idTF.setBounds(110, 36, 116, 21);
			contentPanel.add(idTF);
			idTF.setColumns(10);
		}
		{
			passTF = new JTextField();
			passTF.setBounds(110, 77, 116, 21);
			contentPanel.add(passTF);
			passTF.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\uB85C\uADF8\uC778");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String idStr = idTF.getText();
						String passStr = passTF.getText();
						try {
							// 0: 회원아님, 1.패쓰워드 불일치, 2.성공
							int loginState = frame.memberManager.login(idStr,
									passStr);
							switch (loginState) {
							case 0:
								JOptionPane.showMessageDialog(null,
										"아이디가 존재하지 않습니다!!");
								idTF.select(0, idStr.length());
								idTF.requestFocus();
								break;

							case 1:
								JOptionPane.showMessageDialog(null,
										"패스워드가 틀립니다!!");
								passTF.select(0, passStr.length());
								passTF.requestFocus();

								break;
							case 2:
								/********** 로그인 성공시 **********/
								frame.isLogin = true;
								Member loginMember = frame.memberManager.findById(idStr);
								frame.loginMember = loginMember;
								frame.setTitle(loginMember.getName() + "님 로그인 중");
								frame.changePanel(CardLayoutFrame.LIST);
								frame.buttonEnableDisable(1);
								dispose();

								break;
							}
						} catch (Exception e1) {

							e1.printStackTrace();
						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\uCDE8\uC18C");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public CardLayoutFrame getFrame() {
		return frame;
	}

	public void setFrame(CardLayoutFrame frame) {
		this.frame = frame;
	}

}
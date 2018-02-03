package project.cardLayout;

import javax.swing.JPanel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextArea;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DropMode;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class MemberListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	CardLayoutFrame frame;
	private JTable table;

	DefaultTableModel defaultTableModel;
	Vector headerNameVector;
	private JTextField idTF;
	private JTextField passTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JCheckBox marriedCB;

	int updateStatus = 0; // 0 : 최초상태, 1 : 수정을 위해 오픈된 상태(편집가능)

	public MemberListPanel(CardLayoutFrame frame) {
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				getMemberList();
			}
		});
		this.frame = frame;
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 45, 216, 208);
		add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/******************************************************/
				int selectedRow = table.getSelectedRow();
				System.out.println("selected Row : " + selectedRow);
				String idStr = (String) table.getModel().getValueAt(
						selectedRow, 0);
				String passStr = (String) table.getModel().getValueAt(
						selectedRow, 1);
				String nameStr = (String) table.getModel().getValueAt(
						selectedRow, 2);
				String addStr = (String) table.getModel().getValueAt(
						selectedRow, 3);
				boolean ismarried = (boolean) table.getModel().getValueAt(
						selectedRow, 4);
				System.out.println(idStr + " " + passStr + " " + nameStr + " "
						+ addStr + " " + ismarried);
				Member selectMember = new Member(idStr, passStr, nameStr,
						addStr, ismarried);

				idTF.setText(idStr);
				passTF.setText(passStr);
				nameTF.setText(nameStr);
				addressTF.setText(addStr);
				if (ismarried) {
					marriedCB.setSelected(true);
				} else {
					marriedCB.setSelected(false);
				}

			}
		});

		headerNameVector = new Vector();
		headerNameVector.add("id");
		headerNameVector.add("pass");
		headerNameVector.add("name");
		headerNameVector.add("address");
		headerNameVector.add("isMarried");

		scrollPane.setViewportView(table);

		JButton deleteB = new JButton("\uC0AD\uC81C");
		deleteB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow < 0) {
					JOptionPane.showMessageDialog(null, "삭제할 멤버를 선택하세요");
					table.setRowSelectionInterval(0, 0);
					return;
				}
				String idStr = (String) table.getModel().getValueAt(
						selectedRow, 0);
				try {
					frame.memberManager.deleteMember(idStr);
					JOptionPane.showMessageDialog(null, idStr + "이 삭제 됨");
					getMemberList();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		deleteB.setBounds(28, 265, 117, 29);
		add(deleteB);

		JSeparator separator = new JSeparator();
		separator.setBounds(33, 26, 383, 12);
		add(separator);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(261, 45, 155, 208);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(6, 20, 61, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(6, 48, 61, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setBounds(6, 76, 61, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("address");
		lblNewLabel_3.setBounds(6, 104, 61, 16);
		panel.add(lblNewLabel_3);

		marriedCB = new JCheckBox("isMarried");
		marriedCB.setBounds(6, 144, 128, 23);
		panel.add(marriedCB);

		idTF = new JTextField();
		idTF.setBounds(69, 15, 80, 26);
		panel.add(idTF);
		idTF.setColumns(10);

		passTF = new JTextField();
		passTF.setColumns(10);
		passTF.setBounds(69, 43, 80, 26);
		panel.add(passTF);

		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(69, 71, 80, 26);
		panel.add(nameTF);

		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(69, 99, 80, 26);
		panel.add(addressTF);

		JButton updateB = new JButton("\uC218\uC815");
		updateB.addActionListener(new ActionListener() {
			boolean ok = false;

			public void actionPerformed(ActionEvent e) {
				if (idTF.getText().equals(frame.loginMember.getId())
						&& ok == false) {
					if (updateStatus == 0) {
						JOptionPane.showMessageDialog(null, "수정 가능!!");
						idTF.setEnabled(false);
						passTF.setEnabled(true);
						nameTF.setEnabled(true);
						addressTF.setEnabled(true);
						marriedCB.setEnabled(true);
						updateStatus = 1;
					} else if (updateStatus == 1) {
						System.out.println("수정 완료");
						String idStr = idTF.getText();
						String passStr = passTF.getText();
						String nameStr = nameTF.getText();
						String addressStr = addressTF.getText();
						boolean married = marriedCB.isSelected();
						Member updateMember = new Member(idStr, passStr,
								nameStr, addressStr, married);
						try {
							frame.memberManager.updateMember(updateMember);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						updateStatus = 0;
						idTF.setEnabled(false);
						passTF.setEnabled(false);
						nameTF.setEnabled(false);
						addressTF.setEnabled(false);
						marriedCB.setEnabled(false);
						getMemberList();
					} else {
						JOptionPane.showMessageDialog(null, "본인만 수정가능");
					}
				}
			}
		});
		updateB.setBounds(0, 173, 80, 29);
		panel.add(updateB);

	}

	private void getMemberList() {

		Vector<Vector> tableDataVector = new Vector<Vector>();

		try {
			ArrayList<Member> memberList = frame.memberManager.memberList();
			for (int i = 0; i < memberList.size(); i++) {
				Member tempMember = memberList.get(i);
				Vector rowVector = new Vector();
				rowVector.add(tempMember.getId());
				rowVector.add(tempMember.getPassword());
				rowVector.add(tempMember.getName());
				rowVector.add(tempMember.getAddress());
				rowVector.add(tempMember.isMarried());
				tableDataVector.add(rowVector);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		defaultTableModel = new DefaultTableModel(tableDataVector,
				headerNameVector);
		table.setModel(defaultTableModel);
		// table.setRowSelectionInterval(0, 0);

		idTF.setEnabled(false);
		passTF.setEnabled(false);
		nameTF.setEnabled(false);
		addressTF.setEnabled(false);
		marriedCB.setEnabled(false);

	}
}
package project.tabpane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TabPaneJFrame extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabPaneJFrame frame = new TabPaneJFrame();
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
	public TabPaneJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int index = tabbedPane.getSelectedIndex();
				System.out.println("���õ� �� index : " + index);
				String tabTitle = tabbedPane.getTitleAt(index);
				System.out.println("���õ� �� title : " + tabTitle);
			}
		});
		tabbedPane.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		MemberLoginPanel memberLoginPanel = new MemberLoginPanel();
		tabbedPane.addTab("�α���", null, memberLoginPanel, null);
		
		MemberListPanel memberListPanel = new MemberListPanel();
		tabbedPane.addTab("ȸ������Ʈ", null, memberListPanel, null);
		
		MemberDetailPanel memberDetailPanel = new MemberDetailPanel();
		tabbedPane.addTab("ȸ���󼼺���", null, memberDetailPanel, null);
		
		MemberUpdatePanel memberUpdatePanel = new MemberUpdatePanel();
		tabbedPane.addTab("ȸ������", null, memberUpdatePanel, null);
		
		tabbedPane.setSelectedIndex(0);
		//tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
	}

}

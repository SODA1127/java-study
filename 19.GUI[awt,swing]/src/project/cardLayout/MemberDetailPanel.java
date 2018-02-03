package project.cardLayout;
 
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.util.ArrayList;
 
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
 
public class MemberDetailPanel extends JPanel {
	DefaultListModel defaultListModel;
	DefaultComboBoxModel defaultComboBoxModel;
	private JList list;
	private JComboBox comboBox;
	CardLayoutFrame frame;
	ArrayList<Member> memberList ;
	/**
	 * Create the panel.
	 */
	public MemberDetailPanel(CardLayoutFrame frame) {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					
					getMemberList();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		this.frame=frame;
		setBackground(Color.ORANGE);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 36, 106, 228);
		add(scrollPane);
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int fIndex=e.getFirstIndex();
				int lIndex=e.getLastIndex();
				
				Member selectedValue =(Member)list.getSelectedValue();
				int selectedIndex=list.getSelectedIndex();
				
				Member modelSelectedObject=
						(Member)list.getModel().getElementAt(selectedIndex);
				
				
				System.out.println("first index:"+fIndex);
				System.out.println("last index:"+lIndex);
				System.out.println(selectedValue);
				System.out.println(selectedIndex);
				System.out.println(modelSelectedObject);
				
			}
		});
		
		scrollPane.setViewportView(list);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectState=e.getStateChange();
				Member m1=(Member)e.getItem();
				
				int selectedIndex=comboBox.getSelectedIndex();
				Member m2=(Member)comboBox.getSelectedItem();
				Member m3=(Member)comboBox.getItemAt(selectedIndex);
				
				Member m4=(Member)comboBox.getModel().getSelectedItem();
				Member m5=(Member)comboBox.getModel().getElementAt(selectedIndex);
				
				System.out.println(selectState);
				System.out.println(m1);
				System.out.println(m2);
				System.out.println(m3);
				System.out.println(m4);
				System.out.println(m5);
				
				
			}
		});
		
		comboBox.setBounds(165, 34, 124, 21);
		add(comboBox);
		
		defaultListModel=new DefaultListModel();
		defaultComboBoxModel=new DefaultComboBoxModel();
		list.setModel(defaultListModel);
		comboBox.setModel(defaultComboBoxModel);
		
	}
	
	public void getMemberList() throws Exception {
		
		defaultListModel=new DefaultListModel();
		
		this.memberList = frame.memberManager.memberList();
		for (int i = 0; i < memberList.size(); i++) {
			Member tempMember=memberList.get(i);
			defaultListModel.addElement(tempMember);
		}
		
		
		
		defaultComboBoxModel=new DefaultComboBoxModel();
		for (int i = 0; i < memberList.size(); i++) {
			Member tempMember=memberList.get(i);
			defaultComboBoxModel.addElement(tempMember);
		}
		
		
		list.setModel(defaultListModel);
		comboBox.setModel(defaultComboBoxModel);
		
		
		
	}
}
package project.cardLayout;

import javax.swing.JPanel;

import java.awt.Color;

public class MemberLoginPanel extends JPanel {
	  /*
	    * Frame �� ��������
	    */
	   CardLayoutFrame frame;
	/**
	 * Create the panel.
	 */
	public MemberLoginPanel() {
		setBackground(Color.RED);

	}
	public CardLayoutFrame getFrame() {
		return frame;
	}
	public void setFrame(CardLayoutFrame frame) {
		this.frame = frame;
	}
	
	
	
}

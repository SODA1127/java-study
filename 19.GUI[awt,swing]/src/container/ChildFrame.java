package container;

import java.awt.Color;
import java.awt.Frame;

public class ChildFrame extends Frame {
	public ChildFrame() {
		super();
		this.setSize(300, 400);
		/*
		 * awt������ ����--> �����̳��� �̺�Ʈ,����Ʈ�� ���ش��
		 */
		this.setTitle("��ӿ����� �����ӻ���");
		this.setBackground(new Color(0, 0, 255));
		this.setVisible(true);

	}
	
	public static void main(String[] args) {
		new ChildFrame();
	}
	
}

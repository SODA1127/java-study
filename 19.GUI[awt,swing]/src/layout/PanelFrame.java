package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelFrame  extends Frame{
		
	private Panel southP;
	private Button b1,b2,b3;
	
	
	private Panel northP;
	
	private Panel westP;
	private Button b4,b5;
	
	private Panel eastP;
	private Panel centerP;
	
	
	public PanelFrame() {
		
		southP=new Panel();
		southP.setBackground(Color.RED);
		southP.setLayout(new FlowLayout());
		b1=new Button("가입");
		b2=new Button("수정");
		b3=new Button("삭제");
		
		southP.add(b1);
		southP.add(b2);
		southP.add(b3);
		
		northP=new Panel();
		northP.setBackground(Color.ORANGE);
		
		westP=new Panel();
		westP.setBackground(Color.YELLOW);
		westP.setLayout(new BorderLayout());
		b4=new Button("접속자");
		b5=new Button("강퇴");
		westP.add(b4, BorderLayout.NORTH);
		westP.add(b5, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		eastP=new Panel();
		eastP.setBackground(Color.GREEN);
		centerP=new Panel();
		centerP.setBackground(Color.BLUE);
		
		
		setLayout(new BorderLayout());
		
		add(southP,BorderLayout.SOUTH);
		add(northP,BorderLayout.NORTH);
		add(eastP,BorderLayout.EAST);
		add(westP,BorderLayout.WEST);
		add(centerP,BorderLayout.CENTER);
		
		
		
		setSize(300, 400);
		
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new PanelFrame();
	}

}

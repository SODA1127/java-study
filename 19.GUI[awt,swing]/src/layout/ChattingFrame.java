package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class ChattingFrame extends Frame {
	
	Label chatL;
	TextArea chatTA;
	List chatLIST;
	
	Panel southP;
	TextField chatTF;
	Button sendB;
	
	public ChattingFrame() {
		chatL=new Label("#### XX √§∆√ ####",Label.CENTER);
		
		chatTA=new TextArea("º∫ø¨: ππ«œ¥œ!!!!\n∞Ê»£:∞¡¿÷æÓ");
		chatTA.setEditable(false);
		chatLIST=new List();
		
		chatLIST.add("±Ë¿∫»Ò");
		chatLIST.add("Ω≈∏Ìº˜");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		chatLIST.add("¡§∫¿»≠");
		
		southP=new Panel();
		southP.setLayout(new FlowLayout());
		chatTF=new TextField(42);
		sendB=new Button("¿¸º€");
		southP.add(chatTF);
		southP.add(sendB);
		
		setLayout(new BorderLayout());
		
		add(chatL,BorderLayout.NORTH);
		add(chatTA,BorderLayout.CENTER);
		add(southP,BorderLayout.SOUTH);
		add(chatLIST,BorderLayout.WEST);
		
		setSize(400, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChattingFrame();

	}

}

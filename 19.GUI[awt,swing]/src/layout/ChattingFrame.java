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
		chatL=new Label("#### XX ä�� ####",Label.CENTER);
		
		chatTA=new TextArea("����: ���ϴ�!!!!\n��ȣ:���־�");
		chatTA.setEditable(false);
		chatLIST=new List();
		
		chatLIST.add("������");
		chatLIST.add("�Ÿ��");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		chatLIST.add("����ȭ");
		
		southP=new Panel();
		southP.setLayout(new FlowLayout());
		chatTF=new TextField(42);
		sendB=new Button("����");
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

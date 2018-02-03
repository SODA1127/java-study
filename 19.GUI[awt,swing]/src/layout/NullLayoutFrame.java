package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class NullLayoutFrame extends Frame {
	/*
	 * 1.������Ʈ����
	 */
	private Button loginBtn;
	private Button cancleBtn;
	
	private Label idL;
	private Label passL;
	
	private TextField idTF;
	private TextField passTF;
	
	

	public NullLayoutFrame() {
		
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		
		
		/*
		 * 2.������Ʈ����
		 */
		loginBtn=new Button("�α���");
		loginBtn.setBackground(Color.BLUE);
		loginBtn.setForeground(Color.ORANGE);
		
		cancleBtn=new Button("���");
		
		
		
		idL=new Label("���̵�");
		idL.setBackground(Color.CYAN);
		idL.setForeground(Color.RED);
		
		passL=new Label("�о�����");
		
		idTF=new TextField();
		passTF=new TextField();
		passTF.setEchoChar('��');
		
		
		//��ġ�����ڰ�ü�� ����
		setLayout(null);
		
		//������Ʈ ��ġ����
		loginBtn.setBounds(50, 180, 100, 25);
		cancleBtn.setBounds(150, 180, 100, 25);
		
		idL.setBounds(50, 100, 70, 25);
		passL.setBounds(50, 140, 70, 25);
		
		
		idTF.setBounds(150, 100, 100, 25);
		passTF.setBounds(150, 140, 100, 25);
		
		/*
		 * 3.������Ʈ �� �����̳ʿ� ��ģ��.
		 */
		this.add(loginBtn);
		this.add(cancleBtn);
		this.add(idL);
		this.add(passL);
		this.add(idTF);
		this.add(passTF);
		
		setTitle("NullLayout");
		setBackground(new Color(255, 255, 0));
		
		setSize(300, 250);
		
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new NullLayoutFrame();

	}

}

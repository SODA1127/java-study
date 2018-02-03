package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class NullLayoutFrame extends Frame {
	/*
	 * 1.컴포넌트선언
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
		 * 2.컴포넌트생성
		 */
		loginBtn=new Button("로그인");
		loginBtn.setBackground(Color.BLUE);
		loginBtn.setForeground(Color.ORANGE);
		
		cancleBtn=new Button("취소");
		
		
		
		idL=new Label("아이디");
		idL.setBackground(Color.CYAN);
		idL.setForeground(Color.RED);
		
		passL=new Label("패쓰워드");
		
		idTF=new TextField();
		passTF=new TextField();
		passTF.setEchoChar('●');
		
		
		//배치관리자객체를 제거
		setLayout(null);
		
		//컴포넌트 위치설정
		loginBtn.setBounds(50, 180, 100, 25);
		cancleBtn.setBounds(150, 180, 100, 25);
		
		idL.setBounds(50, 100, 70, 25);
		passL.setBounds(50, 140, 70, 25);
		
		
		idTF.setBounds(150, 100, 100, 25);
		passTF.setBounds(150, 140, 100, 25);
		
		/*
		 * 3.컴포넌트 를 컨테이너에 부친다.
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

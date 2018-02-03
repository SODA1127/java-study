package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class NullLayoutFrame extends Frame {
	/*
	 * 1. 컴포넌트 선언
	 */
	private Button loginBtn;
	private Button cancleBtn;
	private Label idL;
	private Label pwL;
	private TextField idTF;
	private TextField pwTF;
	
	
	public NullLayoutFrame() {
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 19));
		/*
		 * 2. 컴포넌트 생성
		 */
		loginBtn = new Button("로그인");
		loginBtn.setBackground(Color.BLUE);
		cancleBtn = new Button("취소");
		cancleBtn.setBackground(Color.ORANGE);
		
		
		idL = new Label("아이디");
		idL.setBackground(Color.CYAN);
		idL.setBackground(Color.RED);
		
		pwL = new Label("패스워드");
		
		idTF = new TextField();
		pwTF = new TextField();
		pwTF.setEchoChar('•');
		
		//배치관리자 객체를 제거
		setLayout(null);
		
		//컴포넌트 위치 설정
		loginBtn.setBounds(50, 180, 100, 25);
		cancleBtn.setBounds(150, 180, 100, 25);
		
		idL.setBounds(50, 100, 70, 25);
		pwL.setBounds(50, 140, 70, 25);
		
		idTF.setBounds(150, 100, 100, 25);
		pwTF.setBounds(150, 140, 100, 25);
		
		
		/*
		 * 3. 컴포넌트를 컨테이너에 붙인다.
		 */
		this.add(loginBtn);
		this.add(cancleBtn);
		this.add(idL);
		this.add(pwL);
		this.add(idTF);
		this.add(pwTF);
		
		
		
		setTitle("NullLayout");
		setBackground(new Color(255, 255, 0));
		
		setSize(300, 250);
		//setResizable(false);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new NullLayoutFrame();
	}

}

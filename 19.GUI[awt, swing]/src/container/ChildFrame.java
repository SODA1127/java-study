package container;

import java.awt.Color;
import java.awt.Frame;

public class ChildFrame extends Frame{
	public ChildFrame() {
		super();
		this.setSize(300, 400);
		this.setTitle("상속에 의한 프레임 생성");
		this.setBackground(new Color(0, 0, 255));
		/*
		 * awt 스레드 생성 --> 컨테이너의 이벤트,페인트를 위해 대기
		 */
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ChildFrame();
	}
}

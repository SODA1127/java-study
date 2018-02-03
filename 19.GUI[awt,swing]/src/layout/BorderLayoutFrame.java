package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.util.concurrent.BrokenBarrierException;

public class BorderLayoutFrame extends Frame{
	Button b1,b2,b3,b4,b5;
	
	
	public BorderLayoutFrame() {
		b1=new Button("NORTH");
		b2=new Button("SOUTH");
		b3=new Button("EAST");
		b4=new Button("WEST");
		b5=new Button("CENTER");
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		
		add(b1,BorderLayout.NORTH);
		//add(b1,"South");
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		//add(b5,BorderLayout.CENTER);
		
		
		setSize(300, 400);
		setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new BorderLayoutFrame();

	}

}

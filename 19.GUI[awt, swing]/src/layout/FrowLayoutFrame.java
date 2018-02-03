package layout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


public class FrowLayoutFrame extends Frame{
	Button b1, b2, b3, b4;
	public FrowLayoutFrame() {
		b1 = new Button("FIRST");
		b2 = new Button("SECOND");
		b3 = new Button("THIRD");
		b4 = new Button("FORTH");
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrowLayoutFrame();
	}

}

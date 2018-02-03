package paint;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class PaintFrame extends Frame{
	public PaintFrame() {
		setSize(300, 400);
		setVisible(true);
	}
	/*public void paint(Graphics g)
	 	* Paints this component.
	 		* This method is called when the contents of the component should be painted;
	 		* such as when the component is first being shown or is damaged and in need of repair.
	 		* The clip rectangle in the Graphics parameter is set to the area which needs to be painted.
	 		* Subclasses of Component that override this method need not call super.paint(g).*/
	
	@Override
	public void paint(Graphics g) {
		// super.paint(g);
		// System.out.println("paint thread name : " + Thread.currentThread().getName());
		// System.out.println("Graphics : " + g);
		/*
		 * class Graphics
		 * 			- paint 메소드가 소속 된 Component를 그리는 펜
		 * 			- 	
		 */
		
		/*
		 * back Image
		 */
		Image backImage = Toolkit.getDefaultToolkit().getImage("penguin_back.jpg");
		g.drawImage(backImage, 0, 0, getWidth(), getHeight(), this);
		
		g.drawString("안녕 페인트", 100, 100);
		g.drawRect(30, 80, 50, 50);
		/*
		 * 펜색 변경
		 */
		g.setColor(Color.ORANGE);
		g.fillRect(30, 140, 50, 50);
		
		g.setColor(Color.RED);
		g.drawOval(getWidth()/2 - 25, getHeight()/2 - 25, 50, 50);
		g.fillOval(getWidth()/2 - 15, getHeight()/2 - 15, 30, 30);
		
		/*
		 * Line
		 */
		g.setColor(Color.BLUE);
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		
		/*
		 * Image
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image penguin1 = toolkit.getImage("penguin1.png");
		Image penguin2 = Toolkit.getDefaultToolkit().getImage("penguin2.png");
		Image penguin3 = Toolkit.getDefaultToolkit().getImage("penguin3.png");
		
		g.drawImage(penguin1, 30, 200, this);
		g.drawImage(penguin2, 120, 200, this);
		g.drawImage(penguin3, 210, 200, this);
		
	}
	
	public static void main(String[] args) {
		new PaintFrame();
		
	}
}

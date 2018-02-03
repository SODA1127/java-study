package paint;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GameFrame extends Frame implements KeyListener{
	Image[] penguinImages = new Image[3];
	Image backImage;
	int imageIndex; // 이미지 번호
	int pX, pY; //펭귄 위치
	int sX, sY; //돌의 위치
	Image stoneImage; //돌 이미지
	ClockThread clockThread;
	GameThread gameThread;
	boolean clockThreadisAlive = false;
	boolean gameThreadisAlive = false;
	boolean isShow; //깜빡 거림
	
	public GameFrame() {
		setSize(new Dimension(300, 400));
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				clockThreadisAlive = false;
				clockThread = null;
				System.exit(0);
			}
		});
		/*
		 * keyEvent
		 */
		this.addKeyListener(this);
		
		/********************************************************/
		for (int i = 0; i < penguinImages.length; i++) {
			penguinImages[i] = Toolkit.getDefaultToolkit().getImage("penguin" + (i + 1) + ".png");
		}
		backImage = Toolkit.getDefaultToolkit().getImage("penguin_back.jpg");
		stoneImage = Toolkit.getDefaultToolkit().getImage("stone.png");
		
		imageIndex = 0;
		pX = 150;
		pY = 270;
		sX = 120;
		sY = 20;
		isShow = true;
		clockThread = new ClockThread();
		clockThreadisAlive = true;
		clockThread.start();
		
		gameThread = new GameThread();
		gameThreadisAlive = true;
		gameThread.start();
		/********************************************************/
		requestFocus();
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);	
		g.drawImage(backImage, 0, 0, getWidth(), getHeight(), this);
		if(isShow){
			g.drawImage(penguinImages[imageIndex], pX, pY, this);
			g.drawImage(stoneImage, sX, sY, 30, 30, this);
		}
	}
	
	
	
	/*
	 public void repaint()
	 Repaints this component.
	 If this component is a lightweight component,
	 this method causes a call to this component's paint method as soon as possible.
	 Otherwise, this method causes a call to this component's update method as soon as possible.
	 */
	@Override
	public void repaint() {	
		super.repaint();
	}
	
	public boolean isBump(){
		boolean isBump = false;
		if(sX >= pX - 30 && sX <= pX + penguinImages[0].getWidth(this)){
			if(sY >= pY - 30 && sY <= pY + penguinImages[0].getHeight(this)){
				isBump = true;
			}
		}
		return isBump;
	}
	/**************************** keyListner impl ****************************/
	public void keyPressed(java.awt.event.KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			pX = pX - 10;
			if(pX <= 0){
				pX = 0;
			}
			imageIndex ++;
			imageIndex = imageIndex % 3;
			repaint();
			break;
		case KeyEvent.VK_RIGHT:
			pX = pX + 10;
			if(pX >= getWidth() - penguinImages[0].getWidth(this)){
				pX = getWidth() - penguinImages[0].getWidth(this);
			}
			imageIndex ++;
			imageIndex = imageIndex % 3;
			repaint();
			break;
		}
	};
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	/********************************************************/
	
	/********************************************************/
	
	public class ClockThread extends Thread{
		@Override
		public void run() {
			while (clockThreadisAlive) {
				try {
					Thread.sleep(1000);
					Date nowDate = new Date();
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
					String dateStr = simpleDateFormat.format(nowDate);
					//System.out.println(dateStr);
					setTitle(dateStr);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/********************************************************/
	public class GameThread extends Thread{
		@Override
		public void run() {
			while (gameThreadisAlive) {
				try {
					Thread.sleep(100);
					sY = sY + 10;
					if(sY > getHeight() - stoneImage.getHeight(GameFrame.this)){
						sY = getHeight() - stoneImage.getHeight(GameFrame.this);

						Thread.sleep(400);
						sX = - 100;
						sY = - 100;
						repaint();
						Thread.sleep(200);
						/*
						 * 새로운 돌 생성
						 */
						sX = (int )(Math.random() * getWidth());
						sY = 20;
					}
					else{
						boolean isBump = isBump();
						if(isBump){
							//System.out.println("충돌");
							for (int i = 0; i <3; i++) {
								isShow = !isShow;
								Thread.sleep(100);
								repaint();
							}
						}
						repaint();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new GameFrame();
	}


	
	
	
}

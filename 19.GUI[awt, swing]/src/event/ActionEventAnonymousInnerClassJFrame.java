package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class ActionEventAnonymousInnerClassJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventAnonymousInnerClassJFrame frame = new ActionEventAnonymousInnerClassJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActionEventAnonymousInnerClassJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnNewMenu.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);
		
		JMenuItem mntmSaveas = new JMenuItem("Save As");
		mnNewMenu.add(mntmSaveas);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 311, 545, 39);
		contentPane.add(panel);
		
		JButton firstB = new JButton("button1");
		firstB.setBounds(24, 6, 94, 29);
		//firstB.addActionListener(new Button1Handler());
		Button1Handler bh1 = new Button1Handler();
		firstB.addActionListener(bh1);
		panel.setLayout(null);
		panel.add(firstB);
		
		JButton secondB = new JButton("button2");
		secondB.setBounds(123, 6, 94, 29);
		secondB.addActionListener(new Button1Handler());
		panel.add(secondB);
		
		JButton thirdB = new JButton("button3");
		thirdB.setBounds(222, 6, 94, 29);
		ActionListener bh3 = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		};
		thirdB.addActionListener(bh3);
		panel.add(thirdB);
		
		JButton forthB = new JButton("button 4");
		forthB.setBounds(321, 6, 98, 29);
		forthB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		panel.add(forthB);
		
		JButton fifthB = new JButton("button 5");
		fifthB.setBounds(424, 6, 98, 29);
		fifthB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		panel.add(fifthB);
	}
	/********************* Button1 Handler *********************/
	public class Button1Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
		}
	}
	
}

package project.splitpane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class SplitPaneJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplitPaneJFrame frame = new SplitPaneJFrame();
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
	public SplitPaneJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setResizeWeight(0.2);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel leftP = new JPanel();
		leftP.setBackground(Color.BLACK);
		splitPane.setLeftComponent(leftP);
		leftP.setLayout(new GridLayout(0, 1, 1, 0));
		
		JButton btnNewButton = new JButton("New button");
		leftP.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		leftP.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		leftP.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		leftP.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		leftP.add(btnNewButton_4);
		
		JPanel rightP = new JPanel();
		rightP.setBackground(SystemColor.textHighlight);
		splitPane.setRightComponent(rightP);
	}

}

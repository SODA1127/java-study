package chat.client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.Socket;

public class ChatServerTestJFrame extends JFrame {

	private JPanel contentPane;
	Socket socket;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerTestJFrame frame = new ChatServerTestJFrame();
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
	public ChatServerTestJFrame() throws Exception{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		socket = new Socket("192.168.36.58", 1234);
		String clientId = socket.getLocalAddress().getHostName() + "[" + socket.getLocalPort() + "]";
		setTitle(clientId);
	}

}

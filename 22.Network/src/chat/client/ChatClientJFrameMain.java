package chat.client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ChatClientJFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JTextArea chatTA;

	/***************************/
	private ClientMemberSocket clientMemberSocket;
	private JScrollPane scrollPane;

	/***************************/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClientJFrameMain frame = new ChatClientJFrameMain();
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
	public ChatClientJFrameMain() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		chatTA = new JTextArea();
		chatTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		chatTA.setBackground(new Color(250, 250, 210));
		scrollPane.setViewportView(chatTA);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);

		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chatTF.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "대화를 입력하세요.");
					chatTF.requestFocus();
					return;
				}
				String chatStr = chatTF.getText();
				try {
					clientMemberSocket.send(clientMemberSocket.id + " : "
							+ chatStr);
					chatTF.setText("");
					chatTF.requestFocus();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(chatTF);
		chatTF.setColumns(42);

		JButton chatB = new JButton("전송 ");
		chatB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chatTF.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "대화를 입력하세요.");
					chatTF.requestFocus();
					return;
				}
				String chatStr = chatTF.getText();
				chatTF.setText("");
				chatTF.requestFocus();
				try {
					clientMemberSocket.send(clientMemberSocket.id + " : "
							+ chatStr);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(chatB);
		/*****************************************/
		clientMemberSocket = new ClientMemberSocket();
		clientMemberSocket.start();
		/*****************************************/
	}

	public void displayChatMessage(String message) {
		chatTA.append(message + "\n");
		scrollPane.getVerticalScrollBar().setValue(
				scrollPane.getVerticalScrollBar().getMaximum());
	}

	/***************** ClientMemberSocket*****************
	 - 클라이언트쪽 소켓을 사용해서 데이타전송, 수신을 하는 스레드 객체
	 - 서버의 한개의 ServerMemberSocket 객체와 통신을 담당하는 스레드객체
	 ****************************************************/
	public class ClientMemberSocket extends Thread {
		String id;
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		public ClientMemberSocket() throws Exception {
			socket = new Socket("192.168.36.58", 1234);
			//socket = new Socket("192.168.12.31", 1234);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			id = socket.getLocalAddress().getHostAddress() + "["
					+ socket.getLocalPort() + "]";
			setTitle(id);
			// displayChatMessage("0. ClientMemberSocket-->  ChatServer 접속 성공");
		}

		@Override
		public void run() {
			try {
				while (true) {

					// displayChatMessage("1. ClientMemberSocket--> Server로부터 전송되는 데이타를 읽기 위해 대기");
					String readStr = in.readUTF();
					// displayChatMessage("2. ClientMemberSocket--> Server로부터 전송되는 데이타를 읽기");
					displayChatMessage(readStr);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void send(String sendData) throws Exception {
			out.writeUTF(sendData);

		}
	}
}
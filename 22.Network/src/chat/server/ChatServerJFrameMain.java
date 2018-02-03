package chat.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import chat.client.ChatClientJFrameMain;

import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatServerJFrameMain extends JFrame {
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea chatServerTA;
	private JTextField noticeTF;
	private JButton noticeB;
	/**************************/
	ServerMemberSocketManager memberManager;
	ChatServerThread chatServerThread;
	private JButton btnNewButton;

	/**************************/
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerJFrameMain frame = new ChatServerJFrameMain();
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
	public ChatServerJFrameMain() {
		setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		chatServerTA = new JTextArea();
		chatServerTA.setEditable(false);
		chatServerTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));
		scrollPane.setViewportView(chatServerTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noticeStr = noticeTF.getText();
				if(noticeStr.trim().equals("")){
					JOptionPane.showMessageDialog(null, "공지 데이터 입력하세요!");
					noticeTF.requestFocus();
					return;
				}
				try{
					memberManager.sendBroadCasting("[공지사항]" + noticeStr);
					noticeTF.setText("");
					noticeTF.requestFocus();
				} catch(Exception e1){
					displayMessage(e1.getMessage());
					e1.printStackTrace();
				}
			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(35);
		
		noticeB = new JButton("공지 데이터 입력하세요!");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noticeStr = noticeTF.getText();
				if(noticeStr.trim().equals("")){
					JOptionPane.showMessageDialog(null, "공지 데이터 입력하세요!");
					noticeTF.requestFocus();
					return;
				}
				try{
					memberManager.sendBroadCasting("[공지사항]" + noticeStr);
					noticeTF.setText("");
					noticeTF.requestFocus();
				} catch(Exception e1){
					displayMessage(e1.getMessage());
					e1.printStackTrace();
				}
			}
		});
		panel.add(noticeB);

		
		
		/****************************/
		memberManager = new ServerMemberSocketManager();
		chatServerThread = new ChatServerThread();
		chatServerThread.start();
		/****************************/
	}

	/*
	 * 프레임(TextArea)에 메세지를 보여주는 메쏘드
	 */
	public void displayMessage(String msg) {
		chatServerTA.append(msg + "\n");
		scrollPane.getVerticalScrollBar().setValue(
				scrollPane.getVerticalScrollBar().getMaximum());
	}

	/******************** ChatServerThread start **************************
	 * - 특정포트를열고 클라이언트 소켓접속요청을 처리해서 소켓을 생성하는 클래스
	 * - 클라이언트 소켓접속요청을 처리하기 위해 무한대기
	 **************************************************************/
	public class ChatServerThread extends Thread {
		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(1234);
				while (true) {
					displayMessage("1. ChatServerThread --> 클라이언트 소켓 연결 요청 대기");
					Socket socket = serverSocket.accept();
					displayMessage("2. ChatServerThread --> 클라이언트소켓연결 : " + socket);
					ServerMemberSocket serverMemberSocket = new ServerMemberSocket(
							socket);
					displayMessage("3. ChatServerThread --> ServerMemberSocket 객체 생성 스레드 스타트");
					memberManager.addServerMemberSocket(serverMemberSocket);
					displayMessage("4. ChatServerThread --> Membermanager에 ServerMemberSocket 객체 추가");
				}
			} catch (Exception e) {
				e.printStackTrace();
				displayMessage(e.getMessage());
			}
		}
	}// end ChatServerThread

	/************************ ChatServerThread end ************************/

	/*********************** ServerMemberSocket****************************
	 * 한명의 클라이언트(Socket)와 통신을 담당하는 쓰레드객체
	 * - 클라이언트소켓 1개 를 자지고있는객체
	 * - 클라이언트의 정보를 가지는객체(식별id, ...)
	 * - 클라이언트 당 1개씩생성
	 ********************************************************************/
	public class ServerMemberSocket extends Thread {
		Socket socket;
		String id;
		DataOutputStream out;
		DataInputStream in;

		public ServerMemberSocket(Socket socket) throws Exception {
			this.socket = socket;
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			id = socket.getInetAddress().getHostAddress() + "["
					+ socket.getPort() + "]";
			start();
		}

		/*
		 * 수신(무한대기)
		 */
		@Override
		public void run() {
			try {
				while (true) {
					displayMessage("A.ServerMemberSocket [" + id + "] --> 읽기위해 대기");
					String readData = in.readUTF();
					memberManager.sendBroadCasting(readData);
				}
			} catch (Exception e) {
				displayMessage(">>>>>>>>>>> " + id + " 제거~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				try {
					memberManager.removeServerMemberSocket(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();

			}
		}

		/*
		 * 전송
		 */
		public void send(String sendData) throws Exception {
			out.writeUTF(sendData);
		}
	}

	/*********************** ServerMemberSocket end ************************/
	/*********************************************************************
	 * - ServerMemberSocket 객체관리클래스 - ServerMemberSocket객체 ArrayList(배열) 을
	 * 멤버변수로가진다. - ServerMemberSocket객체 추가,삭제,브로드캐스팅,찾기 작업을 수행한다.
	 *********************************************************************/
	public class ServerMemberSocketManager {
		ArrayList<ServerMemberSocket> memberList = new ArrayList<ServerMemberSocket>();

		/*
		 * ServerMemberSocket객체 추가(입장)
		 */
		public void addServerMemberSocket(ServerMemberSocket member) throws Exception{
			memberList.add(member);
			displayMessage("현재 접속자 수 : " + memberList.size());
			displayMessage(">>>>>>>>>>>" + member.id + " 님 입장");
			memberManager.sendBroadCasting(">>>>>>>>>>>" + member.id + " 님이 입장하셨습니다.");
		}
		
		/*
		 * 모든 클라이언트에게 데이터를 전송
		 */
		public void sendBroadCasting(String noticeStr) throws Exception{
			for (int i = 0; i < memberList.size(); i++) {
				ServerMemberSocket member = memberList.get(i);
				member.send(noticeStr);
			}
		}

		/*
		 * ServerMemberSocket객체 삭제(퇴장)
		 */
		public void removeServerMemberSocket(ServerMemberSocket member) throws Exception {
			memberList.remove(member);
			displayMessage("현재 접속자수 : " + memberList.size());
			displayMessage(">>>>>>>>>>>" + member.id + " 님 퇴장");
			memberManager.sendBroadCasting(member.id + "님이 퇴장하셨습니다.");
		}

	}
}// end ChatServerJFrameMain


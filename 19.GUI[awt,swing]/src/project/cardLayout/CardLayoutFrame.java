package project.cardLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;

public class CardLayoutFrame extends JFrame {
	boolean isLogin = false;
	Member loginMember = null;
	
	private JPanel contentPane;
	JPanel memberContentP;
	CardLayout cardLayout;

	private MemberJoinPanel memberJoinPanel;
	private MemberLoginPanel memberLoginPanel;
	private MemberListPanel memberListPanel;
	private MemberDetailPanel memberDetailPanel;
	private MemberUpdatePanel memberUpdatePanel;
	private JPanel blankP;

	public final static String LOGIN = "login";
	public final static String JOIN = "join";
	public final static String LIST = "list";
	public final static String DETAIL = "detail";
	public final static String UPDATE = "update";

	/*
	 * 1.모든Manager선언
	 */
	MemberManager memberManager;

	private JButton prevB;
	private JButton joinB;
	private JButton loginB;
	private JButton listB;
	private JButton detailB;
	private JButton updateB;
	private JButton nextB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutFrame frame = new CardLayoutFrame();
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
	public CardLayoutFrame() throws Exception {

		/*
		 * 2.모든Manager 객체생성
		 */
		memberManager = new MemberManager();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel mainP = new JPanel();
		contentPane.add(mainP, BorderLayout.CENTER);
		mainP.setLayout(new BorderLayout(0, 0));

		JPanel buttonP = new JPanel();
		mainP.add(buttonP, BorderLayout.SOUTH);

		joinB = new JButton("\uAC00\uC785");
		joinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(memberContentP, "join");
			}
		});

		prevB = new JButton("<<");
		prevB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(memberContentP);
			}
		});
		buttonP.add(prevB);
		buttonP.add(joinB);

		loginB = new JButton("\uB85C\uADF8\uC778");
		loginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cardLayout.show(memberContentP, "login");
				MemberLoginDialog loginDialog = new MemberLoginDialog(
						CardLayoutFrame.this);
				loginDialog.setModal(true); // 한번 열면 다른 곳을 열 수 없음
				loginDialog.setFrame(CardLayoutFrame.this);
				loginDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				loginDialog.setVisible(true);
			}
		});
		buttonP.add(loginB);

		listB = new JButton("\uB9AC\uC2A4\uD2B8");
		listB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(memberContentP, "list");
			}
		});
		buttonP.add(listB);

		detailB = new JButton("\uC0C1\uC138\uBCF4\uAE30");
		detailB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(memberContentP, "detail");
			}
		});
		buttonP.add(detailB);

		updateB = new JButton("\uC218\uC815");
		updateB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(memberContentP, "update");
			}
		});
		buttonP.add(updateB);

		nextB = new JButton(">>");
		nextB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(memberContentP);
			}
		});
		buttonP.add(nextB);

		memberContentP = new JPanel();
		mainP.add(memberContentP, BorderLayout.CENTER);
		cardLayout = new CardLayout(0, 0);
		memberContentP.setLayout(cardLayout);

		memberJoinPanel = new MemberJoinPanel();
		memberJoinPanel.setFrame(this);
		memberContentP.add(memberJoinPanel, "join");

		memberLoginPanel = new MemberLoginPanel();
		memberLoginPanel.setFrame(this);
		memberContentP.add(memberLoginPanel, "login");

		memberListPanel = new MemberListPanel(this);
		memberContentP.add(memberListPanel, "list");

		memberDetailPanel = new MemberDetailPanel(this);
		memberContentP.add(memberDetailPanel, "detail");

		memberUpdatePanel = new MemberUpdatePanel(this);
		memberContentP.add(memberUpdatePanel, "update");
		/*
		 * memberContentP.add(comp, "join"); memberContentP.add(comp, "login");
		 * memberContentP.add(comp, "list"); memberContentP.add(comp, "detail");
		 * memberContentP.add(comp, "update");
		 */

		blankP = new JPanel();
		blankP.setBackground(Color.LIGHT_GRAY);
		memberContentP.add(blankP, "blank");

		cardLayout.show(memberContentP, "blank");
		buttonEnableDisable(0);

	}

	/*
	 * 패널교체메쏘드
	 */

	public void changePanel(String panelName) {
		cardLayout.show(memberContentP, panelName);
	}

	/*
	 * 버튼활성화 불활성화
	 */
	public void buttonEnableDisable(int state) {
		/*
		 * 0: logout 1: login
		 */
		if (state == 0) {
			loginB.setEnabled(true);
			prevB.setEnabled(false);
			nextB.setEnabled(false);
			listB.setEnabled(false);
			updateB.setEnabled(false);
			detailB.setEnabled(false);
			joinB.setEnabled(true);

		} else if (state == 1) {
			loginB.setEnabled(false);
			prevB.setEnabled(true);
			nextB.setEnabled(true);
			listB.setEnabled(true);
			updateB.setEnabled(true);
			detailB.setEnabled(true);
			joinB.setEnabled(false);
		}

	}

}
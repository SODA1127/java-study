package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorFrame extends JFrame {
   JLabel numberL;

   JPanel buttonP;

   JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
   JButton plusB, subB, mulB, divB, equalB;

   public CalculatorFrame() {
      setTitle("계산기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      /*
       * Container contentPane=this.getContentPane(); contentPane.setLayout();
       */
      /*
       * North
       */
      numberL = new JLabel("0", JLabel.RIGHT);
      numberL.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

      numberL.setBackground(Color.WHITE);
      numberL.setOpaque(true);

      numberL.setForeground(Color.DARK_GRAY);

      buttonP = new JPanel();
      buttonP.setLayout(new GridLayout(0, 4));

      b0 = new JButton("0");
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
      plusB = new JButton("＋");
      subB = new JButton("－");
      mulB = new JButton("×");
      divB = new JButton("÷");

      buttonP.add(b1);
      buttonP.add(b2);
      buttonP.add(b3);
      buttonP.add(plusB);

      buttonP.add(b4);
      buttonP.add(b5);
      buttonP.add(b6);
      buttonP.add(subB);

      buttonP.add(b7);
      buttonP.add(b8);
      buttonP.add(b9);
      buttonP.add(mulB);

      buttonP.add(b0);
      buttonP.add(new JButton());
      buttonP.add(new JButton());
      buttonP.add(divB);

      /*
       * South
       */

      equalB = new JButton("=");

      getContentPane().setLayout(new BorderLayout());
      getContentPane().add(numberL, BorderLayout.NORTH);
      getContentPane().add(equalB, BorderLayout.SOUTH);
      getContentPane().add(buttonP, BorderLayout.CENTER);

      setSize(200, 200);
      setVisible(true);
      /************* event ************/
      CalculatorButtonHandler cbh = new CalculatorButtonHandler();

      b0.addActionListener(cbh);
      b1.addActionListener(cbh);
      b2.addActionListener(cbh);
      b3.addActionListener(cbh);
      b4.addActionListener(cbh);
      b5.addActionListener(cbh);
      b6.addActionListener(cbh);
      b7.addActionListener(cbh);
      b8.addActionListener(cbh);
      b9.addActionListener(cbh);
      plusB.addActionListener(cbh);
      subB.addActionListener(cbh);
      mulB.addActionListener(cbh);
      divB.addActionListener(cbh);
      equalB.addActionListener(cbh);

   }

   String displayNo = "";
   int tempNo = 0;
   public class CalculatorButtonHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         String command = e.getActionCommand();
         
         String pressNo = "";
         
         if (command.equals("0")) {
            pressNo="0";
         } else if (command.equals("1")) {
            pressNo="1";
         } else if (command.equals("2")) {
            pressNo="2";
         } else if (command.equals("3")) {
            pressNo="3";
         } else if (command.equals("4")) {
            pressNo="4";
         } else if (command.equals("5")) {
            pressNo="5";
         } else if (command.equals("6")) {
            pressNo="6";
         } else if (command.equals("7")) {
            pressNo="7";
         } else if (command.equals("8")) {
            pressNo="8";
         } else if (command.equals("9")) {
            pressNo="9";
         } else if (command.equals("0")) {
            pressNo="0";
         } else if (command.equals("+")){
        	 tempNo = Integer.parseInt(displayNo);
        	 displayNo = "0";
        	 
        	 
         } else if (command.equals("-")){
         } else if (command.equals("×")){
         } else if (command.equals("÷")){
         } else if (command.equals("=")) {
            
         } 
         
         displayNo += pressNo;
         numberL.setText(displayNo);
         
      }
   }

   public static void main(String[] args) {
      new CalculatorFrame();

   }

}
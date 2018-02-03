package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
/*
Event program방법

  1. Event Source 선정(Button)(Event의 종류--> ActionEvent)
  2. Event Handler 작성(클래스)
     -->ActionEvent를 처리할수있는 Handler클래스작성
        
        2-1.ActionListener interface를 implement
          2-2.ActionListener 추상메쏘드 구현..
      
  3. Event Source객체 와 Event Handler객체를 연결해준다.
        eventSourceRef.addActionListener(eventHandlerRef);
*/
public class ActionEventJFrame extends JFrame {
   private JPanel contentPane;
   private JButton button;
   /**
    * Create the frame.
    */
   public ActionEventJFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      button = new JButton("ActionEvent");
      contentPane.add(button, BorderLayout.SOUTH);
      setVisible(true);
      
      /********event처리************/
      //ButtonHandler bh=new ButtonHandler(this);
      
      InnerButtonHandler bh = new InnerButtonHandler();
      
      button.addActionListener(bh);
   }
   
   public class InnerButtonHandler implements ActionListener{
      int count;
      ActionEventJFrame frame;
      public InnerButtonHandler() {
         // TODO Auto-generated constructor stub
      }
      public InnerButtonHandler(ActionEventJFrame frame) {
         this.frame=frame;
      }
      @Override
      public void actionPerformed(ActionEvent e) {
         System.out.println("ActionEvent");
         System.out.println("이벤트실행:"+Thread.currentThread().getName());
         Object eventSource = e.getSource();
         System.out.println("이벤트객체:"+eventSource);
         /*
          * ActionEventJFrame(Outer class) title,color변경
          */
         //ActionEventJFrame.this.setTitle("button click"+ ++count);
         setTitle("button click "+ ++count);
         
         int r=(int)(Math.random()*256);
         int g=(int)(Math.random()*256);
         int b=(int)(Math.random()*256);
         
         Color bgColor=new Color(r, g, b);
         
         frame.getContentPane().setBackground(bgColor);
         
      }

   }
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
       new ActionEventJFrame();
       return;
   }
}
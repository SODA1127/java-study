package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ChattingFrame extends Frame {
   
   Label chatL;
   TextArea chatTA;
   List chatLIST;
   
   Panel southP;
   TextField chatTF;
   Button sendB;
   
   public ChattingFrame() {
      chatL=new Label("#### XX 채팅 ####",Label.CENTER);
      
      chatTA=new TextArea("성연: 뭐하니!!!!\n경호:걍있어\n");
      chatTA.setEditable(false);
      chatLIST=new List();
      
      chatLIST.add("김은희");
      chatLIST.add("신명숙");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      chatLIST.add("정봉화");
      
      southP=new Panel();
      southP.setLayout(new FlowLayout());
      chatTF=new TextField(42);
      sendB=new Button("전송");
      southP.add(chatTF);
      southP.add(sendB);
      
      setLayout(new BorderLayout());
      
      add(chatL,BorderLayout.NORTH);
      add(chatTA,BorderLayout.CENTER);
      add(southP,BorderLayout.SOUTH);
      add(chatLIST,BorderLayout.WEST);
      
      setSize(400, 500);
      setVisible(true);
      
      /**************** event ********************/
      SendHandler sh = new SendHandler();
      sendB.addActionListener(sh);
      chatTF.addActionListener(sh);
   }
   
   public class SendHandler implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {

         String chatStr = chatTF.getText();
         
         if(chatStr == null || chatStr.trim().equals("")) {
            /*
             * Thread 대기
             */
            JOptionPane.showMessageDialog(null, "공백전송안됨");
            
            chatTA.setText("");
            chatTF.requestFocus();
            return;
         }
         
         chatTA.append("경호 : "+chatStr +"\n");
         chatTF.setText("");
         
         chatTF.requestFocus();
      }
   }
   
   public static void main(String[] args) {
      new ChattingFrame();

   }

}
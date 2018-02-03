package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener{
   int count;
   ActionEventJFrame frame;
   public ButtonHandler() {
      // TODO Auto-generated constructor stub
   }
   public ButtonHandler(ActionEventJFrame frame) {
      this.frame=frame;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("ActionEvent");
      System.out.println("이벤트실행:"+Thread.currentThread().getName());
      Object eventSource = e.getSource();
      System.out.println("이벤트객체:"+eventSource);
      /*
       * JFrame title,color변경
       */
      frame.setTitle("button click"+ ++count);
      
      int r=(int)(Math.random()*256);
      int g=(int)(Math.random()*256);
      int b=(int)(Math.random()*256);
      
      Color bgColor=new Color(r, g, b);
      
      frame.getContentPane().setBackground(bgColor);
      
      
      
   }

}
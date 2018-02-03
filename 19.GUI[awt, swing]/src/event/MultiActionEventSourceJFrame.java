package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class MultiActionEventSourceJFrame extends JFrame {

   private JPanel contentPane;
   private JButton redB;
   private JButton greenB;
   private JButton blueB;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MultiActionEventSourceJFrame frame = new MultiActionEventSourceJFrame();
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
   public MultiActionEventSourceJFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      JPanel buttonP = new JPanel();
      buttonP.setBackground(Color.MAGENTA);
      contentPane.add(buttonP, BorderLayout.SOUTH);
      
      redB = new JButton("RED");
      buttonP.add(redB);
      
      greenB = new JButton("GREEN");
      buttonP.add(greenB);
      
      blueB = new JButton("BLUE");
      buttonP.add(blueB);
      
      /********** event **********/
      ButtonColorChangeHandler ccbh = new ButtonColorChangeHandler();
      redB.addActionListener(ccbh);
      greenB.addActionListener(ccbh);
      blueB.addActionListener(ccbh);      
      
   }
   /*******************************************/
   public class ButtonColorChangeHandler implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {
         Object eventSource = e.getSource();
         
         if(eventSource == redB) {
            getContentPane().setBackground(Color.RED);
         }else if(eventSource == blueB) {
            getContentPane().setBackground(Color.BLUE);            
         }else if(eventSource == greenB) {
            getContentPane().setBackground(Color.GREEN);
         }
         
         String command = e.getActionCommand();
         if(command.equals("RED")) {
            setTitle("RED");
         }else if(command.equals("GREEN")) {
            setTitle("GREEN");            
         }else if(command.equals("BLUE")) {
            setTitle("BLUE");
         }
         
      }
   }
   /*******************************************/
   

}
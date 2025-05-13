import javax.swing.*;
import java.awt.event.*;
public class Fxx extends JFrame implements ActionListener{
 private JTextField t1;
 private JTextArea a1;
 private JScrollPane s1;
 private JButton b1;
 private JButton b2;

 String tx = "";

 public Fxx(){
   setLayout(null);
   b1 = new JButton("Agregar");
   b1.setBounds(250,10,100,30);
   add(b1);
   b1.addActionListener(this);

   b2 = new JButton("Cerrar");
   b2.setBounds(10,500,100,30);
   add(b2);
   b2.addActionListener(this); 

   t1 = new JTextField();
   t1.setBounds(10,10,200,30);
   add(t1);
  
   a1 = new JTextArea();
   s1 = new JScrollPane(a1);
   s1.setBounds(10,60,400,400);
   add(s1);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
  tx += t1.getText() + "\n";
  a1.setText(tx);
  t1.setText("");
  }
 if(e.getSource() == b2){
   System.exit(0);
  }
 }
 public static void main(String args[]){
 Fxx fxx1 = new Fxx();
 fxx1.setBounds(0,0,550,650);
 fxx1.setVisible(true);
 fxx1.setResizable(false);
 fxx1.setLocationRelativeTo(null);
 }
} 
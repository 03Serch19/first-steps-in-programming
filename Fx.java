import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Fx extends JFrame implements ActionListener{
 private JTextField t1;
 private JTextArea a1;
 private JButton b1, b2;
 public Fx(){
  setLayout(null);
  t1 = new JTextField();
  t1.setBounds(20,20,200,30);
  add(t1);
  a1 = new JTextArea();
  a1.setBounds(20,60,300,400);
  add(a1);
  b1 = new JButton("Cerrar");
  b1.setBounds(20,500,100,30);
  add(b1);
  b1.addActionListener(this);
 
  b2 = new JButton("Color");
  b2.setBounds(130,500,100,30);
  add(b2);
  b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
   System.exit(0);
  }
  if(e.getSource() == b2){
   Color cl1 = new Color(200,69,23);
   b2.setBackground(cl1);
  }
 }
 public static void main(String args[]){
  Fx fx1 = new Fx();
  fx1.setBounds(0,0,450,600);
  fx1.setVisible(true);
  fx1.setResizable(false);
  fx1.setLocationRelativeTo(null);
 }
}
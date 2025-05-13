import javax.swing.*;
import java.awt.event.*;
public class Fo extends JFrame implements ActionListener{
 private JButton b1, b2, b3, s;
 private JLabel l1;
 public Fo(){
  setLayout(null);
  b1 = new JButton("1");
  b1.setBounds(50,250,100,40);
  add(b1);
  b1.addActionListener(this);
  b2 = new JButton("2");
  b2.setBounds(250,250,100,40);
  add(b2);
  b2.addActionListener(this);
  b3 = new JButton("3");
  b3.setBounds(430,250,100,40);
  add(b3);
  b3.addActionListener(this);
  s = new JButton("Cerrar");
  s.setBounds(250,400,100,40);
  add(s);
  s.addActionListener(this);
  l1 = new JLabel("En espera...");
  l1.setBounds(50,20,200,40);
  add(l1);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
   l1.setText("Has presionado el boton 1");
  }
  if(e.getSource() == b2){
   l1.setText("Has presionado el boton 2");
  }
  if(e.getSource() == b3){
   l1.setText("Has presionado el boton 3");
  }
  if(e.getSource() == s){
  System.exit(0);
  }
 }
 public static void main(String args[]){
  Fo fo1 = new Fo();
  fo1.setBounds(0,0,600,500);
  fo1.setVisible(true);
  fo1.setLocationRelativeTo(null);
  fo1.setResizable(false);
 }
}
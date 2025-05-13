import javax.swing.*;
import java.awt.event.*;
public class Fxs extends JFrame implements ActionListener{
private JTextField t1;
private JScrollPane s1;
private JTextArea a1;
private JButton b1;
public Fxs(){
  setLayout(null);
  t1 = new JTextField();
  t1.setBounds(10,30,200,30);
  add(t1);
  a1 = new JTextArea();
  s1 = new JScrollPane(a1);
  s1.setBounds(10,90,400,400);
  add(s1);
  b1 = new JButton("Cerrar");
  b1.setBounds(10,550,150,30);
  add(b1);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
   System.exit(0);
  }
 }
 public static void main(String args[]){
  Fxs fxs1 = new Fxs();
  fxs1.setBounds(0,0,500,650);
  fxs1.setVisible(true);
  fxs1.setResizable(false);
  fxs1.setLocationRelativeTo(null);
 }

}
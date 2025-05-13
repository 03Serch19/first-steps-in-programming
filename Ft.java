import javax.swing.*;
import java.awt.event.*;
public class Ft extends JFrame implements ActionListener{
 private JLabel l1;
 private JTextField t1;
 private JButton b1, b2;
 public Ft(){
  setLayout(null);
  l1 = new JLabel("Usuario: ");
  l1.setBounds(60,60,100,30);
  add(l1);
  t1 = new JTextField();
  t1.setBounds(270,60,150,30);
  add(t1);
  b1 = new JButton("Aceptar");
  b1.setBounds(60,250,100,30);
  add(b1);
  b1.addActionListener(this);
  b2 = new JButton("Cerrar");
  b2.setBounds(270,250,100,30);
  add(b2);
  b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){

 if(e.getSource() == b1){
   String tx = t1.getText();
   setTitle(tx);
  }
 if(e.getSource() == b2){
   System.exit(0);
  }
 }
 public static void main(String args[]){
 Ft ft1 = new Ft();
 ft1.setBounds(0,0,500,400);
 ft1.setVisible(true);
 ft1.setResizable(false);
 ft1.setLocationRelativeTo(null);
 }
}
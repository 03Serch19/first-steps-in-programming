import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Cll extends JFrame implements ActionListener{
 private JLabel l1, l2, l3;
 private JComboBox cb1, cb2, cb3;
 private JButton b1, b2;
 public Cll(){
  setLayout(null);
  l1 = new JLabel("Rojo");
  l1.setBounds(20,20,75,30);
  add(l1);
  l2 = new JLabel("Verde");
  l2.setBounds(20,60,75,30);
  add(l2);
  l3 = new JLabel("Azul");
  l3.setBounds(20,100,75,30);
  add(l2);
  cb1 = new JComboBox();
  cb1.setBounds(100,20,50,30);
  for(int i = 0; i <= 255; i++){
   cb1.addItem(String.valueOf(i));
  }
  add(cb1);
  cb2 = new JComboBox();
  cb2.setBounds(100,60,50,30);
  for(int i = 0; i <= 255; i++){
   cb2.addItem(String.valueOf(i));
  }
  add(cb2);
  cb3 = new JComboBox();
  cb3.setBounds(100,100,50,30);
  for(int i = 0; i <= 255; i++){
   cb3.addItem(String.valueOf(i));
  }
  add(cb3);
  b1 = new JButton("Aplicar");
  b1.setBounds(20,140,75,30);
  add(b1);
  b1.addActionListener(this);
  b2 = new JButton("Cerrar");
  b2.setBounds(100,140,75,30);
  add(b2);
  b2.addActionListener(this);
 }
  public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
   String tc1 = cb1.getSelectedItem().toString();
   String tc2 = cb2.getSelectedItem().toString();
   String tc3 = cb3.getSelectedItem().toString();
   int r = Integer.parseInt(tc1);
   int g = Integer.parseInt(tc2);
   int b = Integer.parseInt(tc3);

   Color color1 = new Color(r,g,b);
   b1.setBackground(color1);
  }
  if(e.getSource() == b2){
   System.exit(0);
   }
 }

 public static void main(String args[]){
 Cll cll1 = new Cll();
 cll1.setBounds(0,0,200,250);
 cll1.setResizable(false);
 cll1.setVisible(true);
 cll1.setLocationRelativeTo(null);
 }

}
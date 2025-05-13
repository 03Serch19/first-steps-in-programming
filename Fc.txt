import javax.swing.*;
import java.awt.event.*;
public class Fc extends JFrame implements ItemListener,ActionListener{
 private JComboBox c1;
 private JButton b1;
 public Fc(){
  setLayout(null);
  c1 = new JComboBox();
  c1.setBounds(10,10,100,30);
  add(c1);
  c1.addItem("Rojo");
  c1.addItem("Verde");
  c1.addItem("Amarillo");
  c1.addItem("Azul");
  c1.addItem("Negro");
  c1.addItem("Blanco");
  c1.addItemListener(this);
  
  b1 = new JButton("Cerrar");
  b1.setBounds(140,10,80,30);
  add(b1);
  b1.addActionListener(this);
 }
 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == c1){
   String st = c1.getSelectedItem().toString();
   setTitle(st);
   }
  }
 public void actionPerformed(ActionEvent ev){
  if(ev.getSource() == b1){
   System.exit(0);
   }
  }
 public static void main(String args[]){
  Fc fc1 = new Fc();
  fc1.setBounds(0,0,250,150);
  fc1.setVisible(true);
  fc1.setResizable(true);
  fc1.setLocationRelativeTo(null);
 }
}
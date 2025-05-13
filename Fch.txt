import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Fch extends JFrame implements ChangeListener,ActionListener{
 private JCheckBox ch1, ch2, ch3;
 private JButton b1;
 public Fch(){
  setLayout(null);
  ch1 = new JCheckBox("Ingles");
  ch1.setBounds(10,10,150,30);
  ch1.addChangeListener(this);
  add(ch1);
  ch2 = new JCheckBox("Frances");
  ch2.setBounds(10,50,150,30);
  ch2.addChangeListener(this);
  add(ch2);
  ch3 = new JCheckBox("Aleman");
  ch3.setBounds(10,90,150,30);
  ch3.addChangeListener(this);
  add(ch3);
  b1 = new JButton("Cerrar");
  b1.setBounds(170,50,90,30);
  b1.addActionListener(this);
  add(b1);
 }
 public void stateChanged(ChangeEvent e){
  String ca = "";
  if(ch1.isSelected() == true){
   ca = ca + "Ingles ";
  }
  if(ch2.isSelected() == true){
   ca = ca + "Frances ";
  }
  if(ch3.isSelected() == true){
   ca = ca + "Aleman ";
  }
   setTitle(ca);
 }
 public void actionPerformed(ActionEvent ee){
  if(ee.getSource() == b1){
   System.exit(0);
  }
 }
  public static void main(String args[]){

  Fch fch1 = new Fch();
  fch1.setBounds(0,0,300,200);
  fch1.setVisible(true);
  fch1.setResizable(false);
  fch1.setLocationRelativeTo(null);
 }



} 
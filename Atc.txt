import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Atc extends JFrame implements ActionListener,ChangeListener{
 private JCheckBox ch1;
 private JButton b1;
 private JLabel l1;

 public Atc(){
    setLayout(null);
   l1 = new JLabel("Aceptar terminos y condiciones");
   l1.setBounds(10,10,250,30);
   add(l1);
   ch1 = new JCheckBox("Acepto");
   ch1.setBounds(10,50,150,30);
   ch1.addChangeListener(this);
   add(ch1);
   b1 = new JButton("Continuar");
   b1.setBounds(10,100,90,30);
   b1.addActionListener(this);
   add(b1);
   b1.setEnabled(false);
 }
 public void stateChanged(ChangeEvent e){
  if(ch1.isSelected() == true){
   b1.setEnabled(true);
  } else{
   b1.setEnabled(false); 
  }
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
    System.exit(0);
  }
 }
 public static void main(String args[]){
  Atc atc1 = new Atc();
  atc1.setBounds(0,0,300,200);
  atc1.setVisible(true);
  atc1.setResizable(false);
  atc1.setLocationRelativeTo(null);
 }
}

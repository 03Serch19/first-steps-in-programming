import javax.swing.*;
import java.awt.event.*;

public class Fmo extends JFrame implements ActionListener{
  JButton jb1;
  public Fmo(){
  setLayout(null);
  jb1 = new JButton("Cerrar");
  jb1.setBounds(400,500,100,20);
   add(jb1);
   jb1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == jb1){
    
   System.exit(0);

  }
 }
 public static void main(String args[]){
  Fmo fmo1 = new Fmo();
  fmo1.setBounds(0,0,600,700);
  fmo1.setLocationRelativeTo(null);
  fmo1.setResizable(false);
  fmo1.setVisible(true);
 }
}
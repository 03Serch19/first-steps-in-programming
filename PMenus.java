import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class PMenus extends JFrame implements ActionListener{
 private JMenuBar mb;
 private JMenu mn1;
 private JMenuItem mi1, mi2, mi3, mi4;
 public PMenus(){
  setLayout(null);
  mb = new JMenuBar();
  setJMenuBar(mb);
 
  mn1 = new JMenu("Opciones");
  mb.add(mn1);
  
  mi1 = new JMenuItem("Rojo");
  mi1.addActionListener(this);
  mn1.add(mi1);
  mi2 = new JMenuItem("Verde");
  mi2.addActionListener(this);
  mn1.add(mi2);
  mi3 = new JMenuItem("Azul");
  mi3.addActionListener(this);
  mn1.add(mi3);
  mi4 = new JMenuItem("Cerrar");
  mi4.addActionListener(this);
  mn1.add(mi4);
 }
 public void actionPerformed(ActionEvent e){
  Container Fn = this.getContentPane();
   if(e.getSource() == mi1){
   Fn.setBackground(new Color(255,0,0));
  }
   if(e.getSource() == mi2){
   Fn.setBackground(new Color(0,255,0));
  }
   if(e.getSource() == mi3){
   Fn.setBackground(new Color(0,0,255));
  }
   if(e.getSource() == mi4){
   System.exit(0);
  }
 }
 public static void main(String args[]){
  PMenus pmenus1 = new PMenus();
  pmenus1.setBounds(0,0,300,400);
  pmenus1.setVisible(true);
  pmenus1.setLocationRelativeTo(null);
 }
}
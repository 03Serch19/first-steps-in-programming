import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Smenu extends JFrame implements ActionListener{

 private JMenuBar m;
 private JMenu mn1, mn2, mn3;
 private JMenuItem it1, it2, it3, it4, it5;

 public Smenu(){
  setLayout(null);

  m = new JMenuBar();
  setJMenuBar(m);

  mn1 = new JMenu("Opciones");
  m.add(mn1);

  mn2 = new JMenu("Cambiar tamaño");
  mn1.add(mn2);

  mn3 = new JMenu("Color de fondo");
  mn1.add(mn3);

  it1 = new JMenuItem("300x200");
  mn2.add(it1);
  it1.addActionListener(this);

  it2 = new JMenuItem("640x480");
  mn2.add(it2);
  it2.addActionListener(this);
  
  it3 = new JMenuItem("Rojo");
  mn3.add(it3);
  it3.addActionListener(this);

  it4 = new JMenuItem("Azul");
  mn3.add(it4);
  it4.addActionListener(this);

  it5 = new JMenuItem("Cerrar");
  mn1.add(it5);
  it5.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == it1){
  setSize(300,200);
  }
  if(e.getSource() == it2){
  setSize(640,480);
  }
  if(e.getSource() == it3){
   getContentPane().setBackground(new Color(200,0,0));
  }
  if(e.getSource() == it4){
   getContentPane().setBackground(new Color(0,0,200));
  }
  if(e.getSource() == it5){
   System.exit(0);
  }
 }
 public static void main(String args[]){
  Smenu smenu1 = new Smenu();
  smenu1.setBounds(0,0,300,200);
  smenu1.setVisible(true);
  smenu1.setResizable(true);
  smenu1.setLocationRelativeTo(null);
 }
}
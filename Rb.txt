import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Rb extends JFrame implements ChangeListener{
  private JRadioButton r1, r2, r3, r4;
  private ButtonGroup bg;
  public Rb(){
  setLayout(null);
  bg = new ButtonGroup();
  r1 = new JRadioButton("640*480");
  r1.setBounds(10,10,90,30);
  r1.addChangeListener(this);
  add(r1);
  bg.add(r1);
  r2 = new JRadioButton("800*600");
  r2.setBounds(10,50,90,30);
  r2.addChangeListener(this);
  add(r2);
  bg.add(r2);
  r3 = new JRadioButton("1024*768");
  r3.setBounds(10,90,90,30);
  r3.addChangeListener(this);
  add(r3);
  bg.add(r3);
  r4 = new JRadioButton("Cerrar");
  r4.setBounds(10,130,90,30);
  r4.addChangeListener(this);
  add(r4);
  bg.add(r4);
 }
  public void stateChanged(ChangeEvent e){
  if(r1.isSelected()){
   setSize(640,480);
  }
  if(r2.isSelected()){
   setSize(800,600);
  }
  if(r3.isSelected()){
   setSize(1024,768);
  }
  if(r4.isSelected()){
   System.exit(0);
  }
 }
 public static void main(String args[]){
  Rb rb1 = new Rb();
  rb1.setBounds(0,0,150,200);
  rb1.setVisible(true);
  rb1.setResizable(false);
  
 }



}
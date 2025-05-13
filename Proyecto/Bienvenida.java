import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Bienvenida extends JFrame implements ActionListener{
 private JLabel l1, l2, l3, l4;
 private JButton b1;
 private JTextField tf1;
 public static String nameuser = "";
 public Bienvenida(){

 setLayout(null);
 setTitle("Bienvenido");
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 getContentPane().setBackground(new Color(255,0,0));
 setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

 ImageIcon ima = new ImageIcon("images/logo-coca.png");
 l1 = new JLabel(ima);
 l1.setBounds(20,20,300,150);
 add(l1);
 
 l2 = new JLabel("Sistema de Control Vacacional");
 l2.setBounds(25,140,300,30);
 l2.setFont(new Font("Andale Mono", 3, 18));
 l2.setForeground(new Color(255,255,255));
 add(l2);
 l3 = new JLabel("Ingrese su nombre:");
 l3.setBounds(25,200,200,30);
 l3.setFont(new Font("Andale Mono", 1, 12));
 l3.setForeground(new Color(255,255,255));
 add(l3);
 l4 = new JLabel("©2021 The Coca-Cola Company");
 l4.setBounds(75,385,200,30);
 l4.setFont(new Font("Andale Mono", 1, 12));
 l4.setForeground(new Color(255,255,255));
 add(l4);
 tf1 = new JTextField();
 tf1.setBounds(20,230,300,30);
 tf1.setBackground(new Color(224,224,224));
 tf1.setFont(new Font("Andale Mono", 1, 14));
 tf1.setForeground(new Color(255,0,0));
 add(tf1);
 b1 = new JButton("Ingresar");
 b1.setBounds(125,275,100,30);
 b1.setBackground(new Color(255,255,255));
 b1.setFont(new Font("Andale Mono", 1, 14));
 b1.setForeground(new Color(255,0,0));
 b1.addActionListener(this);
 add(b1);
 } 
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == b1){
   nameuser = tf1.getText().trim();
  if(nameuser.equals("")){
   JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
   } else{
  Licencia vlicencia = new Licencia();
  vlicencia.setBounds(0,0,600,360);
  vlicencia.setResizable(false);
  vlicencia.setVisible(true);
  vlicencia.setLocationRelativeTo(null);
  this.setVisible(false);
   }
  }
 }
 public static void main(String args[]){
  Bienvenida vbienvenida = new Bienvenida();
  vbienvenida.setBounds(0,0,350,450);
  vbienvenida.setVisible(true);
  vbienvenida.setResizable(false);
  vbienvenida.setLocationRelativeTo(null);
 }
}
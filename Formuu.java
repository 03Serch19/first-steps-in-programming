import javax.swing.*;
public class Formuu extends JFrame{
 private JLabel l1;
 private JLabel l2;
 public Formuu(){
 setLayout(null);
 l1 = new JLabel("Interfaz grafica. ");
 l1.setBounds(20,30,100,30);
 add(l1);
 l2 = new JLabel("Version SSSS. ");
 l2.setBounds(20,120,100,30);
 add(l2);
 }
 public static void main(String args[]){
 Formuu formuu1 = new Formuu();
 formuu1.setBounds(0,0,400,400);
 formuu1.setVisible(true);
 formuu1.setLocationRelativeTo(null);
 formuu1.setResizable(false);


}
}
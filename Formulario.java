import javax.swing.*;
public class Formulario extends JFrame{ 
  private JLabel label1;
   public Formulario(){
   setLayout(null);
   label1 = new JLabel("Sergio en una interfaz.");
   label1.setBounds(10,20,200,300);
   add(label1);
 }
 public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(300,80,400,300);
   formulario1.setVisible(true);
   
 }

}
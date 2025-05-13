import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Licencia extends JFrame implements ChangeListener, ActionListener{
 private JLabel l1, l2;
 private JCheckBox ch1;
 private JButton b1, b2;
 private JTextArea t1;
 private JScrollPane sp1;
 String nomuser;
 public Licencia(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Licencia de uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Bienvenida vbienvenida = new Bienvenida();
  nomuser = vbienvenida.nameuser;
  l1 = new JLabel("TERMINOS Y CONDICIONES");
  l1.setBounds(210,10,200,35);
  l1.setFont(new Font("Andale Mono", 1, 14));
  l1.setForeground(new Color(0,0,0));
  add(l1);
  t1 = new JTextArea("\n\n          TÉRMINOS Y CONDICIONES"+
"\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA ANDROSERGNN."+
"\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."+
"\n            C.  ANDROSERGNN NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+

"\n\n           LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
"\n           (ANDROSERGNN Y EL AUTOR SERGIO ALEX.F), NO SE RESPONSABILIZAN DEL USO QUE USTED"+
"\n           HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"+
"\n           SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+

"\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"+
"\n          http://www.youtube.com/ssssslllppzzz");
  t1.setFont(new Font("Andale Mono", 0, 9));
  t1.setForeground(new Color(0,0,0));
  t1.setEditable(false);
  sp1 = new JScrollPane(t1);
  sp1.setBounds(10,40,565,200);
  add(sp1);
  ch1 = new JCheckBox("Yo " + nomuser + " acepto");
  ch1.setBounds(10,250,200,30);
  ch1.addChangeListener(this);
  add(ch1);
  b1 = new JButton("Continuar");
  b1.setBounds(10,280,100,30);
  b1.addActionListener(this);
  b1.setEnabled(false);
  add(b1);
  b2 = new JButton("No Acepto");
  b2.setBounds(120,280,100,30);
  b2.addActionListener(this);
  b2.setEnabled(true);
  add(b2);
  ImageIcon imag = new ImageIcon("images/coca-cola.png");
  l2 = new JLabel(imag);
  l2.setBounds(310,205,300,150);
  add(l2);
  }
  public void stateChanged(ChangeEvent e){
  if(ch1.isSelected() == true){
  b1.setEnabled(true);
  b2.setEnabled(false);  
  } else {
  b1.setEnabled(false);
  b2.setEnabled(true);
  }
  }
  public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
   Principal vprincipal = new Principal();
   vprincipal.setBounds(0,0,635,530);
   vprincipal.setVisible(true);
   vprincipal.setResizable(false);
   vprincipal.setLocationRelativeTo(null);
   this.setVisible(false);
  } else if(e.getSource() == b2){
   Bienvenida vbienvenida = new Bienvenida();
   vbienvenida.setBounds(0,0,350,450);
   vbienvenida.setVisible(true);
   vbienvenida.setResizable(false);
   vbienvenida.setLocationRelativeTo(null);
   this.setVisible(false);
  }
  }
 public static void main(String args[]){
  Licencia vlicencia = new Licencia();
  vlicencia.setBounds(0,0,600,360);
  vlicencia.setResizable(false);
  vlicencia.setVisible(true);
  vlicencia.setLocationRelativeTo(null);
 }
}
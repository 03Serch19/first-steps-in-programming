import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame implements ActionListener{
 private JMenuBar mb;
 private JMenu op, cal, acerde, codefo;
 private JMenuItem ro, ne, mo, nue, sal, vac, acrea;
 private JLabel im, biser, dadtrpcalva, nm, app, apm, sedep, seant, recal, foote;
 private JTextField tnm, tapp, tapm;
 private JScrollPane sp;
 private JTextArea tarc;
 private JComboBox cdep, cant;
 String nomadi;
 public Principal(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Pantalla principal");
  getContentPane().setBackground(new Color(255,0,0));
  Bienvenida vbienvenida = new Bienvenida();
  nomadi = vbienvenida.nameuser;
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  mb = new JMenuBar();
  mb.setBackground(new Color(255,0,0));
  setJMenuBar(mb);
  op = new JMenu("Opciones");
  op.setFont(new Font("Andale Mono", 1, 14));
  op.setForeground(new Color(255,255,255));
  mb.add(op);
  codefo = new JMenu("Color de fondo");
  codefo.setFont(new Font("Andale Mono", 1, 14));
  codefo.setForeground(new Color(255,0,0));
  op.add(codefo);
  ro = new JMenuItem("Rojo");
  ro.setFont(new Font("Andale Mono", 1, 14));
  ro.setForeground(new Color(255,0,0));
  codefo.add(ro);
  ro.addActionListener(this);
  ne = new JMenuItem("Negro");
  ne.setFont(new Font("Andale Mono", 1, 14));
  ne.setForeground(new Color(255,0,0));
  codefo.add(ne);
  ne.addActionListener(this);
  mo = new JMenuItem("Morado");
  mo.setFont(new Font("Andale Mono", 1, 14));
  mo.setForeground(new Color(255,0,0));
  codefo.add(mo);
  mo.addActionListener(this);
  nue = new JMenuItem("Nuevo");
  nue.setFont(new Font("Andale Mono", 1, 14));
  nue.setForeground(new Color(255,0,0));
  op.add(nue);
  nue.addActionListener(this);
  sal = new JMenuItem("Salir");
  sal.setFont(new Font("Andale Mono", 1, 14));
  sal.setForeground(new Color(255,0,0));
  op.add(sal);
  sal.addActionListener(this);
  cal = new JMenu("Calcular");
  cal.setFont(new Font("Andale Mono", 1, 14));
  cal.setForeground(new Color(255,255,255));
  mb.add(cal);
  vac = new JMenuItem("Vacaciones");
  vac.setFont(new Font("Andale Mono", 1, 14));
  vac.setForeground(new Color(255,0,0));
  cal.add(vac);
  vac.addActionListener(this);
  acerde = new JMenu("Acerca de");
  acerde.setFont(new Font("Andale Mono", 1, 14));
  acerde.setForeground(new Color(255,255,255));
  mb.add(acerde);
  acrea = new JMenuItem("El creador");
  acrea.setFont(new Font("Andale Mono", 1, 14));
  acrea.setForeground(new Color(255,0,0));
  acerde.add(acrea);
  acrea.addActionListener(this);
  ImageIcon ii = new ImageIcon("images/logo-coca.png");
  im = new JLabel(ii);
  im.setBounds(10,10,250,100);
  add(im);
  biser = new JLabel("Bienvenido " + nomadi);
  biser.setBounds(280,40,300,50);
  biser.setFont(new Font("Andale Mono", 1, 30));
  biser.setForeground(new Color(255,255,255));
  add(biser);
  dadtrpcalva = new JLabel("Datos del trabajador para el cálculo de vacaciones");
  dadtrpcalva.setBounds(40,130,550,40);
  dadtrpcalva.setFont(new Font("Andale Mono", 0, 24));
  dadtrpcalva.setForeground(new Color(255,255,255));
  add(dadtrpcalva);
  nm = new JLabel("Nombre completo:");
  nm.setBounds(20,180,120,30);
  nm.setFont(new Font("Andale Mono", 1, 12));
  nm.setForeground(new Color(255,255,255));
  add(nm);
  tnm = new JTextField();
  tnm.setBounds(20,210,150,25);
  tnm.setBackground(new Color(224,224,224));
  tnm.setFont(new Font("Andale Mono", 1, 14));
  tnm.setForeground(new Color(255,0,0));
  add(tnm);
  app = new JLabel("Apellido Paterno:");
  app.setBounds(20,240,100,30);
  app.setFont(new Font("Andale Mono", 1, 12));
  app.setForeground(new Color(255,255,255));
  add(app);
  tapp = new JTextField();
  tapp.setBounds(20,270,150,25);
  tapp.setBackground(new Color(224,224,224));
  tapp.setFont(new Font("Andale Mono", 1, 14));
  tapp.setForeground(new Color(255,0,0));
  add(tapp);
  apm = new JLabel("Apellido Materno:");
  apm.setBounds(20,300,100,30);
  apm.setFont(new Font("Andale Mono", 1, 12));
  apm.setForeground(new Color(255,255,255));
  add(apm);
  tapm = new JTextField();
  tapm.setBounds(20,330,150,25);
  tapm.setBackground(new Color(224,224,224));
  tapm.setFont(new Font("Andale Mono", 1, 14));
  tapm.setForeground(new Color(255,0,0));
  add(tapm);
  sedep = new JLabel("Selecciona el departamento:");
  sedep.setBounds(215,180,200,30);
  sedep.setFont(new Font("Andale Mono", 1, 12));
  sedep.setForeground(new Color(255,255,255));
  add(sedep);
  cdep = new JComboBox();
  cdep.setBounds(215,210,230,25);
  cdep.setBackground(new Color(224,224,224));
  cdep.setFont(new Font("Andale Mono", 1, 14));
  cdep.setForeground(new Color(255,0,0));
  add(cdep);
  cdep.addItem("");
  cdep.addItem("Atención al Cliente");
  cdep.addItem("Departamento de Logística");
  cdep.addItem("Departamento de Gerencia");
  seant = new JLabel("Selecciona la antiguedad");
  seant.setBounds(215,240,200,30);
  seant.setFont(new Font("Andale Mono", 1, 12));
  seant.setForeground(new Color(255,255,255));
  add(seant);
  cant = new JComboBox();
  cant.setBounds(215,270,230,25);
  cant.setFont(new Font("Andale Mono", 1, 14));
  cant.setForeground(new Color(255,0,0));
  add(cant);
  cant.addItem("");
  cant.addItem("1 año de servicio");
  cant.addItem("2 a 6 años de servicio");
  cant.addItem("7 años o más de servicio");
  recal = new JLabel("Resultado de Cálculo");
  recal.setBounds(215,300,120,30);
  recal.setFont(new Font("Andale Mono", 1, 12));
  recal.setForeground(new Color(255,255,255));
  add(recal);
  tarc = new JTextArea();
  tarc.setFont(new Font("Andale Mono", 1, 12));
  tarc.setForeground(new Color(255,0,0));
  tarc.setText("\n          Aqui aparece el calculo de las vacaciones.");
  tarc.setEditable(false);
  tarc.setBackground(new Color(224,224,224));
  sp = new JScrollPane(tarc);
  sp.setBounds(215,330,375,90);
  add(sp);
  foote = new JLabel("©2021 The Coca-Cola Company Todos los derechos reservados");
  foote.setBounds(130,440,500,30);
  foote.setFont(new Font("Andale Mono", 1, 12));
  foote.setForeground(new Color(255,255,255));
  add(foote);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == ro){
   getContentPane().setBackground(new Color(255,0,0));
    mb.setBackground(new Color(255,0,0));
    codefo.setForeground(new Color(255,0,0));
    ro.setForeground(new Color(255,0,0));
    ne.setForeground(new Color(255,0,0));
    mo.setForeground(new Color(255,0,0));
    nue.setForeground(new Color(255,0,0));
    sal.setForeground(new Color(255,0,0));
    vac.setForeground(new Color(255,0,0));
    acrea.setForeground(new Color(255,0,0));
    tnm.setForeground(new Color(255,0,0));
    tapp.setForeground(new Color(255,0,0));
    tapm.setForeground(new Color(255,0,0));
    cdep.setForeground(new Color(255,0,0));
    cant.setForeground(new Color(255,0,0));
    tarc.setForeground(new Color(255,0,0));
   }
  if(e.getSource() == ne){
   getContentPane().setBackground(new Color(0,0,0));
    mb.setBackground(new Color(0,0,0));
    codefo.setForeground(new Color(0,0,0));
    ro.setForeground(new Color(0,0,0));
    ne.setForeground(new Color(0,0,0));
    mo.setForeground(new Color(0,0,0));
    nue.setForeground(new Color(0,0,0));
    sal.setForeground(new Color(0,0,0));
    vac.setForeground(new Color(0,0,0));
    acrea.setForeground(new Color(0,0,0));
    tnm.setForeground(new Color(0,0,0));
    tapp.setForeground(new Color(0,0,0));
    tapm.setForeground(new Color(0,0,0));
    cdep.setForeground(new Color(0,0,0));
    cant.setForeground(new Color(0,0,0));
    tarc.setForeground(new Color(0,0,0));
   }
  if(e.getSource() == mo){
   getContentPane().setBackground(new Color(51,0,51));
    mb.setBackground(new Color(51,0,51));
    codefo.setForeground(new Color(51,0,51));
    ro.setForeground(new Color(51,0,51));
    ne.setForeground(new Color(51,0,51));
    mo.setForeground(new Color(51,0,51));
    nue.setForeground(new Color(51,0,51));
    sal.setForeground(new Color(51,0,51));
    vac.setForeground(new Color(51,0,51));
    acrea.setForeground(new Color(51,0,51));
    mb.setBackground(new Color(51,0,51));
    tnm.setForeground(new Color(51,0,51));
    tapp.setForeground(new Color(51,0,51));
    tapm.setForeground(new Color(51,0,51));
    cdep.setForeground(new Color(51,0,51));
    cant.setForeground(new Color(51,0,51));
    tarc.setForeground(new Color(51,0,51));
   }
  if(e.getSource() == nue){
   tnm.setText("");
   tapp.setText("");
   tapm.setText("");
   cdep.setSelectedIndex(0);
   cant.setSelectedIndex(0);
   tarc.setText("\n          Aqui aparece el calculo de las vacaciones.");
   }
  if(e.getSource() == sal){
   Bienvenida vbienvenida = new Bienvenida();
   vbienvenida.setBounds(0,0,350,450);
   vbienvenida.setVisible(true);
   vbienvenida.setResizable(false);
   vbienvenida.setLocationRelativeTo(null);
   this.setVisible(false);
   }
  if(e.getSource() == vac){
    String nomb = tnm.getText();
    String apellpa = tapp.getText();
    String apellma = tapm.getText();
    String sdeparta = cdep.getSelectedItem().toString();
    String aservicio = cant.getSelectedItem().toString();
   if(nomb.equals("") || apellma.equals("") || apellpa.equals("") || 
      sdeparta.equals("") || aservicio.equals("")){
      JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
   } else {
    if(sdeparta.equals("Atención al Cliente")){
      if(aservicio.equals("1 año de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 6 dias de vaciones.");
      }
      if(aservicio.equals("2 a 6 años de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 14 dias de vaciones.");
      }
      if(aservicio.equals("7 años o más de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 20 dias de vaciones.");
      }
     }
    if(sdeparta.equals("Departamento de Logística")){
      if(aservicio.equals("1 año de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 7 dias de vaciones.");
      }
      if(aservicio.equals("2 a 6 años de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 15 dias de vaciones.");
      }
      if(aservicio.equals("7 años o más de servicio")){
      tarc.setText("\n       El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n       quien labora en " + sdeparta + " con " + aservicio + 
                   "\n       recibe 22 dias de vaciones.");
      }
    }
    if(sdeparta.equals("Departamento de Gerencia")){
      if(aservicio.equals("1 año de servicio")){
      tarc.setText("\n        El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n        quien labora en " + sdeparta + " con " + aservicio + 
                   "\n        recibe 10 dias de vaciones.");
      }
      if(aservicio.equals("2 a 6 años de servicio")){
      tarc.setText("\n        El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n        quien labora en " + sdeparta + " con " + aservicio + 
                   "\n        recibe 20 dias de vaciones.");
      }
      if(aservicio.equals("7 años o más de servicio")){
      tarc.setText("\n        El/la trabajador/a " + nomb + " " + apellpa + " " + apellma +  
                   "\n        quien labora en " + sdeparta + " con " + aservicio + 
                   "\n        recibe 30 dias de vaciones.");
      }
    }
   }
  }

  if(e.getSource() == acrea){
    JOptionPane.showMessageDialog(null, "Desarrollado por Sergio Alexis LFNN " + 
                                        "\n           ANDROSERGNN");
   }
 }
 public static void main(String args[]){
  Principal vprincipal = new Principal();
  vprincipal.setBounds(0,0,635,530);
  vprincipal.setVisible(true);
  vprincipal.setResizable(false);
  vprincipal.setLocationRelativeTo(null);
 }
}


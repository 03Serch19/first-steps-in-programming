import java.util.Scanner;
public class Cadena{
  public static void main(String args[]){
  String cr = "", crf = "";
  int nc = 0, dd = 0, hst = 0;
  Scanner in = new Scanner(System.in);

  System.out.println("");
  System.out.print("Ingrese una cadena de caracteres: ");
  cr = in.nextLine();
  System.out.println("");
  nc = cr.length();
  System.out.println("La cadena " + cr + " tiene " + nc + " caracteres."); 
  System.out.println("");
  System.out.print("Desde que caracter deseas obtener la nueva cadena?: ");
  dd = in.nextInt();
  System.out.println("");
  System.out.print("Hasta que caracter deseas obtener la nueva cadena?: ");
  hst = in.nextInt();
  System.out.println("");
  crf = cr.substring(dd, hst);
  System.out.println("La nueva cadena es: " + crf);
  System.out.println("");
 }
}
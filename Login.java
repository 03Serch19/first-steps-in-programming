import java.util.Scanner;

public class Login{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  String nm = "", usu = "";

 System.out.println("");
 System.out.print("Ingrese el nombre de usuario: ");
 nm = in.nextLine();
 System.out.println("");
 System.out.print("Ingrese la clave: ");
 usu = in.nextLine();
 System.out.println("");
  if(nm.equals("sergio19.2003") && usu.equals("123123")){
    System.out.println("Has iniciado sesion.");
  } else{
    System.out.println("El nombre de usuario o clave son incorrectos. Vuelve a intentarlo");
    nm = "";
    usu = "";
    System.out.println("Este es tu ultimo intento.");
    System.out.println("");
    System.out.print("Ingrese el nombre de usuario: ");
    nm = in.nextLine();
    System.out.println("");
    System.out.print("Ingrese la clave: ");
    usu = in.nextLine();
    System.out.println("");
    if(nm.equals("sergio19.2003") && usu.equals("123123")){
    System.out.println("Has iniciado sesion.");
  } else{
     System.out.println("Intentos maximos alcanzados tu cuenta ha sido bloqueada.............");
  }  
  }
 }
}
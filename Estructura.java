import java.util.Scanner;
public class Estructura{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  
  int n1 = 0, n2 = 0, re = 0;
  int par = 0;

  System.out.println("************");
  System.out.println("*Bienvenido*");
  System.out.println("************");
  System.out.println("");
  System.out.println("Ingresa el numero segun la operacion que desees realizar");
  System.out.println("");
  System.out.println("Suma presiona 1");
  System.out.println("Resta presiona 2");
  System.out.println("Multiplicacion presiona 3");
  System.out.println("Division presiona 4");
  System.out.println("");
  System.out.print("******************: ");
  par = in.nextInt();
  System.out.println("");


  switch(par){

    case 1: System.out.print("Ingrese el primer numero: ");
            n1 = in.nextInt();
            System.out.println("");
            System.out.print("Ingrese el segundo numero: ");
            n2 = in.nextInt();
            System.out.println("");
            re = n1 + n2;
            System.out.println("El resultado de la suma es: " +re);
            break;
    case 2: System.out.print("Ingrese el primer numero: ");
            n1 = in.nextInt();
            System.out.println("");
            System.out.print("Ingrese el segundo numero: ");
            n2 = in.nextInt();
            System.out.println("");
            re = n1 - n2;
            System.out.println("El resultado de la resta es: " +re);
            break;
    case 3: System.out.print("Ingrese el primer numero: ");
            n1 = in.nextInt();
            System.out.println("");
            System.out.print("Ingrese el segundo numero: ");
            n2 = in.nextInt();
            System.out.println("");
            re = n1 * n2;
            System.out.println("El resultado de la multiplicacion es: " +re);
            break;
    case 4: System.out.print("Ingrese el primer numero: ");
            n1 = in.nextInt();
            System.out.println("");
            System.out.print("Ingrese el segundo numero: ");
            n2 = in.nextInt();
            System.out.println("");
            re = n1 / n2;
            System.out.println("El resultado de la division es: " +re);
            break;
   default: System.out.println("ERROR, la opcion no es valida.");
            break;
  }
 
 }
}
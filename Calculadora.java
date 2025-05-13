import java.util.Scanner;

public class Calculadora{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int op = 0;
  System.out.println("***************************************************************************");
  System.out.println("*Ingresa el numero segun la operacion que desees realizar segun esta lista*");
  System.out.println("***************************************************************************");
   System.out.println("Para realizar suma presiona 1");
   System.out.println("Para realizar resta presiona 2");
   System.out.println("Para realizar multiplicacion presiona 3");
   System.out.println("Para realizar division presiona 4");
   System.out.println("");
   System.out.print("Presiona un numero: ");
   op = in.nextInt();
   System.out.println("");
   if(op == 1){
   
   int n1 = 0, n2 = 0, re = 0;
   
    System.out.print("Ingrese el primer numero: ");
    n1 =  in.nextInt();
    System.out.println("");
    System.out.print("Ingrese el segundo numero: ");
    n2 =  in.nextInt();
    System.out.println("");
    re = n1 + n2;

    System.out.println("El resultado de la suma es: " +re); 

   } else if(op == 2) {
   
   int n1 = 0, n2 = 0, re = 0;   
 
    System.out.print("Ingrese el primer numero: ");
    n1 =  in.nextInt();
    System.out.println("");
    System.out.print("Ingrese el segundo numero: ");
    n2 =  in.nextInt();
    System.out.println("");

    re = n1 - n2;

    System.out.println("El resultado de la resta es: " +re);

   } else if(op == 3){
   
   int n1 = 0, n2 = 0, re = 0;   
 
    System.out.print("Ingrese el primer numero: ");
    n1 =  in.nextInt();
    System.out.println("");
    System.out.print("Ingrese el segundo numero: ");
    n2 =  in.nextInt();
    System.out.println("");

    re = n1 * n2;

    System.out.println("El resultado de la multiplicacion es: " +re);

   } else if(op == 4){
   
   int n1 = 0, n2 = 0, re = 0;

    System.out.print("Ingrese el primer numero: ");
    n1 =  in.nextInt();
    System.out.println("");
    System.out.print("Ingrese el segundo numero: ");
    n2 =  in.nextInt();
    System.out.println("");

    re = n1 / n2;

    System.out.println("El resultado de la division es: " +re);

   } else{
    System.out.println("La opcion no existe.");
   }

  
 }
}
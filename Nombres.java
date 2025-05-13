import java.util.Scanner;
public class Nombres{
 public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String nm1 = "", nm2 ="";

   System.out.println("");
   System.out.print("Ingrese el primer nombre: ");
   nm1 = in.nextLine();
   System.out.println("");
   System.out.println("");
   System.out.print("Ingrese el segundo nombre: ");
   nm2 = in.nextLine();
   System.out.println("");
   
  if(nm1.equalsIgnoreCase(nm2)){
   System.out.println("Los nombres son iguales.");
  } else{
   System.out.println("Los nombres son diferentes");
  }

 }
}
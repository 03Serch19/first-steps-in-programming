import java.util.Scanner;
 public class VectoresDinamicos{
   public static void main(String args[]){
  int lon = 0;
  Scanner in = new Scanner(System.in);
  System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
  lon = in.nextInt();
  System.out.println("");
  int nm[] = new int[lon];
  for(int i = 0; i < nm.length; i++){
   System.out.print("Ingrese el numero " + (i + 1) + ": ");
   nm[i] = in.nextInt();
   System.out.println(""); 
  }
  for(int i = 0; i < nm.length; i++){
  System.out.print("[" + nm[i] + "]");
  }
  System.out.println("");
 }
}
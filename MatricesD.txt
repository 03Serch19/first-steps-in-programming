import java.util.Scanner;
public class MatricesD{
  public static void main(String args[]){
  
  int fl = 0, cl = 0, cn = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Ingrese la cantidad de filas que desea: ");
  fl = in.nextInt();
  System.out.print("Ingrese la cantidad de columnas que desea: ");
  cl = in.nextInt();
  int nm [][] = new int[fl][cl];
    System.out.println("");
  for(int j = 0; j < fl; j++){
   for(int i = 0; i < cl; i++){
    nm [j][i] = cn;
    cn++;
    System.out.print("[" + nm[j][i] + "]");
   }
    System.out.println("");
  }
  
  

 }
}
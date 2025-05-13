public class Ciclos{
  public static void main(String args[]){
  int i = 0;
  System.out.println("");
  System.out.println("Ciclo for.");
  for(i = 1; i <= 10; i++){
    if(i <= 9){
     System.out.print(i + ", ");
    }else{
      System.out.print(i);
     }
  }
  System.out.println("");
  System.out.println("Ciclo while.");
  i = 1;
  while(i <= 10){
   if(i <= 9){
      System.out.print(i + ", ");
    }else{
      System.out.print(i);
     }
   i++;
  } 
  System.out.println("");
  System.out.println("Ciclo do-while.");
  i = 1;
  do{
   if(i <= 9){
      System.out.print(i + ", ");
    }else{
      System.out.print(i);
     }
   i++;   
  }while(i <= 10);
 }
}
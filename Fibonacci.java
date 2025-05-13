public class Fibonacci{
  public static void main(String args[]){
  int i = 0, a = 0, b =1, c = 0;
   System.out.println("");
   System.out.println("Ciclo for.");
   System.out.println("");
   for(i = 0; i < 10; i++){
    if(i < 9){
    System.out.print(a + ", ");
    c = a + b;
    a = b;
    b = c;
    } else{
    System.out.print(a);
    }
   } 
   i = 0;
   a = 0;
   b = 1;
   c = 0;
   System.out.println("");
   System.out.println("");
   System.out.println("Ciclo while.");
   System.out.println("");
  while(i < 10){
    if(i < 9){
    System.out.print(a + ", ");
    c = a + b;
    a = b;
    b = c;
    } else{
    System.out.print(a);
    }
    i++;
   }
   i = 0;
   a = 0;
   b = 1;
   c = 0;
   System.out.println("");
   System.out.println("");
   System.out.println("Ciclo do-while.");
   System.out.println("");
  do{
    if(i < 9){
    System.out.print(a + ", ");
    c = a + b;
    a = b;
    b = c;
    } else{
    System.out.print(a);
    }
    i++;
   }while(i < 10);
   System.out.println("");
 }
}
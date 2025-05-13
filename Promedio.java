public class Promedio{
  public static void main(String args[]){
   
   int Matematicas = 1;
   int Lenguaje = 2;
   int Ciencias = 9;
   int Sociales = 3;
   int promedio =0;
   
   promedio = (Matematicas + Lenguaje + Ciencias + Sociales) / 4;

   if (promedio >= 7){
     System.out.println("El alumno aprobo con: " +promedio);   
   }
   else{
     System.out.println("El alumno reprobo con: " +promedio); 
   }
 }
}
import java.util.Scanner;

public class Sistema{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);

   String nombre = "";
   int clave = 0, tiempo = 0;
   System.out.println("****************************************************");
   System.out.println("*Bienvenido al sistema vocacional de Sergio Company*");
   System.out.println("****************************************************");
   System.out.print("Ingrese el nombre del trabajador: "); 
   nombre = in.nextLine();
   System.out.println("");
   System.out.print("Ingrese el tiempo de servicio del trabajador: ");
   tiempo = in.nextInt();
   System.out.println("");
   System.out.print("Ingrese la clave del departamento: ");
   clave = in.nextInt();
   System.out.println("");
   System.out.println("");

   if(clave == 1){
    if(tiempo == 1){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 6 dias de vacaciones.");
    } else if(tiempo >= 2 && tiempo <= 6){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 14 dias de vacaciones.");
    } else if (tiempo >= 7){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 20 dias de vacaciones.");
    } else{
       System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones.");
    }

   } else  if(clave == 2){
    if(tiempo == 1){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 7 dias de vacaciones.");
    } else if(tiempo >= 2 && tiempo <= 6){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 15 dias de vacaciones.");
    } else if (tiempo >= 7){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 22 dias de vacaciones.");
    } else{
       System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones.");
    }

   } else if(clave == 3){
    if(tiempo == 1){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 10 dias de vacaciones.");
    } else if(tiempo >= 2 && tiempo <= 6){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 20 dias de vacaciones.");
    } else if (tiempo >= 7){
       System.out.println("El trabajador " + nombre +  " tiene derecho a 30 dias de vacaciones.");
    } else{
       System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones.");
    } 
   
   } else{
       System.out.println("La clave es proporcionada es inexistente");
   } 

 }
}
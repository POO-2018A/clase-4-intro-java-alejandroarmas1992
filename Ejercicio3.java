package deber;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner scan= new Scanner (System.in);
        System.out.println("Ingrese su edad:");
        int edad = scan.nextInt();
        if (edad>=18){
            System.out.println("Ud es mayor de edad");
        }else{
            System.out.println("Ud es menor de edad");
        }
        
        
        
    }
    
}

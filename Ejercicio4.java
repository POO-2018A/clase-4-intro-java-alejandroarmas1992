
package deber;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner scan= new Scanner (System.in);
        System.out.println("Ingrese un Numero:");
        int numero=scan.nextInt();
        if (numero%2==0){
            System.out.println("El numero es par");
        } else if(numero%3==0 || numero==1){
            System.out.println("El numero es impar");
            
        }
    }
}

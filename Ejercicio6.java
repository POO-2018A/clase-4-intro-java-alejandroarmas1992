
package deber;


public class Ejercicio6 {
    public static void main(String[]args){
        boolean isSnowing=false;
        boolean isRaining=true;
        double temperature=60.0;
        if (isSnowing==true || isRaining==true || temperature<10){
            System.out.println("Nos quedamos en casa.");
        } else {
            System.out.println("Vamos afuera.");
        }
    }
}

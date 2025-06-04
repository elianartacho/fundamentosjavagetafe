
import java.util.Scanner;

public class Class02EjemploScanner {
    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

         System.out.println("Introduzca su nombre");
          String nombre = teclado.nextLine();

          System.out.println("Introduce tu edad");
            String edad = teclado.nextLine();

            System.out.println("Bienvenido" + nombre);
            System.out.println("Tienes " + edad + " años");

    }

    
}
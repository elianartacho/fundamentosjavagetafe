import java.util.Scanner;

public class Class03Sumarnumeros {
    public static void main(String[] args) {
        //llamo al Scanner para introducir por teclado
      Scanner teclado = new Scanner(System.in);

      // solicitamos el numero
    System.out.println("Introduce un numero 1");
     // Lo lee como un String
      String dato = teclado.nextLine();
      //Convertimos el String a entero
        int numero1 = Integer.parseInt(dato);

    System.out.println("Introduce un numero 2");
        dato = teclado.nextLine();
        int numero2 = Integer.parseInt(dato);

    // Realizamos la suma
    int suma = numero1 +numero2;

    System.out.println("La suma es " + suma);
    System.out.println("Fin de programa");
    
    }
    
}

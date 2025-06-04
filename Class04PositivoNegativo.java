import java.util.Scanner;

public class Class04PositivoNegativo {
    public static void main(String[] args) {
       
        System.out.println("Introduzca numero");
         Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        if (numero >0){
            System.out.println("El numero es positivo");

        }else if(numero == 0){
            System.out.println("El numero es cero");
        }else{
            System.out.println("El numero es negativo");
        }
         System.out.println("Fin de programa");
    }
}
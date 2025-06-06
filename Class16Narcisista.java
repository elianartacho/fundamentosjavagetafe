import java.util.Scanner;

public class Class16Narcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero a comprobar: ");
        String texNumero= teclado.nextLine();
        double numeros = Integer.parseInt(texNumero);
        double suma = 0;
        
        for (int i = 0; i < texNumero.length(); i++) {
            char letra = texNumero.charAt(i);
             String aux = String.valueOf(letra);
             int numero = Integer.parseInt(aux);
             double resultado = Math.pow(numero, texNumero.length());
             suma +=resultado;

        }

        System.out.println("El resultado es : ");
         
        if (suma == numeros){
            System.out.println("Es un numero narcisista");
        }else{
            System.out.println("No es un numero narcisista");
        }

    }
}

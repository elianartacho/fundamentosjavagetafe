import java.util.Scanner;

public class Class15SumarTextoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros que quieras sumar");
        String textoNum= teclado.nextLine();
         int suma = 0;

        for (int i = 0; i < textoNum.length(); i++) {
           //CAPTURAMOS CADA LETRA DEL TEXTO
           char letra= textoNum.charAt(i);
           //convertimos el char A int
           //'1' --> 49 char
           //"1" --> String para que me devuelva un int
           //valueOf convierte los numeros en String para convertirlos luego en int
           String aux = String.valueOf(letra);
           int numero = Integer.parseInt(aux);
           suma += numero;
        }
        System.out.println("La suma de "+ textoNum + "es "+ suma);
    }
}

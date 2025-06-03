import java.util.Scanner;

public class Class01Primitivos {
    public static void main(String[] args) {
        String saludo ="Hola mundo";
        //quiero pedir al usuario un texto
        Scanner teclado = new Scanner(System.in);


        //Le pedimos el nombre
        System.out.println("Introduzca su nombre");
        //almacenamos el nombre del usuario
        String nombre = teclado.nextLine();
        //recoge la info y devuelve el mensaje
        System.out.println("Bienvenido a Java " + nombre);

        //conversion automatica
       // byte menor = 15;
        //int mayor = menor;

        //conversion entre primitivos
         int mayor = 15;
         byte menor = (byte) mayor;

      //convertir cualquier objeto a string
        //String texto = "12";
       // texto = Integer.toString(mayor);
       // texto = Byte.toString(menor);

      //convertir un primitivo a string
        String texto ="12";
        int variable = Integer.parseInt(texto);

      //guardar un primitivo en string
        int numero = 15;
        String texto2 = String.valueOf(numero); //"15"



        System.out.println("Fin de programa");

    }
    

}

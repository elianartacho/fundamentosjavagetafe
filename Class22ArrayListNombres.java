import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String>listaNombres = new ArrayList<String>();

        String nombres= " ";
        int suma= 0;
        
        while (nombres.equalsIgnoreCase("stop") == false) {
             System.out.println("Introduzca nombre: ");
             nombres = teclado.nextLine();
             listaNombres.add(nombres);
             }
           
        
        listaNombres.remove(listaNombres.size() - 1);

        for (int i = 0; i < listaNombres.size(); i++) {
            String nombre = listaNombres.get(i);
            System.out.println(nombre);
             suma++;
            
               
        }
        System.out.println("El numero total de nombres es: " + suma );
    }

}
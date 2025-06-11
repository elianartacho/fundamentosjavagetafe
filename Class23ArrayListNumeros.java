import java.util.ArrayList;
import java.util.Scanner;

public class Class23ArrayListNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer>listaNumeros = new ArrayList<Integer>();

        int num = 0;
        int suma = 0;

        while (num != -1) {
            System.out.println("introduzca numero: ");
            num = teclado.nextInt();
           
           if (listaNumeros.indexOf(num) == -1) {
             listaNumeros.add(num);
           }else{
            System.out.println("El numero ya existe agregue otro diferente: ");
           }
           

        }
        listaNumeros.remove(listaNumeros.size() - 1);

        for (int i = 0; i < listaNumeros.size(); i++) {
            num = listaNumeros.get(i);
            System.out.println(num);
            suma+=num;
        }
        System.out.println("La suma total es" + suma);
    }
}

import java.util.Scanner;

public class Class10TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        String dato = teclado.nextLine();
        int num = Integer.parseInt(dato);

        // este for te muestra una tabla de multiplicar del numero elegido
        for (int i = 1; i < 10; i++) {
                    System.out.println(i + "*" + num + "="+ i * num);
             }


        //este for anidado te muestra las tablas del 1 al numero elegido (varias tablas)
        // for (int i = 1; i <= num; i++) {
        //     for(int u = 1; u <= 10; u++){
        //         System.out.println(i + "*" + u + "=" + i * u);
        //     }
        // }

    }
}

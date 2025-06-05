import java.util.Scanner;

public class Class09Bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // bucles contador (for)
        //debemos indicar un inicio , un final(until), un incremento
        //la variable contador se declara dento del bucle y 
        //solamente se puede utilizar dentro de dicho bucle
        // for(int i = 1; i <= 5; i++){
        //     System.out.println("For : " + i);
        // }
        // //podemos tener un incremento distinto
        // for (int i = 1; i < 10; i += 3) {
        //     System.out.println("Tres en tres " + i);
        // }
        // //podemos hacerlo inverso
        // for (int i = 7; i >0; i--) {
        //     System.out.println("Inverso " + i);
        // }


        // //bucles de condicion(While)
        // //necesitas una condicion para salir
        // //bucles infinitos
        // //necesitamos una variable de salida del bucle

        // int contador = 1;
        // while (contador <= 5) {
        //      System.out.println("While: " + contador);
        //     //Debemos hacer algo para que la variable cambie y 
        //     //legue a la condicion de salida
        //    contador ++;
            
        // }

        //Java en sus String no compara con operador == !=
        // se usa equals para comparar String Ejemplo:
        
        String dato = "";
        while (dato.equals("stop") == false) {
            System.out.println("Dime algo bonito (stop para salir)");
            dato = teclado.nextLine();
        }
    }

}

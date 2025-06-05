import java.util.Scanner;

public class Class11Collatz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        String dato = teclado.nextLine();
        int num = Integer.parseInt(dato);

        //te descompone un numero hasta llegar a uno segun la teoria de collatz
        while (num != 1) {
            if (num %2 == 0) {
                num = num/2;
            }else{
                num = (num * 3) +1;
            }
            System.out.println(num);
        }
      
    }
}
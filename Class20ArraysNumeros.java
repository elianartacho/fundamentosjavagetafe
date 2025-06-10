
import java.util.Scanner;

public class Class20ArraysNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8] ;
    
        int suma = 0;
        int menor= 0;
        int mayor= 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introduce 8 numeros"); 
        String dato =teclado.nextLine();
        int num = Integer.parseInt(dato);
        numeros[i] = num;
           
        }
        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            int  num = numeros[i];
            suma+= num;
            mayor = Math.max(num,mayor);
            menor= Math.min(num,menor);
            
        }
        
        media = suma/numeros.length;   

        System.out.println("El numero minimo es" + menor);
        System.out.println("El numero maximo es " + mayor);
        System.out.println("La suma es " + suma);
        System.out.println("La media es" + media);
    }
}
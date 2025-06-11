import java.util.Scanner;

public class Class25MetodoPositivoNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        String data= compararNumero(num);
        System.out.println(data);
    }

     public static String compararNumero(int num1){
        
        String  respuesta="";

        if (num1> 0) {
            respuesta = "Positivo";
        }else if(num1< 0){
            respuesta = "Negativo";
        }else if(num1 == 0){
            respuesta = "Cero";
        }
        
        return respuesta;
    }

   

}

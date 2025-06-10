import java.util.Scanner;

public class Class17Isbn {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el ISBN");
        String texnumero = teclado.nextLine();
        
        int suma= 0;

        if(texnumero.length() == 10){
            for (int i = 0; i < texnumero.length() ; i++) {
                 char letra = texnumero.charAt(i);
                  String aux = String.valueOf(letra);
                  int numero = Integer.parseInt(aux);
                  int multiplicar = numero * (i + 1); 
                  suma +=multiplicar;  
            }
           
            if ( suma % 11 == 0) {
                System.out.println("Numero ISBN correcto");
            }else{
                System.out.println("Numero ISBN incorrecto");
            }
       
         }else{
            System.out.println("El ISBN debe contener 10 numeros");
         }
    }
}

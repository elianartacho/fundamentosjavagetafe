import java.util.Scanner;

public class Class26MetodoEmail {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduze tu email ");
        String email = teclado.nextLine();
        boolean esValido = validarEmail(email);
        if (esValido) {
            System.out.println("El email es válido.");
        } else {
            System.out.println("El email no es válido.");
        }
        
        
      }
    public static boolean validarEmail(String email){
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            return false;
            
        } else if (email.indexOf('@') != email.lastIndexOf('@')) {
            return false;

        } else if (email.indexOf('@') == -1) {
           
            return false;
        } else if (email.indexOf(".") == -1) {
           
            return false;
        } else if (email.indexOf('@') > email.lastIndexOf('.')) {
          
            return false;
        } else {
            int ultimoPunto = email.lastIndexOf(".");
            String dominio = email.substring(ultimoPunto + 1);
            if (dominio.length() >= 2 && dominio.length() <= 3) {
               
                return true;
            } else {
               
                return false;
            }
        }
    }
    


}

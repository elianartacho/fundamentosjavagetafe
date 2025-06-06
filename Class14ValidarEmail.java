import java.util.Scanner;

public class Class14ValidarEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca email");
        String email = teclado.nextLine();

        if (email.startsWith("@")  || email.endsWith("@")) {
            System.out.println("El email no puede ni empezar ni terminar con @");
        }
        else 
            if (email.indexOf('@') != email.lastIndexOf('@') ) {
                System.out.println("Solo puede haber una @ ");
            } 
            else if (email.indexOf('@') == -1) {
                System.out.println("Es obligatoria la @");
            }
            else
                if (email.indexOf(".") == -1) {
                     System.out.println("Falta un punto ");

                }else
                    if (email.indexOf('@') > email.lastIndexOf('.')) {
                    System.out.println("El punto no esta en la posicion correcta");
                }else {
                    int ultimoPunto = email.lastIndexOf(".");
                    String dominio = email.substring(ultimoPunto + 1);
                    if(dominio.length() >= 2 && dominio.length() <=3 ){
                        System.out.println("El email es CORRECTO!!");

                    }else{
                        System.out.println("El dominio debe ser de 2 a 3 caracteres");
                    }
                }
            

                
        

    }

}

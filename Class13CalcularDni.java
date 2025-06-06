import java.util.Scanner;

public class Class13CalcularDni {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        
         System.out.println("1. Comprobar NIF");
         System.out.println("2. Averiguar letra NIF ");
         String dato  = teclado.nextLine(); 
       
       int opcion = Integer.parseInt(dato);
       String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET ";

       if(opcion == 1){
        System.out.println("Introduzca su NIF (12345678X)");
        String dni = teclado.nextLine();

        // Para el calculo necesitamos dividir el numero de la letra
        //comenzamos recuperando la letra
        char letraDni = dni.charAt(dni.length() - 1);
        String temp = dni.substring(0, dni.length() -1);
         int numeroDni = Integer.parseInt(temp);
         int resultado = (numeroDni - (numeroDni /23) * 23);
        char letra = letrasDni.charAt(resultado);
        
        if(letraDni == letra){
            System.out.println("Su DNI es correcto");
        }else{
            System.out.println("Su DNI es incorrecto , su letra es " + letra);
        }

       }else{
          System.out.println("Introduzca numero DNI");
          dato = teclado.nextLine();
           int numeroDni = Integer.parseInt(dato);
            int resultado = (numeroDni - (numeroDni /23) * 23);
            char letra = letrasDni.charAt(resultado);
            System.out.println("Su letra del DNI es " + letra);

       }
       
        
        //(nº DNI - (Ent(nº DNI /23 )* 23))
        //Dentro de java tenmos una clase para realizar
        //operaciones matematicas con numeros super util: Math

        



        
    }
}

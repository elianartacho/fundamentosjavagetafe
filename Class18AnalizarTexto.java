import java.util.Scanner;

public class Class18AnalizarTexto {
    public static void main(String[] args) {
        
        System.out.println("Introduce el texto a analizar ");
        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();

        int letras = 0;
        int digitos = 0;
        int vocales = 0;
        int consonantes = 0;
        int mayusculas = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            //cuantas letras tiene
            if (Character.isLetter(c)) {
                letras++;

                //vocales
                
            }if (Character.toLowerCase(c)== 'a'|| Character.toLowerCase(c)== 'e'|| Character.toLowerCase(c)== 'i'||Character.toLowerCase(c)== 'o'|| Character.toLowerCase(c)=='u')  {
                vocales++;
            }else {
                consonantes++;
            }
            //Mayusculas
            if (Character.isUpperCase(c)) {
                mayusculas++;
                //digitos
            }else if(Character.isDigit(c)){
                digitos++;
            }
        }
        System.out.println("El total de letras es " + letras);
        System.out.println(" Rl total de vocales " + vocales);
        System.out.println("el total de mayusculas" + mayusculas);
        System.out.println("el total de digitos" + digitos);
    }
}

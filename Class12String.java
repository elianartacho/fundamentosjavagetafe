
public class Class12String {
    public static void main(String[] args) {
        String texto = "desarrollo con Java";

        System.out.println("Longitud texto: " + texto.length());
        System.out.println("toLower()" + texto.toLowerCase());
        System.out.println("toUpper()" + texto.toUpperCase());

        //buscamos la letra de diferentes formas
        System.out.println("indexOf('a'):" + texto.indexOf('a'));

        //la sobrecarga busca a partir de un indice
        System.out.println("indexOf('a', 4) :" +texto.indexOf('a', 4));
        System.out.println("lastIndexOf('a'):" + texto.lastIndexOf('a'));

        //la sobrecarga busca a partir de un indice inferior
        System.out.println("lastIndexOf('a', 17):" + texto.lastIndexOf('a', 17));

        //nos quedamos con una parte de la cadena
        System.out.println("substring(5):"+ texto.substring(5));

        //tenemos una sobrecarga indicando el final???
        System.out.println("substring(2,4):" + texto.substring(2, 4));

        System.out.println("startsWith('D'):" + texto.startsWith("D"));

        System.out.println("endsWhith('a'): " +texto.endsWith("a"));

        //recuperar un caracter 
        System.out.println("charAt(5):" + texto.charAt(5));

        //Aplicar un metodo a un objeto ,no implica que el objeto sea modificado
        //los metodos (algunos) devuelven un valor del objeto
        //convertimos el texto a Mayusculas
        texto.toUpperCase();
        //si deseamos modificar el texto, debemos igualarlo
        texto = texto.toUpperCase();
        System.out.println(texto);



    }
}

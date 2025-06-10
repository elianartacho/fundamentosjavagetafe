

public class Class19Arrays {
    public static void main(String[] args) {
        //vamos a declarar un array para guardar nombres
        String[] nombres = new String[3];
        //podemos acceder a sus posiciones mediante el indice
        //podemos visualizar la longitud
        System.out.println("longitud del Array" + nombres.length);

        nombres[0] = "Lucia";
        nombres[1] = "Adrian";
        nombres[2] = "Diana";

        for(int i = 0; i< nombres.length; i++){
            System.out.println("Nombres "+ i + "="+ nombres[i]);
        }
        //tambien podemos tener un array inicializado con contenido
        int[] numeros= new int[] {11,14,15,66,55,44,22,88};
        System.out.println("Elementos en Aray de int :" + numeros.length);
    }
}

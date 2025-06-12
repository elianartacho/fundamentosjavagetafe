import java.util.ArrayList;

public class Class27MetodosNarcisita {
    public static void main(String[] args) {
        //creo un arraylis de numeros para posteriormente guardarlo
        ArrayList<Integer>listaNumeros = new ArrayList<Integer>();
      
        for (int i = 1; i < 20000; i++) {

            int num= i;
            boolean narcisista = comprobarNarcisista(num);
            if ( narcisista == true) {
                listaNumeros.add(num);
            }
           
        }
            for(int narci:listaNumeros){
                System.out.print(narci + ", ");
            }
         
    }


    public static boolean comprobarNarcisista(int numero){

        int suma= 0;
        //convierte el int en string
        String dato = String.valueOf(numero);

        //en el bucle recorro el string
        for (int i = 0; i < dato.length() ; i++) {
            //lo recorro caracter a caracter
            char letra = dato.charAt(i);
            //convierto char a string
             String aux = String.valueOf(letra);
             //convierto string a int
             int num = Integer.parseInt(aux);
             //uso math.pow para que me de el numero al exponente correspondiente a la longitud
             double resultado =  Math.pow(num, dato.length());
             //me hace la suma de los resultados 
             suma +=resultado;

        }
         //si la suma de los resultados es igual a numero sera narcisista 
         //como es un metodo devolvemos boolean
        if (suma == numero){

          return true;
        }else{
            return false;
        }

    }
}

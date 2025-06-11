import java.util.ArrayList;

public class Class21ArraysList {
    public static void main(String[] args) {
        //array de numeros porque tiene que usarse la clase no primitivos
        ArrayList<Integer> coleccionNumeros =new ArrayList<Integer>();

        //array de tipo String
        ArrayList<String> coleccion = new ArrayList<String>();
        //agregamos tres elementos
        coleccion.add("Elemento 1");
        coleccion.add("Elemento 2");
        coleccion.add("Elemento 3");
        coleccion.add("Elemento 1");

        
        //probamos a modificar un elemento
        coleccion.set(1, "Nuevo elemento 2");

        //podemos insertar elementos
        coleccion.add(1,"Insertado elemento");

        //podemos eliminar elementos,si enviamos el objeto
        //elimina el primero que encuentra en la coleccion
       // coleccion.remove("Elemento 1");

        //eliminar por index nos da mucha mas precision
        // coleccion.remove(4);

        //buscamos dentro de la coleccion
        System.out.println("posicion Elemento 1: "
        + coleccion.indexOf("Elemento 1"));

        //Nos devuelve por la ultima posicion
         System.out.println("Ultima posicion Elemento 1: " + coleccion.lastIndexOf("Elemento 1"));

         //eliminar toda la coleccion
         //coleccion.clear();

        //vamos a hacer un bucle para ver como  se comportan y visualizar los elementos
        System.out.println("Numero de elemtos: "+ coleccion.size());

        // for (int i = 0; i < coleccion.size(); i++) {
        //     //recuperamos cada elemento de la coleccion
        //     String elemento = coleccion.get(i);
        //     System.out.println(elemento);

        //for(Tipo variable:CONJUNTO) Solo son de lectura
        for(String elemento :coleccion){
            System.out.println(elemento);
        }
        }

    }


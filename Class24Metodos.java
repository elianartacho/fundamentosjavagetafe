public class Class24Metodos {
    //esto es un metodo
    //hasta ahora solo escribiamos aqui
    public static void main(String[] args) {
        System.out.println("Ejemplo metodos");
        //llamada a metodo
        metodoAccion();

        //los metodos return debemos almacenar
        //la respuesta en alguna variable
        String saludo = metodoSaludo();
        System.out.println(saludo);
        int valor = sumarNumeros(3, 4);
        System.out.println("la suma es : "+ valor);
        System.out.println("fin de programa");
        
    }
    //los metodos van dentro de la clase
    public static void metodoAccion(){
        //un metodo de accion ejecuta codigo
        System.out.println("Soy un metodo de acciones");
    }

    //metodos return
    public static String metodoSaludo(){
        //acciones de metodo
        return "Mi primer metodo return que ilusion";
    }

    //los metodos pueden recibir parametros y usarlos a mi conveniencia
    public static int sumarNumeros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }



}

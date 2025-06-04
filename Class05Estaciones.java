import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] args) {
        System.out.println("Introduce un numero del 1 al 4 y te dire la estacion , teniendo en cuenta que 1=Primavera 2= Verano 3= Invierno y 4 = Otoño ");

        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        if (numero == 1){
           System.out.println("Primavera");

         }else if(numero == 2){
             System.out.println("Verano");

         }else if (numero == 3){
            System.out.println("Invierno");

        }else if (numero == 4){
            System.out.println("Otoño");
         }else{
            System.out.println("Opcion incorrecta");
         }

         // opcion con switch case:

      //   switch (numero) {
      //      case 1:
      //           System.out.println("Primavera");
      //          break;
        //     case 2:
        //        System.out.println("Verano");

        //        break;
        //    case 3:
        //         System.out.println("Invierno");
        //         break;
        //    case 4:
        //        System.out.println("Otoño");
        //        break;         
         
        //    default:
        //        break;
        // }

    }
}

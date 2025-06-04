import java.util.Scanner;

public class Class07DiaNacimiento {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduzca su dia de nacimiento: ");
       String dato = teclado.nextLine();
       int dia = Integer.parseInt(dato);

       System.out.println("Introduzca su mes de nacimiento: ");
        String dato1 = teclado.nextLine();
        int mes = Integer.parseInt(dato1);

       System.out.println("Introduzca su año de nacimiento: ");
        String dato2 = teclado.nextLine();
        int anyo = Integer.parseInt(dato2);

        if(mes == 01 ){
            mes = 13;
            anyo = anyo - 1;
        }else if ( mes == 02){
            mes = 14;
            anyo= anyo - 1;
        }
        //comentar en bloque : Comand + k + c 
        //descomentar :comand + k + u

        int op1 = ((mes + 1) * 3) /5 ;
        int op2 = anyo / 4;
        int op3 = anyo / 100;
        int op4 = anyo /400;
        int op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 +2;
        int op6 = op5 / 7;
        int op7 = op5 - (op6 * 7);
        
        String[]dias = {"Sabado","Domingo", "Lunes","Martes","Miercoles","Jueves","Viernes"};
        System.out.println(dias[op7]);
    

        // switch (op7) {
        //     case 0: 
        //     System.out.println("Sabado");
                
        //         break;
        //     case 1:
        //     System.out.println("Domingo");

        //         break;
        //     case 2:
        //     System.out.println("Lunes");
            
        //         break;
        //     case 3 :
        //     System.out.println("Martes");
            
        //         break;
        //     case 4:
        //     System.out.println("Miercoles");

        //         break;

        //     case 5:
        //     System.out.println("Jueves");
            
        //         break;
        //     case 6:
        //     System.out.println("Viernes");    

        //     default:
        //         break;
        // }

       


    }
}

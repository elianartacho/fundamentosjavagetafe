import java.util.Scanner;

public class Class08CalcularSalario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas");
        String dato = teclado.nextLine();
        int horas = Integer.parseInt(dato);

        System.out.println("Introduzca importe hora: ");
        String dato1 = teclado.nextLine();
        int importe = Integer.parseInt(dato1);

        System.out.println("Introduzca los kilometros: ");
        String dato2 = teclado.nextLine();
        int km = Integer.parseInt(dato2);

        if(km > 900){
            System.out.println("Su dieta es Internacional");
        }else if(km < 101){
            System.out.println("Su dieta es Provincial");
        } else {
            System.out.println("Su dieta es Nacional");
        }

        double extra = 1.50;
        int op1 = horas -36;
        int op2 = 36 * importe;
        double tx = op1 * (importe + extra);
        double total = tx +op2;
        
        System.out.println("Salario total : " + total);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Horas extras " + op1);
    }
}
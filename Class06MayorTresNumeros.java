import java.util.Scanner;

public class Class06MayorTresNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca numero 1:");
     String dato = teclado.nextLine();
        int num1 = Integer.parseInt(dato);

     System.out.println("Introduzca numero 2 :");
     String dato2 = teclado.nextLine();
        int num2 = Integer.parseInt(dato2);

     System.out.println("Introduzca numero 3 :");
     String dato3 = teclado.nextLine();
        int num3 = Integer.parseInt(dato3);   

     int mayor;
     int menor;
     int intermedio = 0;


     if(num1 > num2 && num1 > num3 ){
        mayor = num1;

     }else if ( num2 > num1 && num2 > num3){
        mayor = num2;
     }else{
        mayor= num3;
     }
     if(num1 < num2 && num1 < num3){
        menor = num1;
     }else if (num2 < num1 && num2 < num3){
        menor = num2;
     }else {
        menor = num3;

     }

     // Ejemplo 1:
     //int suma = num1 + num2 +num3;
     //intermedio = suma - mayor - menor;


     // Ejemplo con if:
     
     if(mayor == num1 && menor == num2 || mayor == num2 && menor == num1){
        intermedio = num3;
     }else if(mayor == num2 && menor == num3 || mayor == num3 && menor == num2){
        intermedio = num1;
     }else if(mayor == num1 && menor ==num3 || mayor == num3 && menor == num1 ) {
        intermedio = num2;
     }
    
     System.out.println("El numero mayor es : " + mayor );
     System.out.println("El numero menor es :" + menor);
     System.out.println("El numero intermedio es :" + intermedio);   
    }
}
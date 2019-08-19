
import java.util.Scanner;



/**
 *
 * @author Moises Tapia
 */
public class Sobrecarga {
    
    
    public void sumar(int a, int b){
        int resultado;
        System.out.println("Recibe dos varibales enteras");
        resultado = a +b;
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("-------------------------------------------------");
        System.out.println("Gracias por usar nuestro programa Dart - Security");
        System.out.println("-------------------------------------------------");
        
    }
    
    public void sumar(float a, float b){
        System.out.println("Recibe dos varibales Flotantes");
        float sumafloat = 0;
        sumafloat = a + b;
        System.out.println("La suma float es: " + sumafloat);
        System.out.println("-------------------------------------------------");
        System.out.println("Gracias por usar nuestro programa Dart - Security");
        System.out.println("-------------------------------------------------");
    }
    
    public void sumar(double a, double b){
        double sumadoble = 0;
        System.out.println("Recibe dos varibales Dobles");
        sumadoble = a + b;
        System.out.println("La suma double es: " + sumadoble);
        System.out.println("-------------------------------------------------");
        System.out.println("Gracias por usar nuestro programa Dart - Security");
        System.out.println("-------------------------------------------------");
    }
    
    public static void main(String[] args) {
         Sobrecarga sc = new Sobrecarga();
         Scanner opc = new Scanner(System.in);
         int entrada;
          System.out.println("Este programa muestra la sobrecarga de metodos");
          System.out.println("En una misma clase se encuentran 3 Metodos los cuales"
                  + "hacen la operacion de la suma");
          
          System.out.println("Ingrese la opcion para ver la diferencia de los metodos "
                  + "sobrecargados.");
          System.out.println("----------------------------------------");
          System.out.println("1- Metodo de suma Enteros(int)\n"
                  + "2- Metodo Sumam de numeros Flotantes(float).\n"
                  + "3- Metodo Suma de numeros Dobles(Doubles).");
          entrada = opc.nextInt();
         System.out.println("----------------------------------------");
         if (entrada == 1){
             System.out.println("Ingrese dos numeros enteros:");
             System.out.println("Numero 1.");
             int a, b;
             a = opc.nextInt();
             System.out.println("Numero 2.");
             b = opc.nextInt();
             sc.sumar(a, b);
        }else if (entrada == 2) {
            System.out.println("Ingrese dos numeros Flotante:");
             System.out.println("Numero 1.");
             float a, b;
             a = opc.nextFloat();
             System.out.println("Numero 2.");
             b = opc.nextFloat();
             sc.sumar(a, b);
        }else{
            System.out.println("Ingrese dos numeros Dobles:");
             System.out.println("Numero 1.");
             double a, b;
             a = opc.nextDouble();
             System.out.println("Numero 2.");
             b = opc.nextDouble();
             sc.sumar(a, b);
        }
    }
    
    
}

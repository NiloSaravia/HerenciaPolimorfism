
package interfaces;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MENU DE PAGOS ===");
        
        System.out.println("1.- Pagoi con tarjeta");
        System.out.println("2.- Pago con efectivo");
        System.out.println("3.- Pago con PayPal");
        System.out.println("Elija una opcion");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        switch(opcion){
            case 1 ->{
                System.out.println("Ingrese monto");
                double monto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese numero de tarjeta");
                String numero = sc.nextLine();
                Pagable pl = new Tarjeta(monto, numero);
                pl.pagar();
            }
            case 2->{
                System.out.println("Ingrese monto: ");
                double monto = sc.nextDouble();
                Pagable p2 = new Efectivo(monto);
                p2.pagar();
                
            }
            case 3->{
                System.out.println("Ingrese monto");
                double monto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese email");
                String email = sc.nextLine();
                Pagable p3 = new PayPal(monto, email);
                p3.pagar();
            }
        }
    }
    
}

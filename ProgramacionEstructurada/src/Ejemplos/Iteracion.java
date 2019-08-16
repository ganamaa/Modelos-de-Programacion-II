
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Zoraya
 */
public class Iteracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int numero = 0;
        System.out.print("¿Qué tabla de multiplicar desea consultar? \nNumero: ");
        
        numero=leer.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+ numero*i);
        }
        
    }
    
}

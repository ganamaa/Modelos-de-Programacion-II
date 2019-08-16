/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Zoraya
 */
public class Recursividad {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int numero;
         System.out.print("Ingrese un numero para calcular su factorial \nNumero: ");
         numero=leer.nextInt();
         System.out.println("Factorial " + numero + " es: " + calcularFactorial(numero));
     
         }
     
     public static int calcularFactorial(int numero){
        if(numero == 0){
            return 1;
        }
        else
            return numero * calcularFactorial(numero-1);
    }
    
}

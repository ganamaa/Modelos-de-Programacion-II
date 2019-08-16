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
public class Condicionales {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int numero=0;
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        if(numero == 0){
            System.out.println(numero+" no tiene signo");
        }else{
            if(numero < 0){
                System.out.println(numero+" es negativo");
            }else{
               System.out.println(numero+" es positivo"); 
            }
                
        }
           
    }
    
}

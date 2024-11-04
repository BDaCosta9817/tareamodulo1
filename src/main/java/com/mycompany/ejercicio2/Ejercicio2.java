/*Blanca Da Costa Gomez Carcamo
202310010031
Programa de Operaciones arismeticas

*/

package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

       
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = 0;
        int mod = 0;

   
        if (numero2 != 0) {
            division = numero1 / numero2;
            mod = numero1 % numero2;
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

       
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
            System.out.println("Módulo: " + numero1 + " % " + numero2 + " = " + mod);
        }
        
        scanner.close();
    }
}
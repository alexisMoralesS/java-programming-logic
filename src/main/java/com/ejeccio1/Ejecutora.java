package com.ejeccio1;

import java.util.Scanner;

/*
* Ejeccicio 1: Dado un número entero 𝑛, realiza las siguientes 
* acciones condicionales:
*     - Si 𝑛 es impar, imprime "Extraño".
*     - Si 𝑛 es par y está en el rango de 2 a 5, imprime "No es extraño".
*     - Si 𝑛 es par y está en el rango de 6 a 20, imprime "Extraño".
*     - Si 𝑛 es par y es mayor que 20, imprime "No es extraño".
* Restricciones: 1 ≤ 𝑛 ≤ 100
* Ejemplo 1: n = 3 imprime "Extraño"
* Ejemplo 2: n = 24  imprime "No es extraño"   
* Explicacion: 
*     Caso 1: n = 3; n es impar y los número impares son extraños, 
* por lo tanto imprimimos "Extraño"
*     Caso 2: n = 24; n > 20 y n es par, entoncesno es extraño. 
* Por lo tanto, imprimimos "No es extraño"
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el número N:");
        int numeroN = scan.nextInt();
        // Restricciones: 1 ≤ 𝑛 ≤ 100
        if (numeroN >= 1 && numeroN <= 100) {
            // Si 𝑛 es impar, imprime "Extraño".
            boolean esPar = numeroN % 2 == 0;
            if (esPar) {
                // Si 𝑛 es par y está en el rango de 2 a 5, imprime "No es extraño"
                if (numeroN >= 2 && numeroN <= 5) {
                    System.out.println("No es extraño");
                }
                //Si 𝑛 es par y está en el rango de 6 a 20, imprime "Extraño"
                if (numeroN >= 6 && numeroN <= 20) {
                    System.out.println("Extraño");
                }
                //Si 𝑛 es par y es mayor que 20, imprime "No es extraño"
                if (numeroN > 20) {
                    System.out.println("No es extraño");
                }

            } else {
                System.out.println("Extraño");
            }
        } else {
            System.out.println("Número no valido.");
        }
    }
}

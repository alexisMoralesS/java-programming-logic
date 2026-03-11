package com.ejercicio3;

import java.util.Scanner;

/*
Ejercicio 3: Dado un número entero N, imprime sus primeros 10 múltiplos. 
Cada múltiplo N × i debe imprimirse en una nueva línea con  el siguiente 
formato: "N x i = resultado"

Restricciones
2 ≤ N ≤ 20

Ejemplo: entrada N = 2, salida:
2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20
 */
public class Ejecutora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero N:");
        int numeroN = scan.nextInt();
        if (numeroN >= 2 && numeroN <= 20) {
            for (int i = 1; i <= 10; i++) {
                int resultado = numeroN * i;
                // "N x i = resultado"
                System.out.println(numeroN + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número no es valido.");
        }
        scan.close();

    }
}

package com.ejercicio4;

import java.util.Scanner;

/*
Ejercicio 4: Usamos los enteros A, B y N para crear la siguiente serie:
(A + 2^0 * B),(A + 2^0 * B + 2^1 * B),...,
(A + 2^0 * B + 2^1 * B +...+ 2^(N-1) * B)

- Debes ingresar tres números enteros: A, B y N.  
Con esos valores se debe generar e imprimir la serie correspondiente 
como una sola línea con N enteros separados por espacios.

Restricciones: 0 ≤ A, B ≤ 50 y 1 ≤ N ≤ 15

Ejemplo: Usamos A = 5, B = 3 y N = 5 
        para producir algunos términos de la serie s0, s1, ..., s(n−1):
            s0 = 5 + 1 * 3 = 8
            s1 = 5 + 1 * 3 + 2 * 3 = 14
            s2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26
            s3 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
            s4 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrse el numero A:");
        int numeroA = scan.nextInt();
        System.out.print("Ingrse el numero B:");
        int numeroB = scan.nextInt();
        System.out.print("Ingrse el numero N:");
        int numeroN = scan.nextInt();
        if (!(numeroA >= 0 && numeroA <= 50)) {
            System.out.println("Numero A no es valido");
            return;
        }
        if (!(numeroB >= 0 && numeroB <= 50)) {
            System.out.println("Numero B no es valido");
            return;
        }
        if (!(numeroN >= 1 && numeroA <= 15)) {
            System.out.println("Numero N no es valido");
            return;
        }
        // (A + 2^0 * B),(A + 2^0 * B + 2^1 * B),...,
        //(A + 2^0 * B + 2^1 * B +...+ 2^(N-1) * B)
        int resultado = numeroA;
        for(int i =0; i< numeroN;i++){
            resultado +=  (int)Math.pow(2, i)* numeroB;
            System.out.print(resultado +" ");
        }
        scan.close();
    }
}
/* 
A=0, B=2 N=10 --> 2 6 14 30 62 126 254 510 1022 2046
A=3, B=3 N=3 --> 6 12 24
A=0, B=0 N=5 --> 0 0 0 0 0
A=6, B=6 N=10 --> 12 24 48 96 192 384 768 1536 3072 6144


 */

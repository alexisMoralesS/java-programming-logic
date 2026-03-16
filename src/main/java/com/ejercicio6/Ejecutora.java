package com.ejercicio6;

import java.util.Scanner;

/*
Ejecicio 6: Dada una cadena S y un entero K debe realizar lo siguiente:
1.- Generar todas las subcadenas consecutivas de longitud k que se 
    puedan obtener a partir de la cadena S.
2.- Comparar estas subcadenas alfabéticamente (orden lexicográfico).
3.- Mostrar: la subcadena más pequeña en orden alfabético y 
    la subcadena más grande en orden alfabético.
Las dos subcadenas deben imprimirse en líneas separadas.
Ejemplo: Entrada: S = welcometojava, K = 3
         Salida: ava
                 wel
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cadena S:");
        String cadenaS = scan.next();
        System.out.print("longitud K:");
        int longitudK = scan.nextInt();

        String primero = cadenaS.substring(0, longitudK);
        String ultimo = cadenaS.substring(0, longitudK);

        for (int i = 0; i <= cadenaS.length() - longitudK; i++) {
            String actual = cadenaS.substring(i, i + longitudK);
            if (actual.compareTo(primero) < 0) {
                primero = actual;
            }
            if(actual.compareTo(ultimo) > 0){
                ultimo = actual;
            }
        }
        System.out.println(primero);
        System.out.println(ultimo);
        scan.close();
    }
}

//  Ejemplo 2: Entrada : S=holaalexisdev, K=4 
//             Salida: aale
//                     xisd

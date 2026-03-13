package com.ejercicio5;

import java.util.Scanner;

/*
Ejeccio 5: Dadas dos cadenas de letras minúsculas A y B, 
realiza las siguientes operaciones:
1. Suma las longitudes de A y B.
2. Determina si B va antes que A en el diccionario.
3. Escribe en mayúscula la primera letra de A y B e imprímelas 
en una sola línea, separadas por un espacio.
Ejemplo: cadena A = hola, cadena B = java
        Salida: 1.- longitud total = 8
                2.- cadena B va primero = No
                3.- Hola Java
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cadena A:");
        String cadenaA = scan.next();
        System.out.print("Ingrese la cadena B:");
        String cadenaB = scan.next();
        
        int longitudTotal = cadenaA.length() + cadenaB.length();
        System.out.println("1.- longitud total = " + longitudTotal);
        
        //2. Determina si B va antes que A en el diccionario.
        int comparacion = cadenaA.compareTo(cadenaB);
        System.out.print("2.- cadena B va primero = ");
        if(comparacion > 0){
              System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        // 3. Escribe en mayúscula la primera letra de A y B e imprímelas 
        //en una sola línea, separadas por un espacio.
        String mayusculaA = cadenaA.substring(0,1).toUpperCase();
        String mayusculaB = cadenaB.substring(0,1).toUpperCase();
        
        String unirA = mayusculaA + cadenaA.substring(1);
        String unirB = mayusculaB + cadenaB.substring(1);
        
        System.out.println("3.- "+ unirA+" "+ unirB);
        
        scan.close();
    }
}

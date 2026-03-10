package com.ejeccio2;

import java.util.Scanner;

/*
Ejeccicio 2: Dado un número entero N, debes determinar en qué tipos de datos 
primitivos de Java puede almacenarse.
Los tipos de datos que debes evaluar son: byte,short, int, long

- Si el número puede almacenarse en uno o más de estos tipos, 
debes mostrar todos los tipos posibles ordenados por tamaño.

- Si el número es demasiado grande o demasiado pequeño y no puede almacenarse 
en ninguno de estos tipos, imprime: N no puede almacenarse en ningún 
tipo de dato primitivo.

Ejemplo: entrada N= 150, salida= 150 puede almacenarse en:
                                * short
                                * int
                                * long
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Ingresa el numero N:");
            long numeroN = scan.nextLong();
            System.out.println(numeroN+" puede almacenarse en:");
            if (numeroN >= Byte.MIN_VALUE && numeroN <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (numeroN >= Short.MIN_VALUE && numeroN <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (numeroN >= Integer.MIN_VALUE && numeroN <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (numeroN >= Long.MIN_VALUE && numeroN <= Long.MAX_VALUE) {
                System.out.println("* long");
            }

        } catch (Exception e) {
            System.out.println(""
                    + "N no puede almacenarse en ningún tipo de dato primitivo"
            );
        }
        scan.close();
    }
}
/*
| Tipo  | Tamano  | Valor minimo               | Valor maximo              |
| ------| ------- | -------------------------- | ------------------------- |
| byte  | 8 bits  | -128                       | 127                       |
| short | 16 bits | -32,768                    | 32,767                    |
| int   | 32 bits | -2,147,483,648             | 2,147,483,647             |
| long  | 64 bits | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |
 */

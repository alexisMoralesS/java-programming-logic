package com.ejercicio10;

import java.math.BigInteger;
import java.util.Scanner;

/*
Ejercicio 10: Suma y multiplicación de números grandes
Dado dos números enteros no negativos muy grandes 
(cada uno puede tener hasta 200 dígitos),
debes calcular e imprimir:
1. La suma de ambos números.
2. El producto (multiplicación) de ambos números.
Restricciones:
- Solo dígitos (0-9)
- Máximo 200 dígitos por número
- No negativos
Ejemplo:  Entrada: A = 1234, B = 20
          Salida:  1254
                   24680
 */
public class Ejecutora {

    private static boolean esValido(String numero) {
        if (numero == null) {
            return false;
        }
        if (numero.isEmpty()) {
            return false;
        }
        boolean regex = numero.matches("^[0-9]{1,200}");
        if (!regex) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Numero A: ");
        String numeroA = scan.nextLine();
        System.out.print("Numero B: ");
        String numeroB = scan.nextLine();
        scan.close();
        if (!esValido(numeroA) || !esValido(numeroB)) {
            System.out.println("Error: numero no valido");
            return;
        }

        BigInteger numeroGrandeA = new BigInteger(numeroA);
        BigInteger numeroGrandeB = new BigInteger(numeroB);

        BigInteger suma = numeroGrandeA.add(numeroGrandeB);
        BigInteger multiplicacion = numeroGrandeA.multiply(numeroGrandeB);
        
        System.out.println(suma);
        System.out.println(multiplicacion);
    }
}

/*
Ejemplo: Entrada: A=123456789123456789, B = 100000000000000000
         Salida: 223456789123456789
                 12345678912345678900000000000000000


| Tipo  | Tamano  | Valor minimo               | Valor maximo              |
| ------| ------- | -------------------------- | ------------------------- |
| byte  | 8 bits  | -128                       | 127                       |
| short | 16 bits | -32,768                    | 32,767                    |
| int   | 32 bits | -2,147,483,648             | 2,147,483,647             |
| long  | 64 bits | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |
 */

package com.ejercicio7;

import java.util.Scanner;

/*
Ejercicio 7: Dada una cadena de texto A, determina si es un palíndromo, 
es decir, si se lee igual de izquierda a derecha que de 
derecha a izquierda.
Restricciones:
- La cadena solo contiene caracteres sin espacios.
- 1 ≤ |A| ≤ 1000
Ejemplo: Entrada: madam, Salida: Si
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la palabra: ");
        String textoA = scan.next();
        scan.close();
//        1 ≤ |A| ≤ 1000
        if(textoA.length() <1 || textoA.length() > 100){
            System.out.println("Error: longitud fuera de rango.");
            return;
        }
        if(textoA.contains(" ")){
            System.out.println("Error: la cadena tiene espacio.");
        }
        
        int izquierda = 0;
        int derecha =  textoA.length() - 1;
        
        boolean esPalindromo = true;
        
        while(izquierda < derecha){
            if(textoA.charAt(izquierda) != textoA.charAt(derecha)){
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        
        String resultado = esPalindromo ? "Si": "No";
        System.out.println(resultado);
        
    }
}
/*
Ejemplos :
    - reconocer
    - sometemos
    - oro
 */

/*
---------------------
| 0 | 1 | 2 | 4 | 5 |
---------------------
| m | a | d | a | m |
---------------------

-------------------------------------
| 0 | 1 | 2 | 4 | 5 | 6 | 7 | 8 | 9 |
-------------------------------------
| s | o | m | e | t | e | m | o | s |
-------------------------------------


*/
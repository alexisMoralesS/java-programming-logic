package com.ejercicio9;

import java.util.Scanner;

/*
Ejercicio 9: Dadas dos cadenas de texto A y B, determina si son anagramas.
Definición:
- Un anagrama es cuando dos cadenas contienen exactamente las mismas letras,
  en la misma cantidad, pero en diferente orden.
- No se consideran diferencias entre mayúsculas y minúsculas.
Objetivo:
- Leer dos cadenas de texto.
- Verificar si ambas contienen los mismos caracteres con la misma frecuencia.
- Imprimir "Anagramas" si son anagramas.
- Imprimir "No son anagramas" en caso contrario.
Restricciones:
- 1 ≤ |A|, |B| ≤ 1000
- Las cadenas solo contienen letras del alfabeto.
Ejemplo: Entrada: A = amor
                  B = roma
         Salida: Anagramas
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ingrese texto A: ");
        String textoA = scaner.nextLine();
        System.out.print("Ingrese texto B: ");
        String textoB = scaner.nextLine();
        scaner.close();

        if (textoA.length() != textoB.length()) {
            System.out.println("No son anagramas");
            return;
        }

        StringBuilder buscarTexto = new StringBuilder(textoB);

        for (int i = 0; i < textoA.length(); i++) {
            char caracterActual = textoA.charAt(i);

            int index = buscarTexto.indexOf(String.valueOf(caracterActual));

            if (index == -1) {
                break;
            }
            buscarTexto.deleteCharAt(index);
        }

        if (buscarTexto.length() == 0) {
            System.out.println("Anagramas");
        } else {
            System.out.println("No son anagramas");
        }

    }
}
/*
Entrada: A = ramo 
         B = mora
Salida: Anagramas
 */

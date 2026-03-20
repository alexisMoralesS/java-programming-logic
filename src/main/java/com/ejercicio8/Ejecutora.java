package com.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Ejercicio 8: Dada una cadena de texto S que contiene frases 
    en español, debes identificar y extraer todas las palabras válidas.
    Definición:
    - Una palabra es una secuencia continua de uno o más caracteres 
      alfabéticos.
    - Se consideran letras válidas todas las letras del alfabeto 
      (incluyendo mayúsculas y minúsculas).
    - Cualquier otro carácter (espacios, signos de puntuación, 
      símbolos, etc.) actúa como separador de palabras.
    Objetivo:
    - Imprimir la cantidad total de palabras encontradas.
    - Imprimir cada palabra en una nueva línea.
    Restricciones: 1 ≤ S ≤ 1000
    Ejemplo:
        Entrada: Hola, ¿cómo estás? Estoy aprendiendo Java!
        Salida: 6
                Hola
                cómo
                estás
                Estoy
                aprendiendo
                Java
 */
public class Ejecutora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String textS = sc.nextLine();
        
        List<String> palabrasEncontradas =  new ArrayList<>();
        StringBuilder palabraActual = new StringBuilder();
        
        for(int i= 0; i< textS.length(); i++){
               char caracterActual = textS.charAt(i);
               
               if(Character.isLetter(caracterActual)){
                   palabraActual.append(caracterActual);
               }else{
                   if(palabraActual.length() > 0){
                       palabrasEncontradas.add(palabraActual.toString());
                       palabraActual.setLength(0);
                   }
                   
               }
        }
        
        if(palabraActual.length() > 0){
            palabrasEncontradas.add(palabraActual.toString());
        }
        
        // - Imprimir la cantidad total de palabras encontradas.
        System.out.println(palabrasEncontradas.size());
        // - Imprimir cada palabra en una nueva línea.
        for(String palabra: palabrasEncontradas){
            System.out.println(palabra);
        }
        sc.close();
    }

}

/*
Ejemplo: ¡Hola!!! Bienvenido a AlexisDev... ¿Listo para programar?
 */

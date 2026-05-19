package com.ejercicio13;

import java.util.Scanner;

public class Ejecutora {
    /*
     * Ejercicio 13:
     * Una empresa de taxis necesita calcular el costo de un viaje.
     * Reglas:
     * 1.- Todo viaje inicia con una tarifa base de $ 8.00
     * 2.- Cada kilómetro recorrido cuesta $ 2.50.
     * 3.- Si el viaje ocurre en horario nocturno, se agrega un recargo del 20%.
     * 4.- El usuario debe ingresar: los kilómetros recorridos,
     * y si el viaje fue nocturno.
     * 
     * Crea un programa que:
     * calcule el subtotal del viaje,
     * calcule el recargo nocturno si corresponde,
     * y muestre el total final a pagar.
     */

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("============================");
            System.out.print("Kilometros recorridos: ");
            double kilometrosRecorridos = scan.nextDouble();
            System.out.print("Viaje nocturno (si/no):");
            String viajeNocturno = scan.next();
            System.out.println("============================");

            double costoKilometrosRecorridos = kilometrosRecorridos * 2.50;
            double subtotal = 8.0 + costoKilometrosRecorridos;
            double recargo = 0;
            if (viajeNocturno.equals("si")) {
                recargo = subtotal * 0.20;
            }
            double totalFinal = subtotal + recargo;

            System.out.println("============================");
            System.out.println("Subtotal: " + subtotal);
            System.out.printf("Recargo: %.2f%n", recargo);
            System.out.println("Total final:" + totalFinal);
            System.out.println("============================");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/*
 * Entrada:
 * - Kilómetros recorridos: 10
 * - Viaje nocturno: no
 * Salida:
 * - Subtotal: 33.0
 * - Recargo nocturno: 0.0
 * - Total final: 33.0
 * ------------------------------
 * Entrada:
 * - Kilómetros recorridos: 10
 * - Viaje nocturno: si
 * Salida:
 * - Subtotal: 33.0
 * - Recargo nocturno: 6.60
 * - Total final: 39.60
 */
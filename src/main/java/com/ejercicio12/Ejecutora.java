package com.ejercicio12;

import java.util.Scanner;

/*
Ejercicio 12:
Una empresa eléctrica necesita calcular el monto mensual 
que debe pagar un cliente según su consumo de energía.
Reglas:
1.- Los primeros 100 kWh cuestan $ 0.80 por kWh.
2.- Los siguientes 100 kWh cuestan $ 1.20  por kWh.
3.- Todo consumo mayor a 200 kWh cuesta $ 1.50  por kWh.
4.- Al total calculado se le debe agregar un impuesto del 18%.

Crea un programa que:
1.- solicite la cantidad de kWh consumidos,
2.- calcule el costo según los rangos,
3.- agregue el impuesto, y muestre el total final del recibo.
 */
public class Ejecutora {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Ingrese el consumo(kwh)");
            double consumo = scan.nextDouble();
            double costorRango1 = 0.80;
            double costorRango2 = 1.20;
            double costorRango3 = 1.50;
            double porcentajeImpuesto = 0.18;

            double totalRango1 = 0;
            double totalRango2 = 0;
            double totalRango3 = 0;

            if (consumo <= 100) {
                totalRango1 = consumo * costorRango1;
            }
            if (consumo > 100 && consumo <= 200) {
                totalRango1 = 100 * costorRango1;
                totalRango2 = (consumo - 100) * costorRango2;
            }
            if (consumo > 200) {
                totalRango1 = 100 * costorRango1;
                totalRango2 = 100 * costorRango2;
                totalRango3 = (consumo - 200) * costorRango3;
            }
            double subtotal = totalRango1 + totalRango2 + totalRango3;
            double impuesto = subtotal * porcentajeImpuesto;
            double total = subtotal + impuesto;

            System.out.println("==============================");
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Impuesto: " + impuesto);
            System.out.println("Total: " + total);
            System.out.println("==============================");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/*
 * Consumo: 80
 * Subtotal: 64.0
 * Impuesto: 11.52
 * Total final: 75.52
 * -----------------------------
 * Consumo: 150
 * Subtotal: 140.0
 * Impuesto: 25.2
 * Total final: 165.2
 * -----------------------------
 * Consumo: 250
 * Subtotal: 275.0
 * Impuesto: 49.5
 * Total final: 324.5
 */

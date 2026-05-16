package com.ejercicio11;

import java.util.Scanner;

/*
Ejercicio 11:
Una empresa paga a sus trabajadores según la cantidad de 
horas trabajadas con las siguientes reglas:
- Las primeras 40 horas se pagan normalmente.
- Las horas adicionales se consideran horas extras.
- Cada hora extra se paga al doble del pago por hora.

Crea un programa que:
- solicite el pago por hora.
- solicite la cantidad de horas trabajadas
  y muestre el salario total.

*/
public class Ejecutora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Pago por hora: ");
        double pagoHora = scan.nextDouble();
        
        System.out.print("Horas trabajadas:");
        int horasTrabajadas = scan.nextInt();
        
        double salarioTotal;
        int horasNormales = 40;
        
        if(horasTrabajadas <= horasNormales){
            salarioTotal = pagoHora * horasTrabajadas;
        } else{
         int horasExtras = horasTrabajadas - horasNormales;
         double pagoNormal = pagoHora * horasNormales;
         double pagoExtra = horasExtras * (pagoHora *2);
         
         salarioTotal = pagoNormal + pagoExtra;
        }
        
        System.out.println("Salario Total: " +salarioTotal);
        
        scan.close();

    }
}
/*
Pago por hora:10
Horas trabajadas: 50
Salario total: 600.0

Pago por hora:10
Horas trabajadas: 40
Salario total: 400.0
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author tania
 */
public class NumPar implements Runnable{

    @Override
    public void run() {
        int inicio = 1;
        int fin = 500;
        for (int i = inicio; i <= fin; i++) {
            // Verificar si el número es par usando el operador de módulo (%)
            if (i % 2 == 0) {
                // Si es par, imprimir el número
                System.out.println(i);
            }
        }
    }    
    }
 

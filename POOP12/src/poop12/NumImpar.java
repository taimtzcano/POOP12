/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author tania
 */
public class NumImpar implements Runnable{

    @Override
    public void run() {
        int limite = 10;
        for (int i = 1; i <= limite; i += 2) {
            System.out.println(i);
        }
    }
}

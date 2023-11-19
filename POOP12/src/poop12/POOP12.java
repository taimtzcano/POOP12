/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author tania
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HiloT hilo1 = new HiloT("Primer Hilo");
        hilo1.start();
        new Thread(new HiloR(), "Tercer Hilo").start();
        for(int i=0; i<10; i++){
            System.out.println("Iteracion "+i+" del main");
        }
        System.out.println("Termina el main ");
        
        new Thread(new HiloCeros(), "Hilos Ceros").start();
        new Thread(new HiloUnos(), "Hilos Unos").start();
        new Thread(new HiloCeros(), "Hilos Salto De Linea").start();
        new Thread(new NumPar(), "Numeros Par").start();
        new Thread(new NumImpar(), "Numeros Impar").start();
        /*
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
*/
    }
    
}

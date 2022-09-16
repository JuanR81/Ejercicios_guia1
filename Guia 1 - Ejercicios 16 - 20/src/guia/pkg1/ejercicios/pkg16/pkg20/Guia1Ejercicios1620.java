/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicios.pkg16.pkg20;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Guia1Ejercicios1620 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimension del vector");
        int n = leer.nextInt();
        double [] vector = new double [n];
        for (int i = 0; i < n; i++) {
            vector[i] = Math.random();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("["+vector[i]+"]");
        }
    }
    
}

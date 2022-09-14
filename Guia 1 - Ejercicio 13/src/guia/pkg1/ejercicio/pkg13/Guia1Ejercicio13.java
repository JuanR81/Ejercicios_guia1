/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg13;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Guia1Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String [] Equipo = new String [5];
        
        System.out.println("Ingrese el nombre de cada compañero");
        for (int i = 0; i < 5; i++) {
            Equipo [i] = leer.next();
        }
    
        System.out.println("Sus compañeros son ");
        for (int i = 0; i < 5; i++) {
            System.out.println(Equipo[i]);
        }
                }
}

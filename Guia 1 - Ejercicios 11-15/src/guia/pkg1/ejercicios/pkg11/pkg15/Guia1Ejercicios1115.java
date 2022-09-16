/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicios.pkg11.pkg15;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Guia1Ejercicios1115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //EJERCICIO 11
        
//        boolean opcsalir = false;
//        System.out.println("Ingrese dos numeros");
//        int num1 = leer.nextInt();
//        int num2 = leer.nextInt();
//        String opc = "";
//
//        do {
//            System.out.println("MENU");
//            System.out.println("1.Sumar");
//            System.out.println("2.Restar");
//            System.out.println("3.Multiplicar");
//            System.out.println("4.Dividir");
//            System.out.println("5.Salir");
//            System.out.print("Elija opción: ");
//            int opcion = leer.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("La sumatoria es " + (num1 + num2));
//                    break;
//                case 2:
//                    System.out.println("La resta es " + (num1 - num2));
//                    break;
//                case 3:
//                    System.out.println("La multiplicación es " + (num1 * num2));
//                    break;
//                case 4:
//                    System.out.println("La división es " + (num1 / num2));
//                    break;
//                case 5:
//                    System.out.println("Esta seguro que desea salir?");
//                    opc = leer.next();
//                    break;
//                default:
//                    System.out.println("La opción ingresada es incorrecta");
//            }
//
//            if ("s".equalsIgnoreCase(opc)) {
//                opcsalir = true;
//            }
//        } while (opcsalir == false);
        
            //EJERCICIO 12
                
//        int aux1 = 0;
//        int aux2 = 0;
//        String frase;
//        System.out.println("Ingrese una frase o palabra de 5 caracteres");
//        do {
//            
//            frase = leer.nextLine();
//            if (frase.length() == 5 && frase.substring(0, 1).equalsIgnoreCase("x") && frase.substring(4, 5).equalsIgnoreCase("o")) {
//                aux1++;
//            } else if (!frase.equals("&&&&&")) {
//                aux2++;
//            }
//        } while (!frase.equals("&&&&&"));
//
//        System.out.println("La cantidad de ingresos correctos es: " + aux1);
//        System.out.println("La cantidad de ingresos incorrectos es: " + aux2);
//        

            //EJERCICIO 13
            
//            String cuadrado;
//        int num;
//        System.out.println("Ingrese la dimensión del cuadrado");
//        num = leer.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                if (i == 0 || j == 0 || i == (num - 1) || j == (num - 1)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println("");
//        }
            
            //EJERCICIO 14
//        System.out.println("Ingrese la cantidad de euros a convertir");
//        double euros = leer.nextInt();
//        System.out.println("Elija la moneda de conversión (USD-JPY-GBP)");
//        String moneda = leer.next();
//        double cantidad = convertir(euros, moneda);
//        System.out.println(euros + " euros equivalen a " + cantidad + " " + moneda.toUpperCase());
//    }
//
//    public static double convertir(double euros, String moneda) {
//        double conversion = 0;
//
//        switch (moneda.toLowerCase()) {
//            case "jpy":
//                conversion = euros * 129.852;
//                break;
//            case "usd":
//                conversion = euros * 1.28611;
//                break;
//            case "gbp":
//                conversion = euros * 0.86;
//                break;
//            default:
//                System.out.println("La opción seleccionada es incorrecta");
//        }
//
//        return conversion;


            //EJERCICIO 15
//            
//        int[] vector = new int[100];
//
//        for (int i = 0; i < 100; i++) {
//            vector[i] = i + 1;
//        }
//        for (int i = 99; i >= 0; i--) {
//            System.out.print("[" + vector[i] + "]");
//        }
//        System.out.println("");
    }

  }

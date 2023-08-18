/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import java.util.Scanner;

/**
 *
 * @author CesarLopez
 */
public class ejercicio1 {
public static void main(String[] args) {    
Scanner sp = new Scanner(System.in);
    int numeros [][] = new int [1][2];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("ingrese tu numero");
                numeros[i][j] = sp.nextInt();
        }
}
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++){
               
                System.out.print(numeros[i][j]+" | ");
            }
            System.out.println("\n-------------------");
                }

}}

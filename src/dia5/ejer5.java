/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

/**
 *
 * @author CesarLopez
 */
public class ejer5 {
    public static void main(String[] args) {
     //numeros del 1 al 100 en filas de 5 (1-2-3-4-5)(6-7-8-9-10)
        int numeros [][] = new int [20][5];
    int ayuda =1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros [i][j] = ayuda++;
                int[] numero = numeros[j];
                System.out.printf("%-9s",numeros[i][j]+ " | ");
            
        }
           System.out.println("\n-----------------------------------------");
        }
    }}

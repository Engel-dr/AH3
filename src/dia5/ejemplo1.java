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
public class ejemplo1 {
    public static void main(String[] args) {
        // TODO code application logic here
    int numeros [][] = new int [8][8];
    int ayuda =64;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros [i][j] = ayuda--;
                int[] numero = numeros[j];
                System.out.print(numeros[i][j]+ " | ");
            
        }
            System.out.println("");
        }}}

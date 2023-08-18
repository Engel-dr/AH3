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
public class ejer2 {
     public static void main(String[] args) {
  //numeros impares del 0 al 100
         int numeros[] = new int[50];
  int dato =1;
      for (int i = 0; i < 50; i++) {
          numeros[i] = dato;
          dato+=2;
          System.out.print(numeros[i]+" | ");
      }
  }
}

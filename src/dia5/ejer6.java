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
public class ejer6 {
 public static void main(String[] args) {
  String[][] datos = new String[3][5];
// Mostrar en la primera fila nombre, apellido,telefono,cumpleaños,DPI y luego los datos
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Ingrese los datos en la siguiente columnas de la forma y orden. " +" (No.filas) " + i + "  Nombre,Apellido,telefono(xxxx-xxxx),cumpleaños(xx/xx/xxxx) y DPI(xxxx-xxxxx-xxxx). "+ " (No.columnas) " + j);
                datos[i][j] = sc.next();
            }
        }

       
        System.out.print("Nombre | Apellido | Teléfono | Cumpleaños | DPI |");
        System.out.println("\n--------------------------------------------------------------");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%-9s",datos[i][j] + " | ");
            }
            System.out.println("\n--------------------------------------------------------------");
        }
 }
}

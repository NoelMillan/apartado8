/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado8;

/**
 *
 * @author noelm
 */
import java.util.Scanner;
import misfunciones.Funciones;
public class Ejercicio37 {
  public static void main(String[] args) {
    int[] numeros = {213, 0, 11, 24, 86};
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + Funciones.convierteEnMorse(numero));
      System.out.println(" en morse.");
    }
  }
}
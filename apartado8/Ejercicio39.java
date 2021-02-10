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
public class Ejercicio39 {
  public static void main(String[] args) {
    int[] numeros = {470213, 2130, 9, 1124, 86};
    for (int numero : numeros) {
      System.out.println(numero);
      System.out.println(Funciones.convierteEnPalabras(numero) + "\n");
    }
  }
}
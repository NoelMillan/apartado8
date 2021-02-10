/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author noelm
 */
import java.util.Scanner;
import misfunciones.Funciones;
public class Ejercicio48 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    for (int e : Funciones.concatena(a, b)) {
      System.out.print(e);
    }
  }
}
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
public class Ejercicio36 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] numeros = Funciones.generaArrayInt(20, 1, 100);
    for(int num : Funciones.filtraPrimos(numeros)){
      System.out.print(num + " ");
    }
  }
}
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
import misfunciones.Funciones;
import misfunciones.Funciones;
public class Ejercicio15 {
  public static void main(String[] args) {
    int num = 0;
    while(num < 1000){
      if(Funciones.esPrimo(num) == true){
        System.out.print(num + " ");
      }
      else{
        System.out.print("");
      }
      num++;
    }
  }
}
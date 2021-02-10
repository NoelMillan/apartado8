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
public class FuncionesExamen {
  public static void muestraArray(int x[]) {
    for (int i = 0; i < x.length; i++){
      System.out.print(x[i] + " ");
    }
    System.out.println();
  }
  
  public static boolean contiene(int [] a, int n){
    for (int numero : a){
      if(numero == n){
        return true;
      }
    }
    return false;
  }
}

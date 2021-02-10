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
public class Ejercicio38 {
  public static void main(String[] args) {
    int[] numeros = Funciones.generaArrayInt(20, 1, 1000);
    System.out.println("Array original: ");
    for(int num:numeros){
      System.out.print(num + " ");
    }
    System.out.println("");
    System.out.println("Capicúas: ");
    for(int num2:Funciones.filtraCapicuas(numeros)){
    System.out.print(num2 + " ");
    }
  }
}
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
public class Ejercicio42 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = entrada.nextInt();
    System.out.println(Funciones.linea('*', num));
    int contador = 1;
    while(contador < num){
      System.out.print("*" + Funciones.linea(' ', num - contador - 2));
      if(contador < num - 1){
        System.out.println("*");
      }
      contador++;
    }
    System.out.println("");
  }
}
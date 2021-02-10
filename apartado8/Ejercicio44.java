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
public class Ejercicio44 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = entrada.nextInt();
    int contador = 0;
    System.out.println(Funciones.linea('*', num));
    while(contador < num - 1){
      System.out.print(Funciones.linea(' ', contador + 1));
      System.out.print("*");
      if(contador < num - 2){
        System.out.print(Funciones.linea(' ', num - contador - 3));
        System.out.println("*");
      }
      contador++;
    }
  }
}
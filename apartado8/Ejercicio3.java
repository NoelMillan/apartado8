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
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = entrada.nextInt();
    int contador = 2;
    if(Funciones.esPrimo(num) == false){
      System.out.println("El número introducido no es primo");
    }
    else{
      num++;
      while(Funciones.esPrimo(num) == false){
        num++;
      }
      System.out.println("El número primo siguiente al introducido es " + num);
    }
  }
}

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
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = entrada.nextInt();
    System.out.print("Introduzca la posición inicial del número: ");
    int inicial = entrada.nextInt();
    System.out.print("Introduzca la posicion final del número: ");
    int finall = entrada.nextInt();
    System.out.println(Funciones.trozoDeNumero(num, inicial, finall));
  }
}
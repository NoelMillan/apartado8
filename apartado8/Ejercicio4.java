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
public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int base = entrada.nextInt();
    System.out.print("Introduzca su exponente: ");
    int exponente = entrada.nextInt();
    System.out.println("La potencia de base " + base + " y exponente " + exponente + " es " + Funciones.potencia(base, exponente));
  }
}
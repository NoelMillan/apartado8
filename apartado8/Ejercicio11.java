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
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = entrada.nextInt();
    System.out.print("Introduzca el número que quieras poner por la derecha: ");
    int num2 = entrada.nextInt();
    System.out.println(Funciones.pegaPorDetras(num, num2));
  }
}
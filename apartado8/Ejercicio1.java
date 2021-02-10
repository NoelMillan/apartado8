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
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    int a = entrada.nextInt();
    if(Funciones.esCapicua(a) == true){
      System.out.println("El número es capicúa");
    }
    else{
      System.out.println("El número no es capicúa");
    }
  }
}
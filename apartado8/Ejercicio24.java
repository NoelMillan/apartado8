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
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de números generados: ");
    int n = entrada.nextInt();
    System.out.print("Introduzca el número máximo permitido: ");
    int maximo = entrada.nextInt();
    System.out.print("Introduzca el número mínimo permitido: ");
    int minimo = entrada.nextInt();
    int [] num = Funciones.generaArrayInt(n, minimo, maximo);
    for(int numero : num){
      System.out.print(numero + " ");
    }
    System.out.println("");
    System.out.print("Introduzca un número para saber si pertenece al array: ");
    int numArray = entrada.nextInt();
    if(Funciones.estaEnArrayInt(num, numArray)){
      System.out.println("El número introducido pertenece al array");
    }
    else{
      System.out.println("El número introducido no pertenece al array");
    }
  }
}
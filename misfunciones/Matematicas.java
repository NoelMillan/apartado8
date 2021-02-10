/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 * Funciones matemáticas
 * @author noelm
 */
public class Matematicas {
  
  /**
   * Calcula la media de tres números
   * 
   * @param num1 número que puede contener decimales
   * @param num2 número que puede contener decimales
   * @param num3 número que puede contener decimales
   * @return media de numero1, numero2, numero3
   */
    public static double mediaDeTresNumeros(double num1, double num2, double num3) {
    double media = (num1 + num2 + num3) / 3;
    return media;
  }
    /**
     * Calcula la media aritmética de los números de un array
     * 
     * @param num array con los números con los que se quiere calcular la media
     * @return la media aritmética de los números del array
     */
  public static double mediaDeNumerosEnArray(double [] num) {
    double suma = 0;
    for(double numero : num){
      suma += numero;
    }
    double media = suma / num.length;
    return media;
  }
  /**
   * Genera un número entero aleatorio.
   * 
   * @param minimo mínimo valor posible
   * @param maximo máximo valor posible
   * @return un aleatorio en un intervarlo
   */
  public static int aleatorio(int minimo, int maximo){
    return (int)(Math.random() * (maximo - minimo + 1) + minimo);
  }
}
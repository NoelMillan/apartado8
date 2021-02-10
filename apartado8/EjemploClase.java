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
import misfunciones.FuncionesExamen;
public class EjemploClase {
  public static void main(String[] args) {
    int[] a = {3, 8, 9, 33, 3, 9, 10};
    int[] b = {12, 12, 12, 12, 12, 12, 12, 12};
    FuncionesExamen.muestraArray(a);
    FuncionesExamen.muestraArray(quitaRepetidos(a));
    FuncionesExamen.muestraArray(b);
    FuncionesExamen.muestraArray(quitaRepetidos(b));
  }
  public static long quitaRepetidos(long n) {
    return 0;
  } 
  public static int quitaRepetidos(int n) {
    return 0;
  }
  public static int[] quitaRepetidos(int[] a) {
    int aux[] = new int [a.length];
    int i = 0;
    for (int numero : a) {
      if(!FuncionesExamen.contiene(aux, numero)){
        aux[i++] = numero;
      }
    }
    int[] resultado = new int [i];
    for (int j = 0; j < i; j++){
      resultado[j] = aux[j];
    }
    return resultado;
  }
}
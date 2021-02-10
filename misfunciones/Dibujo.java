/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author noelm
 */
public class Dibujo {
  public static String linea(int longitud){
    String resultado = "";
    int contador = 0;
    while(contador < longitud){
      resultado += "*";
      contador++;
    }
    return resultado;
  }
  public static String rectangulo(int ancho, int alto){
    String resultado = "";
    int contador = 0;
    while(contador < alto){
      resultado += linea(ancho) + "\n";
      contador++;
    }
    return resultado;
  }
  public static String linea(int longitud, char caracter){
    String resultado = "";
    int contador = 0;
    while(contador < longitud){
      resultado += caracter;
      contador++;
    }
    return resultado;
  }
}

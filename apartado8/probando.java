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
import misfunciones.Matematicas;
import misfunciones.Dibujo;
public class probando {
  public static void main(String[] args) {
    System.out.println(Matematicas.aleatorio(1, 6));
    System.out.println(Dibujo.linea(8));
    System.out.println(Dibujo.rectangulo(6, 4));
    System.out.println(Dibujo.linea(12, 'ñ'));
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduzca el primer número: ");
    double num1 = Double.parseDouble(entrada.next());
    System.out.print("Introduzca el segundo número: ");
    double num2 = Double.parseDouble(entrada.next());
    System.out.print("Introduzca el tercer número: ");
    double num3 = Double.parseDouble(entrada.next());
    System.out.println(Matematicas.mediaDeTresNumeros(num1, num1, num3));
    double [] notas = {4.6, 7.8, 9, 5, 10, 3.2};
    System.out.println(Matematicas.mediaDeNumerosEnArray(notas));
  }
}
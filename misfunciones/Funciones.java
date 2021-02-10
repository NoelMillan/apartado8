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
public class Funciones {
  public static boolean esCapicua(int num){
    int n = num;
    int ultimacifra = 0;
    int voltear = 0;
    while(n > 0){
      ultimacifra = n % 10;
      n = n / 10;
      voltear = (voltear * 10) + ultimacifra;
    }
    if(num == voltear){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean esPrimo(int num){
    int contador = 2;
    boolean esPrimo = true;
    while(contador < num){
      if(num % contador == 0){
        esPrimo = false;
      }
      contador++;
    }
    return esPrimo;
  }
  public static double potencia(double base, double exponente){
    double potencia = Math.pow(base, exponente);
    return potencia;
  }
  public static long digitos(long num){
    long n = num;
    int contador = 0;
    while(n > 0){
      n = n / 10;
      contador++;
    }
    return contador;
  }
  public static int voltea(int num){
    int ultimaCifra = 0;
    int n = num;
    int voltea = 0;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    return voltea;
  }
  public static int digitoN(int num, int digito){
    int ultimaCifra = 0;
    int n = num;
    int voltea = 0;
    int contador = 0;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
      contador++;
    }
    while(digito > 0){
      ultimaCifra = voltea % 10;
      voltea = voltea / 10;
      n = (n * 10) + ultimaCifra;
      digito--;
    }
    n = n % 10;
    return n;
  }
  public static int posicionDeDigito(int num, int digito){
    int ultimaCifra = 0;
    boolean coincide = false;
    int n = num;
    int voltea = 0;
    int contador = -1;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    while(voltea > 0 && coincide == false){
      ultimaCifra = voltea % 10;
      voltea = voltea / 10;
      n = (n * 10) + ultimaCifra;
      contador++;
      if(ultimaCifra == digito){
        coincide = true;
      }
    }
    return contador;
  }
  public static int quitaPorDetras(int num, int digito){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num;
    int contador = 0;
    int d = digito;
    while(contador < digito){
      d = d * 10;
      contador++;
    }
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    int numero = 0;
    while(voltea > d){
      ultimaCifra = voltea % 10;
      numero = (numero * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    return numero;
  }
  public static int quitaPorDelante(int num, int digito){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num;
    int contador = 0;
    int d = digito;
    while(contador < digito){
      d = d * 10;
      contador++;
    }
    while(n > d){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    int numero = 0;
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      numero = (numero * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    return numero;
  }
  public static int pegaPorDetras(int num, int digito){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      n = (n * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    n = (n * 10) + digito;
    return n;
  }
  public static int pegaPorDelante(int num, int digito){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    n = digito;
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      n = (n * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    return n;
  }
  public static int trozoDeNumero(int num, int inicial, int finall){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num;
    int contador = 1;
    int d = inicial;
    while(contador < inicial){
      d = d * 10;
      contador++;
    }
    while(n > d){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    int numero = 0;
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      numero = (numero * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    int d2 = finall;
    int contador2 = 2;
    while(contador2 < finall){
      d2 = d2 * 10;
      contador2++;
    }
    while(numero > d2){
      numero = numero / 10;
    }
    return numero;
  }
  public static int juntaNumeros(int num1, int num2){
    int ultimaCifra = 0;
    int voltea = 0;
    int n = num1;
    while(n > 0){
      ultimaCifra = n % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n = n / 10;
    }
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      n = (n * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    int n2 = num2;
    voltea = 0;
    while(n2 > 0){
      ultimaCifra = n2 % 10;
      voltea = (voltea * 10) + ultimaCifra;
      n2 = n2 / 10;
    }
    while(voltea > 0){
      ultimaCifra = voltea % 10;
      n = (n * 10) + ultimaCifra;
      voltea = voltea / 10;
    }
    return n;
  }
  public static long binarioDecimal(long num){
    long ultimaCifra = 0;
    long n = num;
    long decimal = 0;
    long contador = 0;
    while(n > 0){
      ultimaCifra = n % 10;
      decimal += ultimaCifra * (int)Math.pow(2, contador);
      contador++;
      n = n / 10;
    }
    return decimal;
  }
  public static long decimalBinario(long num){
    long ultimaCifra = 0;
    long n = num;
    long contador = 0;
    long binario = 0;
    while(n > 0){
      ultimaCifra = n % 2;
      binario += ultimaCifra * (long)Math.pow(10, contador);
      contador++;
      n = n / 2;
    }
    return binario;
  }
  public static int[] generaArrayInt(int n, int minimo, int maximo){
    int[] num = new int[n];
    int contador = 0;
    while(contador < n){
      num[contador] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
      contador++;
    }
    return num;
  }
  public static int minimoArrayInt(int[] num){
    int contador = 0;
    int min = Integer.MAX_VALUE;
    for(int numero : num){
      if(num[contador] < min){
        min = numero;
      }
      contador++;
    }
    return min;
  }
  public static int maximoArrayInt(int[] num){
    int contador = 0;
    int max = Integer.MIN_VALUE;
    for(int numero : num){
      if(num[contador] > max){
        max = numero;
      }
      contador++;
    }
    return max;
  }
  public static int mediaArrayInt(int[] num){
    int contador = 0;
    int suma = 0;
    for(int numero : num){
      suma += numero;
      contador++;
    }
    suma = suma / contador;
    return suma;
  }
  public static boolean estaEnArrayInt(int[] num, int n){
    boolean estaEnArray = false;
    for(int numero : num){
      if(n == numero){
        estaEnArray = true;
      }
    }
    return estaEnArray;
  }
  public static int posicionEnArray(int[] num, int n){
    int contador = 0;
    for(int numero : num){
      if(n == numero){
        break;
      }
      contador++;
    }
    return contador;
  }
  public static int[] volteaArrayInt(int[] num){
    int [] numfinal = new int [num.length];
    int contador = 0;
    while(contador < num.length){
      numfinal[num.length - contador - 1] = num[contador];
      contador++;
    }
    return numfinal;
  }
  public static int[] rotaDerechaArrayInt(int[] num, int n){
    int[] numderecha = num.clone();
    int contador = 0;
    int numfinal;
    while (n > 0) {
      numfinal = numderecha[numderecha.length - 1];
      contador = numderecha.length - 1;
      while(contador > 0) {
        numderecha[contador] = numderecha[contador - 1];
        contador--;
      }
      numderecha[0] = numfinal;
      n--;
    }
    return numderecha;
  }
  public static int[] rotaIzquierdaArrayInt(int[] num, int n){
    int[] numizquierda = num.clone();
    int contador = 0;
    int numfinal;
    while (n > 0) {
      numfinal = numizquierda[0];
      contador = 0;
      while(contador < numizquierda.length - 1) {
        numizquierda[contador] = numizquierda[contador + 1];
        contador++;
      }
      numizquierda[numizquierda.length - 1] = numfinal;
      n--;
    }
    return numizquierda;
  }
  public static String convierteEnPalotes(int n){
    String palo = "";
    int contador = 0;
    int contador2 = 0;
    if(n == 0){
      palo += "-";
    }
    while(contador <= digitos(n)){
      contador2 = 0;
      while(contador2 < digitoN(n, contador)){
        palo += "|";
        contador2++;
      }
      if(contador < digitos(n) && contador >= 1){
        palo += "-";
      }
      contador++;
    }
    return palo;
  }
  public static int[] filtraPrimos(int n[]){
    int[] num = new int [n.length];
    int contador = 0;
    for(int numero : n){
      if((numero % 2) != 0){
        num[contador] = numero;
        contador++;
      }
    }
    int[] primos = new int [contador];
    int contador2 = 0;
    while(contador2 < contador){
      primos[contador2] = num[contador2];
      contador2++;
    }
    return primos;
  }
  public static String convierteEnMorse(int n){
    String morse = "";
    int ultimaCifra = 0;
    int voltear = 0;
    int num = n;
    while(num > 0){
      ultimaCifra = num % 10;
      voltear = (voltear * 10) + ultimaCifra;
      num = num / 10;
    }
    if(n == 0){
      morse += "-----";
    }
    while(voltear > 0){
      ultimaCifra = voltear % 10;
      switch (ultimaCifra){
        case 0:
          morse += "-----";
          break;
        case 1:
          morse += ".----";
          break;
        case 2:
          morse += "..---";
          break;
        case 3:
          morse += "...--";
          break;
        case 4:
          morse += "....-";
          break;
        case 5:
          morse += ".....";
          break;
        case 6:
          morse += "-....";
          break;
        case 7:
          morse += "--...";
          break;
        case 8:
          morse += "---..";
          break;
        case 9:
          morse += "----.";
          break;
      }
      voltear = voltear / 10;
    }
    return morse;
  }
  public static int[] filtraCapicuas(int x[]){
    int [] num = new int [x.length];
    int contador = 0;
    for(int numero : x){
      if(Funciones.esCapicua(numero)){
        num[contador] = numero;
        contador++;
      }
    }
    int contador2 = 0;
    int[] capicua = new int [contador];
    while(contador2 < contador){
      capicua[contador2] = num[contador2];
      contador2++;
    }
    return capicua;
  }
  public static String convierteEnPalabras(int n){
    String palabra = "";
    int ultimaCifra = 0;
    int voltear = 0;
    int num = n;
    int contador = 0;
    while(num > 0){
      ultimaCifra = num % 10;
      voltear = (voltear * 10) + ultimaCifra;
      num = num / 10;
      contador++;
    }
    int contador2 = 0;
    while(voltear > 0){
      ultimaCifra = voltear % 10;
      switch (ultimaCifra){
        case 0:
          palabra += "cero";
          break;
        case 1:
          palabra += "uno";
          break;
        case 2:
          palabra += "dos";
          break;
        case 3:
          palabra += "tres";
          break;
        case 4:
          palabra += "cuatro";
          break;
        case 5:
          palabra += "cinco";
          break;
        case 6:
          palabra += "seis";
          break;
        case 7:
          palabra += "siete";
          break;
        case 8:
          palabra += "ocho";
          break;
        case 9:
          palabra += "nueve";
          break;
      }
      if(contador2 < contador - 1){
        palabra += ", ";
      }
      contador2++;
      voltear = voltear / 10;
    }
    return palabra;
  }
  public static int[] filtraCon7(int x []){
    int[] num = new int [x.length];
    int contador = 0;
    for(int numero : x){
      if(numero % 7 == 0){
        num[contador] = numero;
        contador++;
      }
    }
    int contador2 = 0;
    int[] numero7 = new int[contador];
    while(contador2 < contador){
      numero7[contador2] = num[contador2];
      contador2++;
    }
    return numero7;
  }
  public static String linea(char caracter, int x){
    String resultado = "";
    int contador = 0;
    while(contador < x){
      resultado += caracter;
      contador++;
    }
    return resultado;
  }
  public static String convierteArrayEnString(int[] a){
    String numletra = "";
    for(int num : a){
      numletra += num;
    }
    return numletra;
  }
  public static int[] concatena(int[] a, int[] b){
    int[] resultado = new int[a.length + b.length];
    int contador = 0;
    while(contador < a.length){
      resultado[contador] = a[contador];
      contador++;
    }
    contador = 0;
    while(contador < b.length){
      resultado[contador + a.length] = b[contador];
      contador++;
    }
    return resultado;
  }
}
package com.Susana;

import javax.swing.*;
/**
 * @author Susana Santos
 * @version 20.02.2024
 */
public class Calculadora {
  /**
   * Opción SUMA
   */
  public final static int SUMA=1;
  /**
   * Opción RESTA
   */
  public final static int RESTA=2;
  /**
   * Opción MULTIPLICACIÓN
   */
  public final static int MULTIPLICACION=3;
  /**
   * Opción DIVISIÓN
   */
  public final static int DIVISION=4;
  /**
   * Opción RAIZ_CUADRADA
   */
  public final static int RAIZ_CUADRADA=5;
  /**
   * Opción RAIZ_CUBICAQ
   */
  public final static int RAIZ_CUBICA=6;

  /**
   * Método para realizar las operaciones
   * @param dato1 primer número tipo float
   * @param dato2 segundo número tipo float
   * @param opcion opcion de operación a realizar
   * @return resultado de tipo float
   **/
  public static Float opcion(Integer opcion, Float dato1, Float dato2, Double indice, Double radicando) {
    float resultado = 0.0f;
    switch (opcion) {
      case 1:
        //Suma
        resultado = dato1 + dato2;
        break;
      case 2:
        //Resta
        resultado = dato1 - dato2;
        break;
      case 3:
        //Multiplicación
        resultado = dato1 * dato2;
        break;
      case 4:
        //División
        if(dato2>0) {
          resultado = dato1 / dato2;
        }else
          JOptionPane.showMessageDialog(null,"No se puede dividir entre cero","No válido",JOptionPane.ERROR_MESSAGE);
        break;
      case 5:
        //Raiz Cuadrada
        if(radicando>0) {
          resultado = (float) Math.sqrt(radicando);
        } else
          JOptionPane.showMessageDialog(null,"No se puede realizar operación");
        break;
      case 6:
        //Raiz Cubica
        if(radicando>0){
          final double pow = Math.pow(radicando, (double) 1/3);
          resultado = (float) pow;
        } else
          JOptionPane.showMessageDialog(null,"No se puede realizar operación");
        break;
      default:
        //El null nos sirve para hacer condiciones en lugar de try-catch para el retorno
        resultado = null;
        break;
    }
    return resultado;
  }
}

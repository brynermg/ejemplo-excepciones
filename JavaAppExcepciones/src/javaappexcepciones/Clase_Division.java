/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappexcepciones;

import java.util.Scanner;

/**
 *
 * @author Bryner
 */
public class Clase_Division {
  public static void main (String[] args){
      try {
          int Valor1, Valor2, vresultado;
    Scanner entrada = new Scanner (System.in);
    
    System.out.print("Primer valor:    ");
    
        Valor1 = entrada.nextInt();
    
    System.out.print("Primer valor:    ");
    
        Valor2 = entrada.nextInt();
    
    vresultado = Valor1 / Valor2;
    
    System.out.print("resultado es : " + vresultado );
          
      } catch (Exception e) {
          System.out.print("ERROR" + e);
      }
      finally{
      System.out.print(" Operacion exitosa!! ");
      
      }
  }
  
}

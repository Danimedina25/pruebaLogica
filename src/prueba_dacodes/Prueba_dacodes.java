/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_dacodes;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prueba_dacodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese el numero de casos de prueba");
        int t = Integer.valueOf(myObj.nextLine());
        String Array_entrada[] = new String [t];
        String Array_salida[] = new String [t];
        String posicion_final="";
        
        for(int i=0; i<t; i++){
              System.out.println("Ingrese número de filas del caso "+(i+1));
              int n = Integer.valueOf(myObj.nextLine());
              System.out.println("Ingrese número de columnas del caso "+(i+1));
              int m = Integer.valueOf(myObj.nextLine());
              Array_entrada[i]= String.valueOf(n)+","+String.valueOf(m);
              
                         if (m == 1 && n > m) {
                               posicion_final="D";    
                          }
                    else if (n == m) {
                            if (n % 2== 0) {
                                posicion_final="L";
                            }
                            else {
                                posicion_final="R";
                            }	
                    }
                    else if (n > m && m > 1) {
                            if (m % 2 == 0) {
                                posicion_final="U";
                            }
                            else {
                                posicion_final="D";
                            }
                    }
                    else if (m > n) {
                            if (n % 2 == 0) {
                                posicion_final="L";
                            }
                            else {
                                posicion_final="R";
                            }
                    }
                
                Array_salida[i]=posicion_final;
        }

   //Imprimir datos de entrada
        System.out.println();
        System.out.println("Entrada:");
        System.out.println("T:"+t);
        for(int a=0; a<t;a++){
            System.out.println(Array_entrada[a]);
        }
        
        //Imprimir datos de salida
        System.out.println();
        System.out.println("Salida:");
        for(int b=0; b<t;b++){
            System.out.println(Array_salida[b]);
        }
        

}

}

             
             
         
             
              
        
        
    
     
        
        
  

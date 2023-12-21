/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        double[][] datos = new double[2][2];

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.printf("ingrese un valor en posición %d,%d\n"
                        , fila, col);
                int valor = entrada.nextInt();
                if ((valor >= 1000) && (valor <= 1199)) {
                    datos[fila][col]= valor;
                } else {
                    datos[fila][col] = 10;
                    contador = contador + 1;
                }
            }
        }

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                double valor = datos[fila][col];
                System.out.printf("fila[%d] columna[%d] = %.2f\n",
                        fila, col, valor);
            }
        }
        System.out.printf("Se agrego un valor fuera de rango %d veces"
                ,contador);
    }

}
    


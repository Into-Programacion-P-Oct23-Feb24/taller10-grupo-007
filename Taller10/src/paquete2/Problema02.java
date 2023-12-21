/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};

        double suma = 0;

        for (int fila = 0; fila < ventas.length; fila++) {
            for (int columna = 0; columna < ventas[fila].length; columna++) {
                System.out.printf("Ingrese las ventas diarias "
                        + "de: %s\n", vendedores[fila]  );
                ventas[fila][columna] = entrada.nextDouble();

                suma = suma + ventas[fila][columna];
            }
        }
        for (int fila = 0; fila < ventas.length; fila++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[fila]);
        }
        System.out.printf("Han realizado un total de $%.2f en ventas\n", suma);

    }
}

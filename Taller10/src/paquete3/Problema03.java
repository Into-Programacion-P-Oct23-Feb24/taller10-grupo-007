/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        String acumulador = "";
        for (int fila = 0; fila < notasCualitativas.length; fila++) {
            for (int columna = 0; columna < notasCualitativas[fila].length; columna++) {
                double valor = notasCuantitativas[fila][columna];
                if (valor >= 0 && valor < 3) {
                    notasCualitativas[fila][columna] = "Insuficiente";
                } else {
                    if (valor >= 3 && valor < 5) {
                        notasCualitativas[fila][columna] = "Regular";
                    } else {
                        if (valor >= 5 && valor < 8) {
                            notasCualitativas[fila][columna] = "Bueno";
                        } else {
                            if (valor >= 8 && valor < 9.5) {
                                notasCualitativas[fila][columna] = "Muy Bueno";
                            } else {
                                notasCualitativas[fila][columna] = "Sobresaliente";
                            }
                        }
                    }
                }
            }
        }
        for (int fila = 0; fila < notasCualitativas.length; fila++) {
            for (int columna = 0; columna < notasCualitativas[fila].length; columna++) {
                double valor = notasCuantitativas[fila][columna];
                String calificacion = notasCualitativas[fila][columna];
                acumulador = String.format("%sNota: %.2f tiene un valor "
                        + "cualitativo de: %s\n", acumulador,valor,
                calificacion);
            }
        }
        System.out.printf ("%s",acumulador);
    }
}

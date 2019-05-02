/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.ferramentas;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Avery
 */
public class Utilitarios {

    public static double somatorio(double[] vetor, int start) {
        //int start = 0;
        int end = vetor.length;
        double soma = 0;

        double[] slice = Arrays.copyOfRange(vetor, start, end + 1);

        for (double row : slice) {

            soma += row;
        }

        return soma;
    }

}


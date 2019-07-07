/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.ferramentas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
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
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
 
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
}
    public static String monetario(double value){
        BigDecimal valor = new BigDecimal (value);  
        NumberFormat nf = NumberFormat.getCurrencyInstance();  
        String formatado = nf.format (valor);
        return formatado;
        //O resultado é R$ 12.000.000,12
    }

}


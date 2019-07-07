/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.ferramentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication2.ferramentas.Tabua;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author Avery
 */
public class Seguro {

    //seguro vitalício diferido ou não, de acordo com o parâmetro
    
    /*
    O método getAnuidadeTemporária calcula o prêmio de uma anuidade temporária, podendo ser diferida ou não, de acordo
    com a indicação dos parâmetros.
    A soma do parâmetro idade + diferimento + duracao não pode ser superior a dimensão do vetor (qx+1) do contrário haverá 
    erro de execução.
    
    Todos os parâmetros são obrigatórios em cada método. Para anuidades imediatas o usuário deverá atribuir o valor
    zero ao parâmetro diferimento.
     */
    
    public static double getSeguroVitalicio(int idade, double beneficio, double taxaJuros, int diferimento) {
        double res = 0;
        try {
            res = (Tabua.setMx(taxaJuros)[diferimento + idade] / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }
    public static double getSeguroVitalicio(int idade, double beneficio, double taxaJuros) {
        double res = 0;
        try {
            res = (Tabua.setMx(taxaJuros)[idade] / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }

    //cálculo para seguro temporário
    public static double getSeguroTemporario(int idade, int duracao, double beneficio, double taxaJuros, int diferimento) {
        double res = 0;
        try {
            res = ((Tabua.setMx(taxaJuros)[diferimento + idade] - Tabua.setMx(taxaJuros)[diferimento + idade + duracao]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }
    
    public static double getSeguroTemporario(int idade, int duracao, double beneficio, double taxaJuros) {
        double res = 0;
        try {
            res = ((Tabua.setMx(taxaJuros)[idade] - Tabua.setMx(taxaJuros)[idade + duracao]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }

    //calcula o prêmio único puro de um seguro dotal (diferido e imediato)
    public static double getSeguroDotal(int idade, int duracao, double beneficio, double taxaJuros, int diferimento) {
        double res = 0;
        try {
            res = ((Tabua.setMx(taxaJuros)[diferimento + idade] - Tabua.setMx(taxaJuros)[diferimento + idade + duracao] + Tabua.setDx(taxaJuros)[idade + duracao + diferimento]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }
    
    public static double getSeguroDotal(int idade, int duracao, double beneficio, double taxaJuros) {
        double res = 0;
        try {
            res = ((Tabua.setMx(taxaJuros)[idade] - Tabua.setMx(taxaJuros)[idade + duracao] + Tabua.setDx(taxaJuros)[idade + duracao]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }

}

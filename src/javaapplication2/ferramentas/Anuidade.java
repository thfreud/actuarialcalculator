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

/**
 *
 * @author Avery
 */
public class Anuidade {

    /*
    O método getAnuidadeVitalicia calcula o prêmio de uma anuidade vitalícia, podendo ser diferida ou não, de acordo
    com a indicação dos parâmetros.
    A soma do parâmetro idade com diferimento não pode ser superior a dimensão do vetor (qx+1) do contrário haverá 
    erro de execução.
    
    Todos os parâmetros são obrigatórios em cada método. Para anuidades imediatas o usuário deverá atribuir o valor
    zero ao parâmetro diferimento.
     */
    public static double getAnuidadeVitalicia(int idade, double beneficio, boolean postecipada, double taxaJuros, int diferimento) {

        double res = 0;
        try {
            if (postecipada == true) {
                res = (Tabua.setNx(taxaJuros)[diferimento + idade + 1] / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            } else {
                res = (Tabua.setNx(taxaJuros)[diferimento + idade] / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }
    
    public static double getAnuidadeVitalicia(int idade, double beneficio, boolean postecipada, double taxaJuros) {

        double res = 0;
        try {
            if (postecipada == true) {
                res = (Tabua.setNx(taxaJuros)[idade + 1] / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            } else {
                res = (Tabua.setNx(taxaJuros)[idade] / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }


    //método para calcular anuidade temporária
    /*
    O método getAnuidadeTemporária calcula o prêmio de uma anuidade temporária, podendo ser diferida ou não, de acordo
    com a indicação dos parâmetros.
    A soma do parâmetro idade + diferimento + duracao não pode ser superior a dimensão do vetor (qx+1) do contrário haverá 
    erro de execução.
    
    Todos os parâmetros são obrigatórios em cada método. Para anuidades imediatas o usuário deverá atribuir o valor
    zero ao parâmetro diferimento.
     */
    public static double getAnuidadeTemporaria(int idade, int duracao, double beneficio, boolean postecipada, double taxaJuros, int diferimento) {
        double res = 0;
        try {
            if (postecipada == true) {
                res = ((Tabua.setNx(taxaJuros)[diferimento + idade + 1] - Tabua.setNx(taxaJuros)[diferimento + idade + duracao + 1]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            } else {
                res = ((Tabua.setNx(taxaJuros)[diferimento + idade] - Tabua.setNx(taxaJuros)[diferimento + idade + duracao]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } catch (Error e) {

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

        return Utilitarios.round(res,3);
    }
    
    public static double getAnuidadeTemporaria(int idade, int duracao, double beneficio, boolean postecipada, double taxaJuros) {
        double res = 0;
        try {
            if (postecipada == true) {
                res = ((Tabua.setNx(taxaJuros)[idade + 1] - Tabua.setNx(taxaJuros)[idade + duracao + 1]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            } else {
                res = ((Tabua.setNx(taxaJuros)[idade] - Tabua.setNx(taxaJuros)[idade + duracao]) / Tabua.setDx(taxaJuros)[idade]) * beneficio;
            }
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


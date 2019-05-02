/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.ferramentas;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Avery
 */
public class Tabua {

    //declarando variáveis de instância
    public static double[] qx;    
    
    public static void carregaTabua()
    {
        CSVReader reader;
        try {
            
            reader = new CSVReader(new FileReader(new File("tabua_atuarial.csv").getAbsolutePath()), ',', '"', 1);

            //pega todas as linhas
            List<String[]> allRows = reader.readAll();
            
            qx = new double[allRows.size()];
            
            // Permite tratar todas as linhas do CSV, uma por uma.            
            int i = 0;
            for(String[] row : allRows){
              System.out.println(String.valueOf(row[0]));
              qx[i] = Double.valueOf(row[0]);
              i++;
            }
            
            System.out.println("Qx length: " + qx.length);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tabua.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tabua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //criando vetor de probabilidade de sobrevivência px
    public static double[] setPx() {
        double[] px = new double[qx.length];

        int i = 0;
        for (double row : qx) {
            px[i] = (1 - row);
            i++;
        }

        return px;
    }

    //criando vetor de pessoas vivas (lx) para cada idade x
    public static double[] setLx() {
        double[] lx = new double[qx.length + 1];
        lx[0] = 100000.00;
        int i = 1;
        for (double row : setPx()) {
            lx[i] = lx[i - 1] * row;
            i++;
        }
        return lx;
    }

    //criando vetor de número de pessoas mortas (dx) para cada idade x
    public static double[] setdx() {
        double[] dx = new double[qx.length + 1];
        int i = 0;
        for (double row : qx) {
            dx[i] = setLx()[i] * row;
            i++;
        }
        return dx;
    }

    //criando fórmulas de comutação para anuidades e seguros
    //criando vetor de comutação Dx
    //lembrar de incluir valor padrão pra variável taxaJuros
    public static double[] setDx(double taxaJuros) {
        
        /**
         * if( String.valueOf(taxaJuros).isEmpty() )
        {
            taxaJuros = taxaJurosDefault;
        }
         **/
        
        double[] Dx = new double[qx.length + 1];
        int i = 0;
        for (double row : setLx()) {
            Dx[i] = row / Math.pow((1 + taxaJuros), i + 1);
            i++;
        }
        return Dx;
    }

    //criando comutação (Nx)
    public static double[] setNx(double taxaJuros) {
        double[] Nx = new double[qx.length + 1];
        //double[] Dx = setDx(0.06);
        // a variável sentinéla i também servira como ponto de corte do array, na somatória
        //int i = 0;
        for (int i = 0; i < Nx.length; i++) {
            Nx[i] = Utilitarios.somatorio(setDx(taxaJuros), i);

        }
        return Nx;

    }

    //criando as comutações para cálculo de seguros (Cx)
    public static double[] setCx(double taxaJuros) {
        double[] Cx = new double[qx.length + 1];
        int i = 0;
        for (double row : setdx()) {
            Cx[i] = row / Math.pow((1 + taxaJuros), i + 1);
            i++;
        }
        return Cx;
    }

    //criando as comutações para cálculo de seguros (Mx)= Somatório de Cx a partir de cada idade
    public static double[] setMx(double taxaJuros) {
        double[] Mx = new double[qx.length + 1];
        //double[] Dx = setDx(0.06);
        // a variável sentinéla i também servira como ponto de corte do array, na somatória
        //int i = 0;
        for (int i = 0; i < Mx.length; i++) {
            Mx[i] = Utilitarios.somatorio(setCx(taxaJuros), i);

        }
        return Mx;

    }

}


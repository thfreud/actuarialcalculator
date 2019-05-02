/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Avery
 */
public class NewClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int contagem = 0;
        
        for (int i = 1; i<=5; ++i)
        {
            System.out.print("Digite uma nota: ");
            double nota = input.nextDouble();
            total+=nota;
            contagem++;
               
        }
        double media = (double) total/contagem;
        System.out.printf("a média é %.2f ", media);
    }
}

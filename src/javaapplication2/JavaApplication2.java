/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Toolkit;

/**
 *
 * @author Avery
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Instancia a classe da janela, que está dentro do mesmo pacote desta aplicação.
        Ao chamar o Frame dentro do método principal da aplicação, nós garantims
        que a janela seja aberta tão logo o app seja executado.
        */
        MainWindowJFrame jframe = new MainWindowJFrame();
                
        // Centraliza a janela
        jframe.setLocation(
                // Centraliza na horizontal
                (Toolkit.getDefaultToolkit().getScreenSize().width/2) - (jframe.getSize().width/2),
                // Centraliz na vertical
                (Toolkit.getDefaultToolkit().getScreenSize().height/2) - (jframe.getSize().height/2));
        
        // Exibe a janela (Este método me parece que está obsoleto e eu não sei ainda qual é o substituto. Mas funciona)
        jframe.setResizable(false);
        jframe.show();
        
 
    }
    
}

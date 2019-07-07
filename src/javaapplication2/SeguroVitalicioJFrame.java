/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.ferramentas.Anuidade;
import javaapplication2.ferramentas.Seguro;
import javaapplication2.ferramentas.Tabua;
import javaapplication2.ferramentas.Utilitarios;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Avery
 */
public class SeguroVitalicioJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnuidadeVitaliciaJFrame
     */
    public SeguroVitalicioJFrame() {
        initComponents();
        
        if(!new File("tabua_atuarial.csv").exists())
        {
            JOptionPane.showMessageDialog(
                                        null, 
                                        "IMPORTE A TÁBUA PRIMEIRO (FERRAMENTAS > IMPOTAÇÃO DA TÁBUA)", 
                                        "ATENÇÃO", 
                                        JOptionPane.WARNING_MESSAGE);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        seguro_vitalicio_idade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seguro_vitalicio_diferimento = new javax.swing.JTextField();
        seguro_vitalicio_taxa_juros = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        seguro_vitalicio_resultado = new javax.swing.JLabel();
        seguro_vitalicio_beneficio = new javax.swing.JTextField();
        seguro_vitalicio_calcular = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seguro Vitalício");

        jLabel1.setText("Idade");

        seguro_vitalicio_idade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seguro_vitalicio_idade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seguro_vitalicio_idade.setName(""); // NOI18N
        seguro_vitalicio_idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inteiro(evt);
            }
        });

        jLabel2.setText("Benefício");

        jLabel3.setText("Taxa de juros (%)");

        jLabel4.setText("Diferimento");

        seguro_vitalicio_diferimento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seguro_vitalicio_diferimento.setText("0");
        seguro_vitalicio_diferimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seguro_vitalicio_diferimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diferimentoHandler(evt);
            }
        });

        seguro_vitalicio_taxa_juros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            seguro_vitalicio_taxa_juros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        seguro_vitalicio_taxa_juros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seguro_vitalicio_taxa_juros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                taxaJurosFocusLost(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        seguro_vitalicio_resultado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        seguro_vitalicio_resultado.setForeground(new java.awt.Color(255, 255, 255));
        seguro_vitalicio_resultado.setText("R$ 0,00");
        seguro_vitalicio_resultado.setToolTipText("");
        seguro_vitalicio_resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seguro_vitalicio_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seguro_vitalicio_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        seguro_vitalicio_beneficio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seguro_vitalicio_beneficio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seguro_vitalicio_diferimento)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(seguro_vitalicio_taxa_juros, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel4))
                                .addComponent(seguro_vitalicio_idade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(seguro_vitalicio_beneficio))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seguro_vitalicio_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seguro_vitalicio_taxa_juros, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seguro_vitalicio_beneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seguro_vitalicio_diferimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        seguro_vitalicio_calcular.setText("Calcular");
        seguro_vitalicio_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguro_vitalicio_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(seguro_vitalicio_calcular)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(seguro_vitalicio_calcular)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Apenas números inteiros
    */
    private void inteiro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inteiro
        char digitou = evt.getKeyChar();
        if(!(Character.isDigit(digitou))){
            evt.consume();
        }
    }//GEN-LAST:event_inteiro

    private void diferimentoHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diferimentoHandler
        char digitou = evt.getKeyChar();
        if(!(Character.isDigit(digitou))){
            evt.consume();
        }
    }//GEN-LAST:event_diferimentoHandler

    private void taxaJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taxaJurosFocusLost
    
        seguro_vitalicio_taxa_juros.setFocusLostBehavior(JFormattedTextField.PERSIST);
        try{
            System.out.println(seguro_vitalicio_taxa_juros.getText());
            float inputNum = Float.parseFloat(seguro_vitalicio_taxa_juros.getText());
            if(inputNum<0 || inputNum>1) {
                JOptionPane.showMessageDialog(
                                        null, 
                                        "FORNEÇA UM VALOR ENTRE 0 (ZERO) E 1 PARA A TAXA DE JUROS", 
                                        "ATENÇÃO", 
                                        JOptionPane.WARNING_MESSAGE);
            }
        }catch(java.lang.NumberFormatException e){
            //anuidade_vitalicia_taxa_juros.setText("");
            seguro_vitalicio_taxa_juros.requestFocus();
        }
        
    }//GEN-LAST:event_taxaJurosFocusLost

    private void seguro_vitalicio_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguro_vitalicio_calcularActionPerformed
       
        try{
            

            int soma = Integer.parseInt(seguro_vitalicio_idade.getText()) + Integer.parseInt(seguro_vitalicio_diferimento.getText());
            
            Tabua.carregaTabua();
            
            if(soma > Tabua.qx.length)
            {
                JOptionPane.showMessageDialog(
                                        null, 
                                        "A SOMA IDADE + DIFERIMENTO DEVE SER INFERIOR AO OMEGA DA TÁBUA = ".concat(String.valueOf(Tabua.qx.length)), 
                                        "ATENÇÃO", 
                                        JOptionPane.WARNING_MESSAGE);
            }else{
                
                double res = Seguro.getSeguroVitalicio(
                    Integer.parseInt(seguro_vitalicio_idade.getText()), 
                    Double.valueOf(seguro_vitalicio_beneficio.getText()), 
                    Double.valueOf(seguro_vitalicio_taxa_juros.getText()),
                    Integer.parseInt(seguro_vitalicio_diferimento.getText()));
                
                DecimalFormat resFormat = new DecimalFormat("#.000");

                //seguro_vitalicio_resultado.setText(resFormat.format(res));
                seguro_vitalicio_resultado.setText(Utilitarios.monetario(res));
                
            }
        
        }
        catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(
                                        null, 
                                        "VERIFIQUE SE VOCÊ PREENCHEU TODOS OS CAMPOS CORRETAMENTE!", 
                                        "ATENÇÃO", 
                                        JOptionPane.ERROR_MESSAGE);
        }
        catch(Error e){
            JOptionPane.showMessageDialog(
                                        null, 
                                        "VERIFIQUE SE VOCÊ PREENCHEU TODOS OS CAMPOS CORRETAMENTE!", 
                                        "ATENÇÃO", 
                                        JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_seguro_vitalicio_calcularActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeguroVitalicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguroVitalicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguroVitalicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguroVitalicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguroVitalicioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField seguro_vitalicio_beneficio;
    private javax.swing.JToggleButton seguro_vitalicio_calcular;
    private javax.swing.JTextField seguro_vitalicio_diferimento;
    private javax.swing.JTextField seguro_vitalicio_idade;
    private javax.swing.JLabel seguro_vitalicio_resultado;
    private javax.swing.JFormattedTextField seguro_vitalicio_taxa_juros;
    // End of variables declaration//GEN-END:variables
}

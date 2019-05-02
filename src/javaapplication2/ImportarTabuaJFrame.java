/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Avery
 */
public class ImportarTabuaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ImportarTabuaJFrame
     */
    public ImportarTabuaJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonImport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Importar tábua atuarial");

        buttonImport.setBackground(new java.awt.Color(0, 153, 153));
        buttonImport.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonImport.setForeground(new java.awt.Color(255, 255, 255));
        buttonImport.setText("Importar arquivo");
        buttonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImportActionPerformed(evt);
            }
        });

        jLabel1.setText("IMPORTAÇÃO DA TÁBUA ATUARIAL NO FORMATO CSV");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(buttonImport, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(buttonImport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImportActionPerformed
        
        JFileChooser fc = new JFileChooser();
        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            Path target = Paths.get(new File("tabua_atuarial.csv").getAbsolutePath());
            
            try {
                Files.copy(file.toPath(), target.toAbsolutePath());
                
                if(new File("tabua_atuarial.csv").exists())
                {
                    //buttonImport.setVisible(false);
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                }
            }catch (IOException ex) {
                //Logger.getLogger(MainWindowJFrame.class.getName()).log(Level.SEVERE, null, ex);
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            }catch(Error e){
                //Logger.getLogger(MainWindowJFrame.class.getName()).log(Level.SEVERE, null, e);
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            }

        }
    }//GEN-LAST:event_buttonImportActionPerformed

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
            java.util.logging.Logger.getLogger(ImportarTabuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportarTabuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportarTabuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportarTabuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportarTabuaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonImport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

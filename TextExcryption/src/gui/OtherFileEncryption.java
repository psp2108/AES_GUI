/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import textencryption.TextEncryption;
import java.awt.FileDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Panchal
 */
public class OtherFileEncryption extends javax.swing.JFrame {

    /**
     * Creates new form OtherFileEncryption
     */
    public OtherFileEncryption() {
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

        InputFileBtn = new javax.swing.JButton();
        InputFile = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        OutputFile = new javax.swing.JLabel();
        Key1 = new javax.swing.JPasswordField();
        Key2 = new javax.swing.JPasswordField();
        EncryptSaveBtn = new javax.swing.JButton();
        DecryptSaveBtn = new javax.swing.JButton();
        Count = new javax.swing.JSpinner();
        RemoveFile1 = new javax.swing.JButton();
        RemoveFile2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputFileBtn.setText("Input File");
        InputFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFileBtnActionPerformed(evt);
            }
        });

        InputFile.setText("<FILE>");

        jButton2.setText("Output File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        OutputFile.setText("<FILE>");

        Key1.setToolTipText("Key 1");

        Key2.setToolTipText("Key 2");

        EncryptSaveBtn.setText("Encrypt and Save");
        EncryptSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptSaveBtnActionPerformed(evt);
            }
        });

        DecryptSaveBtn.setText("Decrypt and Save");
        DecryptSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptSaveBtnActionPerformed(evt);
            }
        });

        Count.setToolTipText("Set Repetations");

        RemoveFile1.setText("Remove");
        RemoveFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFile1ActionPerformed(evt);
            }
        });

        RemoveFile2.setText("Remove");
        RemoveFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFile2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(EncryptSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(DecryptSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveFile1)
                            .addComponent(RemoveFile2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InputFileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OutputFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputFileBtn)
                    .addComponent(InputFile)
                    .addComponent(RemoveFile1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(OutputFile)
                    .addComponent(RemoveFile2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EncryptSaveBtn)
                    .addComponent(DecryptSaveBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFileBtnActionPerformed
        // TODO add your handling code here:
        FileDialog openFileDialog = new FileDialog(this);
        openFileDialog.setVisible(true);
        InputFile.setText(openFileDialog.getDirectory() + openFileDialog.getFile());
        checkAndEmptySame(InputFile);
    }//GEN-LAST:event_InputFileBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileDialog saveFileDialog = new FileDialog(this, "Create Your File", FileDialog.SAVE);
        saveFileDialog.setVisible(true);
        OutputFile.setText(saveFileDialog.getDirectory() + saveFileDialog.getFile());
        checkAndEmptySame(OutputFile);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RemoveFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFile1ActionPerformed
        // TODO add your handling code here:
        InputFile.setText("<FILE>");
    }//GEN-LAST:event_RemoveFile1ActionPerformed

    private void RemoveFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFile2ActionPerformed
        // TODO add your handling code here:
        OutputFile.setText("<FILE>");
    }//GEN-LAST:event_RemoveFile2ActionPerformed

    private void EncryptSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptSaveBtnActionPerformed
        // TODO add your handling code here:
        if (!paddKey()) {
            return;
        }

        String key1 = charArrToString(Key1.getPassword());
        String key2 = charArrToString(Key2.getPassword());
        int counter = Integer.parseInt(Count.getValue() + "");

        try {
            TextEncryption.encryptOtherFile(key1, key2, counter, InputFile.getText(), OutputFile.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed To Encrypt file. \n\n Reason => " + ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EncryptSaveBtnActionPerformed

    private void DecryptSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptSaveBtnActionPerformed
        // TODO add your handling code here:
        if (!paddKey()) {
            return;
        }

        String key1 = charArrToString(Key1.getPassword());
        String key2 = charArrToString(Key2.getPassword());
        int counter = Integer.parseInt(Count.getValue() + "");

        try {
            TextEncryption.decryptOtherFile(key1, key2, counter, InputFile.getText(), OutputFile.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed To Decrypt file. \n\n Reason => " + ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DecryptSaveBtnActionPerformed
    private boolean paddKey() {
        String key;

        key = charArrToString(Key1.getPassword());
        if (key.length() >= 1 && key.length() <= 16) {
            char c = 100;
            while (key.length() != 16) {
                key = c + key;
                c++;
            }
            Key1.setText(key);
        } else {
            return false;
        }

        key = charArrToString(Key2.getPassword());
        if (key.length() >= 1 && key.length() <= 16) {
            char c = 100;
            while (key.length() != 16) {
                key += c;
                c++;
            }
            Key2.setText(key);
        } else {
            return false;
        }

        return true;
    }

    private String charArrToString(char[] CharArr) {
        String string = "";
        if (CharArr != null) {
            for (char c : CharArr) {
                string += c;
            }
        }
        return string;
    }

    private void checkAndEmptySame(JLabel FileLabel) {
        if (InputFile.getText().equals(OutputFile.getText())) {
            JOptionPane.showMessageDialog(null, "Input and Output File cannot be same", "Message", JOptionPane.ERROR_MESSAGE);
            FileLabel.setText("<FILE>");
        }
    }

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
            java.util.logging.Logger.getLogger(OtherFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OtherFileEncryption mainFrame = new OtherFileEncryption();
                mainFrame.setVisible(true);
                mainFrame.Count.setValue(1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Count;
    private javax.swing.JButton DecryptSaveBtn;
    private javax.swing.JButton EncryptSaveBtn;
    private javax.swing.JLabel InputFile;
    private javax.swing.JButton InputFileBtn;
    private javax.swing.JPasswordField Key1;
    private javax.swing.JPasswordField Key2;
    private javax.swing.JLabel OutputFile;
    private javax.swing.JButton RemoveFile1;
    private javax.swing.JButton RemoveFile2;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
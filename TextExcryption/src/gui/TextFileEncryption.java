/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import textencryption.TextEncryption;
import inputoutput.log;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Panchal
 */
public class TextFileEncryption extends javax.swing.JFrame {

    /**
     * Creates new form TextFileEncryption
     */
    public TextFileEncryption() {
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

        RadioButtonGrp = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Key1 = new javax.swing.JPasswordField();
        Key2 = new javax.swing.JPasswordField();
        Count = new javax.swing.JSpinner();
        OpenFileButton = new javax.swing.JButton();
        FilePath = new javax.swing.JLabel();
        OpenFile = new javax.swing.JButton();
        SaveFileButton = new javax.swing.JButton();
        DecryptCheckbox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        FileData = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        DecryptSave = new javax.swing.JButton();
        LineWrap = new javax.swing.JCheckBox();
        EncryptSave = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        UnsavedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(742, 260));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Key1.setToolTipText("KEY 1");
        Key1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Key1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Key1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Key1KeyTyped(evt);
            }
        });

        Key2.setToolTipText("KEY 2");
        Key2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Key2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Key2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Key2KeyTyped(evt);
            }
        });

        Count.setToolTipText("Set Repetations");

        OpenFileButton.setText("Open File");
        OpenFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileButtonActionPerformed(evt);
            }
        });

        FilePath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FilePath.setText("<FILE>");

        OpenFile.setText("Open");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });

        SaveFileButton.setText("Create File");
        SaveFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileButtonActionPerformed(evt);
            }
        });

        DecryptCheckbox.setText("Decrypt & Open");
        DecryptCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DecryptCheckbox)))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(OpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenFileButton)
                    .addComponent(SaveFileButton)
                    .addComponent(DecryptCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FilePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FileData.setColumns(20);
        FileData.setRows(5);
        FileData.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                FileDataInputMethodTextChanged(evt);
            }
        });
        FileData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FileDataKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FileDataKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FileDataKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(FileData);

        DecryptSave.setText("Save Plain Text");
        DecryptSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptSaveActionPerformed(evt);
            }
        });

        LineWrap.setText("Wrap Line");
        LineWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineWrapActionPerformed(evt);
            }
        });

        EncryptSave.setText("Encrypt and Save");
        EncryptSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptSaveActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AutoSave Off", "AutoSave Plain Text", "AutoSave Encrypted Text" }));
        jComboBox1.setToolTipText("AutoSave");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LineWrap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UnsavedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DecryptSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EncryptSave))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LineWrap)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(EncryptSave)
                .addComponent(DecryptSave)
                .addComponent(UnsavedLabel)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileButtonActionPerformed
        // TODO add your handling code here:
        FileDialog openFileDialog = new FileDialog(this);
        openFileDialog.setVisible(true);
        FilePath.setText(openFileDialog.getDirectory() + openFileDialog.getFile());
        FileToSave = false;
        OpenFile.setText("Open");
        this.setTitle(openFileDialog.getFile());
    }//GEN-LAST:event_OpenFileButtonActionPerformed

    private void SaveFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileButtonActionPerformed
        // TODO add your handling code here:

        FileDialog saveFileDialog = new FileDialog(this, "Create Your File", FileDialog.SAVE);
        saveFileDialog.setVisible(true);
        FilePath.setText(saveFileDialog.getDirectory() + saveFileDialog.getFile());
        FileToSave = true;
        OpenFile.setText("Create");
        this.setTitle(saveFileDialog.getFile());
    }//GEN-LAST:event_SaveFileButtonActionPerformed

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

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        // TODO add your handling code here:

        //Alt : 24
        //Shift : 17
        //Ctrl : 18
        //No key : 16
        int modifier = evt.getModifiers();

        switch (modifier) {
            case 16:
                if (!paddKey()) {
                    return;
                }
                if (!FilePath.getText().equals("<FILE>")) {
                    if (FileToSave) {
                        File file = new File(FilePath.getText());
                        if (file.exists()) {
                            file.delete();
                        }
                        try {
                            file.createNewFile();
                            FileToSave = false;
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Failed to create new file", "Message", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(TextFileEncryption.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    if (DecryptCheckbox.isSelected()) {
                        //Decrypt
                        String CipherText = TextEncryption.readFile(FilePath.getText(), false);
                        String key1 = charArrToString(Key1.getPassword());
                        String key2 = charArrToString(Key2.getPassword());
                        int counter = Integer.parseInt(Count.getValue() + "");

                        String PlainText = "";
                        try {
                            PlainText = TextEncryption.decryptTextFile(key1, key2, counter, CipherText);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Failed To Decrypt Text. \n\n Reason => " + ex, "Message", JOptionPane.ERROR_MESSAGE);
                        }

                        FileData.setText(PlainText);

                    } else {
                        //Encrypt
                        FileData.setText(TextEncryption.readFile(FilePath.getText(), false));
                    }
                }
                break;
            case 17:
                Key1.setText("");
                Key2.setText("");
                Count.setValue(1);
                break;
            case 24:
                paddKey();
                break;
            default:
                break;
        }

    }//GEN-LAST:event_OpenFileActionPerformed

    private String charArrToString(char[] CharArr) {
        String string = "";
        if (CharArr != null) {
            for (char c : CharArr) {
                string += c;
            }
        }
        return string;
    }

    private void EncryptSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptSaveActionPerformed
        // TODO add your handling code here:
        encryptAndSaveData();
        setUnsavedStatus(false);
    }//GEN-LAST:event_EncryptSaveActionPerformed

    private void LineWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineWrapActionPerformed
        // TODO add your handling code here:
        FileData.setLineWrap(LineWrap.isSelected());
    }//GEN-LAST:event_LineWrapActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void DecryptSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptSaveActionPerformed
        // TODO add your handling code here:
        TextEncryption.writeFile(FilePath.getText(), FileData.getText(), false);
        setUnsavedStatus(false);
    }//GEN-LAST:event_DecryptSaveActionPerformed

    private void DecryptCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptCheckboxActionPerformed
        // TODO add your handling code here:
        setButtonSetState();
    }//GEN-LAST:event_DecryptCheckboxActionPerformed

    private void FileDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileDataKeyTyped
        // TODO add your handling code here:
//        autoSaveData();
    }//GEN-LAST:event_FileDataKeyTyped

    private void FileDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileDataKeyReleased
        // TODO add your handling code here:
        autoSaveData();
    }//GEN-LAST:event_FileDataKeyReleased

    private void FileDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileDataKeyPressed
        // TODO add your handling code here:
//        autoSaveData();
    }//GEN-LAST:event_FileDataKeyPressed

    private void FileDataInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_FileDataInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_FileDataInputMethodTextChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (SavePending) {
            String ObjButtons[] = {"Yes", "No"};
            String CloseMessage = "Your last changes to the file has not been saved, Do you want to discard the changes and exit.";
            int PromptResult = JOptionPane.showOptionDialog(null, CloseMessage, "Exit Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
            if (PromptResult == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void Key1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key1KeyTyped
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key1KeyTyped

    private void Key2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key2KeyTyped
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key2KeyTyped

    private void Key1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key1KeyReleased
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key1KeyReleased

    private void Key1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key1KeyPressed
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key1KeyPressed

    private void Key2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key2KeyReleased
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key2KeyReleased

    private void Key2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Key2KeyPressed
        // TODO add your handling code here:
        checkLength();
    }//GEN-LAST:event_Key2KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void encryptAndSaveData() {
        String PlainText = FileData.getText();
        String key1 = charArrToString(Key1.getPassword());
        String key2 = charArrToString(Key2.getPassword());
        int counter = Integer.parseInt(Count.getValue() + "");

        String CipherText = "";

        try {
            CipherText = TextEncryption.encryptTextFile(key1, key2, counter, PlainText);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed To Encrypt Text. \n\n Reason => " + ex, "Message", JOptionPane.ERROR_MESSAGE);
        }

        TextEncryption.writeFile(FilePath.getText(), CipherText, false);
    }

    private void checkLength() {
        String key1 = charArrToString(Key1.getPassword());
        String key2 = charArrToString(Key2.getPassword());

        if (key1.length() > 16 || key2.length() > 16) {
            JOptionPane.showMessageDialog(null, "Key Values should only be between 1 to 16", "Warning", JOptionPane.WARNING_MESSAGE);

            if (key1.length() > 16) {
                key1 = key1.substring(0, 16);
                Key1.setText(key1);
            }

            if (key2.length() > 16) {
                key2 = key2.substring(0, 16);
                Key2.setText(key2);
            }
        }
    }

    private void setButtonSetState() {
        if (DecryptCheckbox.isSelected()) {
            SaveFileButton.setEnabled(false);
            if (FileToSave) {
                FilePath.setText("<File>");
            }
            FileToSave = false;
        } else {
            SaveFileButton.setEnabled(true);
        }
    }

    private void autoSaveData() {
        int index = jComboBox1.getSelectedIndex();
        //0 - OFF
        //1 - Save Plain Text
        //2 = Save Encrypted Text

        switch (index) {
            case 0:
                setUnsavedStatus(true);
                break;
            case 1:
                TextEncryption.writeFile(FilePath.getText(), FileData.getText(), false);
                setUnsavedStatus(false);
                break;
            case 2:
                encryptAndSaveData();
                setUnsavedStatus(false);
                break;
        }

    }

    private void setUnsavedStatus(boolean status){
        if(status){
            UnsavedLabel.setText("*");
        }
        else{
            UnsavedLabel.setText("");
        }
        SavePending = status;
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
            java.util.logging.Logger.getLogger(TextFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TextFileEncryption mainFrame = new TextFileEncryption();
                mainFrame.setVisible(true);
                mainFrame.DecryptCheckbox.setSelected(false);
                mainFrame.FileData.setLineWrap(mainFrame.LineWrap.isSelected());
                mainFrame.Count.setValue(1);
                mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                mainFrame.setTitle("Untitled");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Count;
    private javax.swing.JCheckBox DecryptCheckbox;
    private javax.swing.JButton DecryptSave;
    private javax.swing.JButton EncryptSave;
    private javax.swing.JTextArea FileData;
    private javax.swing.JLabel FilePath;
    private javax.swing.JPasswordField Key1;
    private javax.swing.JPasswordField Key2;
    private javax.swing.JCheckBox LineWrap;
    private javax.swing.JButton OpenFile;
    private javax.swing.JButton OpenFileButton;
    private javax.swing.ButtonGroup RadioButtonGrp;
    private javax.swing.JButton SaveFileButton;
    private javax.swing.JLabel UnsavedLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private boolean FileToSave = false;
    private boolean SavePending = false;
}
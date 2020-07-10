/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textencryption;

import java.io.*;
import inputoutput.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pratik Panchal
 */
public class TextEncryption {

    /**
     * @param args the command line arguments
     */
    public static String FileContent = "";

    public static String readFile(String path, boolean ReadBinary) {
        String FileContent = "";

        try {
            FileContent = "";
            if (ReadBinary) {

                FileInputStream fis = new FileInputStream(path);

                int size = fis.available();
                log.d((new TextEncryption()).getClass().getName(), Thread.currentThread(), "Size = " + size);
                byte[] content = new byte[size];

                fis.read(content);
                fis.close();

                FileContent = byteArrayToBinary(content);
            } else {
                boolean FirstLine = true;

                String line = null;
                FileReader fin = new FileReader(path);
                BufferedReader buf = new BufferedReader(fin);

                while ((line = buf.readLine()) != null) {
                    if (FirstLine) {
                        FirstLine = false;
                    } else {
                        FileContent += "\n";
                    }

                    FileContent += line;
                }
                buf.close();
                fin.close();
            }

//            for (byte b : content) {
//                short a = b;
//                char c = (char)a;
//                log.d((new TextExcryption()).getClass().getName(), Thread.currentThread(), a + " = " + c);
//            }
        } catch (Exception ex) {
            log.e((new TextEncryption()).getClass().getName(), Thread.currentThread(), ex);
        }
        return FileContent;
    }

    public static boolean writeFile(String path, String content, boolean IsBinary) {
        try {

            if (IsBinary) {
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(binaryStringToByteArray(content));
                fos.close();

                log.s((new TextEncryption()).getClass().getName(), Thread.currentThread(), "File Saved");
            } else {
                FileWriter fout = new FileWriter(path, false);
                fout.write(content);
                fout.close();

                log.s((new TextEncryption()).getClass().getName(), Thread.currentThread(), "File Saved");
            }

            return true;
        } catch (Exception ex) {
            log.e((new TextEncryption()).getClass().getName(), Thread.currentThread(), ex);
            return false;
        }
    }

    public static String byteArrayToBinary(byte[] byteArr) {
        String temp = "";
        String OneByte;

        for (byte b : byteArr) {
            OneByte = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            temp += OneByte;
        }
        return temp;
    }

    public static byte[] binaryStringToByteArray(String binary) {

        while (binary.length() % 8 != 0) {
            binary = "0" + binary;
        }

        int ByteCount = (int) binary.length() / 8;
        String StringArr[] = new String[ByteCount];
        byte ByteArr[] = new byte[ByteCount];

        for (int i = 0; i < StringArr.length; i++) {
            StringArr[i] = binary.substring(8 * i, (8 * i) + 8);
            ByteArr[i] = (byte) (int) Integer.valueOf(StringArr[i], 2);
        }

        return ByteArr;
    }

    public static byte[] stringToByteArray(String string) {
        byte[] ByteArr = string.getBytes();
        return ByteArr;
    }

//    public static void main(String[] args) {
////        encryptFile();
//        decryptFile();
//    }
    public static String encryptTextFile(String key1, String key2, int count, String PlainText) throws Exception {
        String CipherText = null;
        if (count >= 1) {
            CipherText = PlainText;
            for (int i = 0; i < count; i++) {
                CipherText = Encryptor.encrypt(key1, key2, CipherText);
                log.s((new TextEncryption()).getClass().getName(), Thread.currentThread(), "Encrypting : " + i);
            }
        } else {
            CipherText = Encryptor.encrypt(key1, key2, PlainText);
            log.s((new TextEncryption()).getClass().getName(), Thread.currentThread(), "Encrypting : Only Once ");
        }

        return CipherText;
    }

    public static String decryptTextFile(String key1, String key2, int count, String CipherText) throws Exception {
        String PlainText = null;
        if (count >= 1) {
            PlainText = CipherText;
            for (int i = 0; i < count; i++) {
                PlainText = Encryptor.decrypt(key1, key2, PlainText);
            }
        } else {
            PlainText = Encryptor.decrypt(key1, key2, CipherText);
        }

        return PlainText;
    }

    public static String encryptOtherFile(String key1, String key2, int count, String InputPath, String OutputPath) throws Exception {
        if (count >= 1) {
            try {
                copyFile(InputPath, OutputPath);
            } catch (IOException ex) {
                log.e((new TextEncryption()).getClass().getName(), Thread.currentThread(), ex);
                Logger.getLogger(TextEncryption.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < count; i++) {
                String textToEncrypt = readFile(OutputPath, true);
                String CipherText = Encryptor.encrypt(key1, key2, textToEncrypt);
                writeFile(OutputPath, CipherText, false);
            }
        } else {
            String textToEncrypt = readFile(InputPath, true);
            String CipherText = Encryptor.encrypt(key1, key2, textToEncrypt);
            writeFile(OutputPath, CipherText, false);
        }

        return "";
    }

    public static String decryptOtherFile(String key1, String key2, int count, String InputPath, String OutputPath) throws Exception {
        if (count >= 1) {
            try {
                copyFile(InputPath, OutputPath);
            } catch (IOException ex) {
                log.e((new TextEncryption()).getClass().getName(), Thread.currentThread(), ex);
                Logger.getLogger(TextEncryption.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < count; i++) {
                String textToDecrypt = readFile(OutputPath, false);
                String PlainText = Encryptor.decrypt(key1, key2, textToDecrypt);
                writeFile(OutputPath, PlainText, true);
            }
        } else {
            String textToDecrypt = readFile(InputPath, false);
            String PlainText = Encryptor.decrypt(key1, key2, textToDecrypt);
            writeFile(OutputPath, PlainText, true);
        }

        return "";
    }

    private static void copyFile(String sourceStr, String destStr) throws IOException {
        File source = new File(sourceStr);
        File dest = new File(destStr);

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void encryptFile() throws Exception {

        String path = System.getProperty("user.dir") + "\\temp.docx";

        String key = "KeyPratikPanchal"; // 128 bit key
        String initVector = "00Key28879799396"; // 16 bytes IV

        String textToEncrypt = readFile(path, true);
//        System.out.println("Plain Text: " + textToEncrypt);

        String CipherText = Encryptor.encrypt(key, initVector, textToEncrypt);
        System.out.println("Cipher Text: " + CipherText);

        writeFile(path, CipherText, false);

    }

    public static void decryptFile() throws Exception {

        String path = System.getProperty("user.dir") + "\\temp.docx";

        String key = "KeyPratikPanchal"; // 128 bit key
        String initVector = "00Key28879799396"; // 16 bytes IV

        String textToDecrypt = readFile(path, false);
//        System.out.println("Plain Text: " + textToEncrypt);

        String PlainText = Encryptor.decrypt(key, initVector, textToDecrypt);
        System.out.println("Plain Text: " + PlainText);

        writeFile(path, PlainText, true);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
import sun.misc.BASE64Encoder;

/**
 *
 * @author duyle
 */
public class AES extends javax.swing.JFrame {

    private SecretKey secretKey;
    private byte[] byteCipherText;
    private String strDecryptedText;

    /**
     * Creates new form AESForm
     */
    public AES() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtMaDK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtC = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtP = new javax.swing.JTextArea();
        btnDangnhap = new javax.swing.JButton();
        btnDangky = new javax.swing.JButton();
        btnMahoa = new javax.swing.JButton();
        btnGiaima = new javax.swing.JButton();
        btnGhifile = new javax.swing.JButton();
        btnMofile = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AES");

        jLabel2.setText("User name");

        jLabel3.setText("Password");

        jLabel4.setText("Ma dang ky");

        jLabel5.setText("Plain text");

        jLabel6.setText("Cipher text");

        txtMaDK.setEditable(false);

        txtC.setEditable(false);
        txtC.setColumns(20);
        txtC.setRows(5);
        jScrollPane1.setViewportView(txtC);

        txtP.setColumns(20);
        txtP.setRows(5);
        jScrollPane2.setViewportView(txtP);

        btnDangnhap.setText("Dang nhap");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        btnDangky.setText("Dang ky");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkyActionPerformed(evt);
            }
        });

        btnMahoa.setText("Encode");
        btnMahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahoaActionPerformed(evt);
            }
        });

        btnGiaima.setText("Decode");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        btnGhifile.setText("Write");
        btnGhifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhifileActionPerformed(evt);
            }
        });

        btnMofile.setText("Open");
        btnMofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnDangnhap)
                        .addGap(83, 83, 83)
                        .addComponent(btnDangky))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMahoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnGiaima)
                                .addGap(18, 18, 18)
                                .addComponent(btnGhifile)
                                .addGap(18, 18, 18)
                                .addComponent(btnMofile))
                            .addComponent(jScrollPane1)
                            .addComponent(txtMaDK, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(jScrollPane2)
                            .addComponent(txtPassword))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangnhap)
                            .addComponent(btnDangky))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMahoa)
                            .addComponent(btnGiaima)
                            .addComponent(btnGhifile)
                            .addComponent(btnMofile))
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO add your handling code here:
        try {
            String user = txtUsername.getText();
            String pass = txtPassword.getText();
            String khoa = user + pass;
            BufferedReader br = null;
            String fileName = "D:\\AES.txt"; //GEN
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            //xuat chuoi
            System.out.println("Khoa la: " + " " + sb);
            String chuoi = sb.toString();
            Boolean k = khoa.equals(chuoi);
            if (k == true) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
            }
            txtMaDK.setText(chuoi.getBytes().toString());
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (NoSuchAlgorithmException ex) {
            //Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void btnDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkyActionPerformed
        // TODO add your handling code here:
        try {
            String user = txtUsername.getText();
            String pass = txtPassword.getText();
            String khoa = user + pass;
            BufferedWriter bw = null;
            //ghi van ban
            String fileName = "D:\\AES.txt";
            //luu van ban
            String s = txtP.getText();
            bw = new BufferedWriter(new FileWriter(fileName));//van ban sau khi ma hoa
            //ghi van ban
            bw.write(khoa);
            bw.close();
            JOptionPane.showMessageDialog(null, "Ban dang ky thanh cong. Vui long dang nhap lai !");
            txtMaDK.setText(khoa.getBytes().toString());
        } catch (IOException ex) {
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangkyActionPerformed

    private void btnMahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahoaActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println("Sinh khoa: " + secretKey);
            //thuat toan AES
            Cipher aesCipher = Cipher.getInstance("AES");
            //Sinh khoa
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
            //Ma hoa van ban
            String strData = txtP.getText();
            //covert van ban sang kieu byte
            byte[] byteDataToEncrypt = strData.getBytes();
            //Goi phuong thuc doFinal de ma hoa
            byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
            String strCipherText = new BASE64Encoder().encode(byteCipherText);
            System.out.println("Cipher Text generated using AES is " + strCipherText);
            txtC.setText(strCipherText);
        } catch (Exception ex) {
            System.out.println("Loi ma hoa: " + ex);
        }
    }//GEN-LAST:event_btnMahoaActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        // TODO add your handling code here:
        try {
            String cipherText = txtC.getText();
            txtP.setText(cipherText);
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKey, aesCipher.getParameters());
            //String giaima=txtmahoa.getText();
            //byte[] giaima=cipherText.getBytes();
            //byteCipherText
            byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
            String strDecryptedText = new String(byteDecryptedText);
            System.out.println("Decrypted Text message is " + strDecryptedText);
            txtC.setText(strDecryptedText);
        } catch (Exception ex) {
            System.out.println("Loi giai ma: " + ex);
        }
    }//GEN-LAST:event_btnGiaimaActionPerformed

    private void btnGhifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhifileActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter bw = null;
            //ghi van ban da ma hoa
            String fileName = "D:\\GhiAES.txt";
            //luu van ban
            String s = txtC.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            //ghi van ban
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Da ghi file D:\\GhiAES.txt");
        } catch (IOException ex) {
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGhifileActionPerformed

    private void btnMofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMofileActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            //ghi van ban da ma hoa
            String fileName = "E:\\GhiAES.txt";//GEN            
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Da mo file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            //xuat chuoi
            System.out.println("Du lieu la: " + " " + sb);
            String chuoi = sb.toString();
            txtP.setText(chuoi);
            btnGiaima.enable(true);
        } catch (IOException ex) {
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMofileActionPerformed

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
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangky;
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnGhifile;
    private javax.swing.JButton btnGiaima;
    private javax.swing.JButton btnMahoa;
    private javax.swing.JButton btnMofile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtC;
    private javax.swing.JTextField txtMaDK;
    private javax.swing.JTextArea txtP;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

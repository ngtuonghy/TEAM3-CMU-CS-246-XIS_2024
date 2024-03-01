
import java.awt.Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bluez
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form_Sum2Numbers
     */
    public Form() {
        initComponents();
        this.jLabelPHEPCONG.setFont(new Font("Arial",Font.PLAIN,30));
        this.setTitle("Calculator");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPHEPCONG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSoThu1 = new javax.swing.JTextField();
        jTextFieldSoThu2 = new javax.swing.JTextField();
        jButtonCong = new javax.swing.JButton();
        jButtonNhapLai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelKQMAIN = new javax.swing.JLabel();
        jButtonTru = new javax.swing.JButton();
        jButtonNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPHEPCONG.setText("PHÉP CỘNG");

        jLabel1.setText("Số Thứ Nhất");

        jLabel2.setText("Số Thứ Hai");

        jButtonCong.setText("Cộng");
        jButtonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCongActionPerformed(evt);
            }
        });

        jButtonNhapLai.setText("Nhập Lại");
        jButtonNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhapLaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Kết quả:");

        jButtonTru.setText("Trừ");
        jButtonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTruActionPerformed(evt);
            }
        });

        jButtonNhan.setText("Nhân");
        jButtonNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonCong)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTru)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNhapLai))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(152, 152, 152))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelPHEPCONG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoThu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoThu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCong)
                    .addComponent(jButtonNhapLai)
                    .addComponent(jButtonTru)
                    .addComponent(jButtonNhan))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKQMAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCongActionPerformed
        // TODO add your handling code here:
        try {            
            SumOf2Numbers sum = new SumOf2Numbers(Integer.parseInt(this.jTextFieldSoThu1.getText()),
          Integer.parseInt(this.jTextFieldSoThu2.getText()));
            this.jLabelKQMAIN.setText(sum.sum()+"");
            
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai!");

        }
        
    }//GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhapLaiActionPerformed
        // TODO add your handling code here:
        this.jTextFieldSoThu1.setText("");
        this.jTextFieldSoThu2.setText("");
    }//GEN-LAST:event_jButtonNhapLaiActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTruActionPerformed
        // TODO add your handling code here:
        try {
            minusOf2Numbers minus = new minusOf2Numbers(Integer.parseInt(this.jTextFieldSoThu1.getText()), Integer.parseInt(this.jTextFieldSoThu2.getText()));
            this.jLabelKQMAIN.setText(minus.minus()+"");;
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    }//GEN-LAST:event_jButtonTruActionPerformed

    private void jButtonNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhanActionPerformed
        // TODO add your handling code here:
        try {
            multiplicationOf2Numbers minus = new multiplicationOf2Numbers(Integer.parseInt(this.jTextFieldSoThu1.getText()), Integer.parseInt(this.jTextFieldSoThu2.getText()));
            this.jLabelKQMAIN.setText(minus.multiplication()+"");;
        } catch (NumberFormatException e) {
            this.jLabelKQMAIN.setText("Nhập dữ liệu sai");
        }
    }//GEN-LAST:event_jButtonNhanActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonNhan;
    private javax.swing.JButton jButtonNhapLai;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelKQMAIN;
    private javax.swing.JLabel jLabelPHEPCONG;
    private javax.swing.JTextField jTextFieldSoThu1;
    private javax.swing.JTextField jTextFieldSoThu2;
    // End of variables declaration//GEN-END:variables
}

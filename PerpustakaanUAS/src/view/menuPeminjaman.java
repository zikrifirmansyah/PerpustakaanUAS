/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author zikri
 */
public class menuPeminjaman extends javax.swing.JPanel {

    /**
     * Creates new form menuPeminjaman
     */
    public menuPeminjaman() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPeminjam = new javax.swing.JTable();
        SDaschboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LDashboard = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbPeminjam1 = new javax.swing.JTable();
        SDaschboard1 = new javax.swing.JLabel();
        LDashboard1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 530));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbPeminjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TbPeminjam);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 900, 260));

        SDaschboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SDaschboard.setForeground(new java.awt.Color(102, 102, 102));
        SDaschboard.setText("Master Data > Admin");
        jPanel2.add(SDaschboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Daftar admin");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        LDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LAdmin(2).png"))); // NOI18N
        jPanel2.add(LDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(940, 530));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbPeminjam1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TbPeminjam1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 900, 90));

        SDaschboard1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SDaschboard1.setForeground(new java.awt.Color(102, 102, 102));
        SDaschboard1.setText("Master Data > Peminjaman");
        jPanel3.add(SDaschboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        LDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LPemnjaman.png"))); // NOI18N
        jPanel3.add(LDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LPeminjaman(2).png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Peminjaman");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel4.setText("ID Peminjaman");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setText("Tanggal Pengembalian");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jLabel6.setText("Tanggal Peminjaman");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Tanggal Pengembalian");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 140, -1));

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Tanggal Peminjaman");
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 140, -1));

        jLabel7.setText("Jumlah Peminjaman");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 110, -1));

        jLabel8.setText("ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 40, -1));

        jLabel9.setText("Email");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 40, -1));

        jLabel10.setText("Buku");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel11.setText("Judul");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 40, -1));

        jLabel12.setText("NoTelp");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 40, -1));

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("ID");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, -1));

        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setText("Nama Anggota");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 140, -1));

        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setText("Email");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 140, -1));

        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setText("No Telp");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 140, -1));

        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.setText("ID Buku");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 140, -1));

        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.setText("Judul");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 140, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 363, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 363, -1, 30));

        jLabel13.setText("Nama");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 40, -1));

        jTextField10.setForeground(new java.awt.Color(204, 204, 204));
        jTextField10.setText("ID Peminjamn");
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LDashboard;
    private javax.swing.JLabel LDashboard1;
    private javax.swing.JLabel SDaschboard;
    private javax.swing.JLabel SDaschboard1;
    private javax.swing.JTable TbPeminjam;
    private javax.swing.JTable TbPeminjam1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author zikri
 */
public class menuBuku extends javax.swing.JPanel {

    /**
     * Creates new form menuBuku
     */
    public menuBuku() {
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

        panelMain = new javax.swing.JPanel();
        panelBuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPeminjam = new javax.swing.JTable();
        SDaschboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LDashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BTambahAnggota = new javax.swing.JButton();
        BKembali = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        BHapusAnggota = new javax.swing.JButton();
        BHalamanAkhir = new javax.swing.JButton();
        BHalamanAwal = new javax.swing.JButton();
        BNext = new javax.swing.JButton();
        BSebelum = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        panelAddBuku = new javax.swing.JPanel();
        SDaschboard1 = new javax.swing.JLabel();
        LDashboard1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTambahAnggota1 = new javax.swing.JButton();
        BKembali1 = new javax.swing.JButton();
        Nim = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        Prodi = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelMain.setPreferredSize(new java.awt.Dimension(940, 530));
        panelMain.setLayout(new java.awt.CardLayout());

        panelBuku.setBackground(new java.awt.Color(255, 255, 255));
        panelBuku.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuku.setPreferredSize(new java.awt.Dimension(940, 530));
        panelBuku.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelBuku.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 900, 260));

        SDaschboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SDaschboard.setForeground(new java.awt.Color(102, 102, 102));
        SDaschboard.setText("Master Data > Buku");
        panelBuku.add(SDaschboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Daftar Buku");
        panelBuku.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        LDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LBuku(2).png"))); // NOI18N
        panelBuku.add(LDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LBuku.png"))); // NOI18N
        panelBuku.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Buku");
        panelBuku.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        BTambahAnggota.setBackground(new java.awt.Color(51, 153, 255));
        BTambahAnggota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTambahAnggota.setForeground(new java.awt.Color(255, 255, 255));
        BTambahAnggota.setText("Tambah");
        BTambahAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTambahAnggotaMouseClicked(evt);
            }
        });
        BTambahAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahAnggotaActionPerformed(evt);
            }
        });
        panelBuku.add(BTambahAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 90, -1));

        BKembali.setBackground(new java.awt.Color(0, 204, 204));
        BKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BKembali.setForeground(new java.awt.Color(255, 255, 255));
        BKembali.setText("Kembali");
        BKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliActionPerformed(evt);
            }
        });
        panelBuku.add(BKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 90, -1));

        Search.setForeground(new java.awt.Color(153, 153, 153));
        Search.setText("Cari");
        panelBuku.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 220, -1));

        BHapusAnggota.setBackground(new java.awt.Color(255, 51, 51));
        BHapusAnggota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BHapusAnggota.setForeground(new java.awt.Color(255, 255, 255));
        BHapusAnggota.setText("Hapus");
        BHapusAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusAnggotaActionPerformed(evt);
            }
        });
        panelBuku.add(BHapusAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 90, -1));

        BHalamanAkhir.setText("Halaman Terakhir");
        panelBuku.add(BHalamanAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, 40));

        BHalamanAwal.setText("Halaman Pertama");
        panelBuku.add(BHalamanAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, 40));

        BNext.setText(">");
        BNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNextActionPerformed(evt);
            }
        });
        panelBuku.add(BNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 20, 40));

        BSebelum.setText("<");
        BSebelum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSebelumActionPerformed(evt);
            }
        });
        panelBuku.add(BSebelum, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 20, 40));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("1");
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelBuku.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 60, 40));

        panelMain.add(panelBuku, "card2");

        panelAddBuku.setBackground(new java.awt.Color(255, 255, 255));
        panelAddBuku.setPreferredSize(new java.awt.Dimension(940, 530));
        panelAddBuku.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SDaschboard1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SDaschboard1.setForeground(new java.awt.Color(102, 102, 102));
        SDaschboard1.setText("Master Data > Buku");
        panelAddBuku.add(SDaschboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        LDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LBuku(2).png"))); // NOI18N
        panelAddBuku.add(LDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LBuku.png"))); // NOI18N
        panelAddBuku.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Tambah Buku");
        panelAddBuku.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        BTambahAnggota1.setBackground(new java.awt.Color(51, 153, 255));
        BTambahAnggota1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTambahAnggota1.setForeground(new java.awt.Color(255, 255, 255));
        BTambahAnggota1.setText("Tambah");
        BTambahAnggota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahAnggota1ActionPerformed(evt);
            }
        });
        panelAddBuku.add(BTambahAnggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 467, 90, 40));

        BKembali1.setBackground(new java.awt.Color(0, 204, 204));
        BKembali1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BKembali1.setForeground(new java.awt.Color(255, 255, 255));
        BKembali1.setText("Kembali");
        BKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembali1ActionPerformed(evt);
            }
        });
        panelAddBuku.add(BKembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 467, 90, 40));

        Nim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nim.setText("ID Buku");
        panelAddBuku.add(Nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("ID Buku");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panelAddBuku.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 870, -1));

        Nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nama.setText("Nama Buku");
        panelAddBuku.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Nama Buku");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        panelAddBuku.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 870, -1));

        Prodi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Prodi.setText("Stok Buku");
        panelAddBuku.add(Prodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Stok Buku");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        panelAddBuku.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 870, -1));

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setText("Deskripsi Buku");
        panelAddBuku.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jTextField7.setText("Email");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        panelAddBuku.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 870, -1));

        panelMain.add(panelAddBuku, "card3");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTambahAnggotaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTambahAnggotaMouseClicked

    private void BTambahAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahAnggotaActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAddBuku);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_BTambahAnggotaActionPerformed

    private void BKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BKembaliActionPerformed

    private void BHapusAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BHapusAnggotaActionPerformed

    private void BNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNextActionPerformed
    private void BSebelumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSebelumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSebelumActionPerformed

    private void BTambahAnggota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahAnggota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTambahAnggota1ActionPerformed

    private void BKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembali1ActionPerformed
        panelMain.removeAll();
        panelMain.add(panelBuku);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_BKembali1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHalamanAkhir;
    private javax.swing.JButton BHalamanAwal;
    private javax.swing.JButton BHapusAnggota;
    private javax.swing.JButton BKembali;
    private javax.swing.JButton BKembali1;
    private javax.swing.JButton BNext;
    private javax.swing.JButton BSebelum;
    private javax.swing.JButton BTambahAnggota;
    private javax.swing.JButton BTambahAnggota1;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel LDashboard;
    private javax.swing.JLabel LDashboard1;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nim;
    private javax.swing.JLabel Prodi;
    private javax.swing.JLabel SDaschboard;
    private javax.swing.JLabel SDaschboard1;
    private javax.swing.JTextField Search;
    private javax.swing.JTable TbPeminjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel panelAddBuku;
    private javax.swing.JPanel panelBuku;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author zikri
 */
public class menuAdmin extends javax.swing.JPanel {

    /**
     * Creates new form menuAdmin
     */
    public menuAdmin() {
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
        CPeminjam = new javax.swing.JPanel();
        TPeminjaman = new javax.swing.JLabel();
        LPeminjam = new javax.swing.JLabel();
        JPeminjam = new javax.swing.JLabel();

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

        CPeminjam.setBackground(new java.awt.Color(0, 204, 204));

        TPeminjaman.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        TPeminjaman.setText("Admin");

        LPeminjam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        LPeminjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LAdmin(2).png"))); // NOI18N

        JPeminjam.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        JPeminjam.setText("000");

        javax.swing.GroupLayout CPeminjamLayout = new javax.swing.GroupLayout(CPeminjam);
        CPeminjam.setLayout(CPeminjamLayout);
        CPeminjamLayout.setHorizontalGroup(
            CPeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPeminjamLayout.createSequentialGroup()
                .addGroup(CPeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CPeminjamLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JPeminjam))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CPeminjamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TPeminjaman)))
                .addGap(31, 31, 31)
                .addComponent(LPeminjam)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        CPeminjamLayout.setVerticalGroup(
            CPeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPeminjamLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CPeminjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPeminjam)
                    .addComponent(LPeminjam))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(CPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPeminjam;
    private javax.swing.JLabel JPeminjam;
    private javax.swing.JLabel LDashboard;
    private javax.swing.JLabel LPeminjam;
    private javax.swing.JLabel SDaschboard;
    private javax.swing.JLabel TPeminjaman;
    private javax.swing.JTable TbPeminjam;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

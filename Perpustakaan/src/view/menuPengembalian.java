/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author zikri
 */
public class menuPengembalian extends javax.swing.JPanel {

    /**
     * Creates new form menuPengembalian
     */
    public menuPengembalian() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbPeminjam1 = new javax.swing.JTable();
        SDaschboard1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LDashboard1 = new javax.swing.JLabel();
        CPengembalian = new javax.swing.JPanel();
        TPengembalian = new javax.swing.JLabel();
        LPengembalian = new javax.swing.JLabel();
        JPengembalian = new javax.swing.JLabel();

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 900, 260));

        SDaschboard1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SDaschboard1.setForeground(new java.awt.Color(102, 102, 102));
        SDaschboard1.setText("Master Data > Pengembalian");
        jPanel3.add(SDaschboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Daftar Pengembalian");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        LDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lpengembalian(2).png"))); // NOI18N
        jPanel3.add(LDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        CPengembalian.setBackground(new java.awt.Color(0, 204, 204));

        TPengembalian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        TPengembalian.setText("Pengembalian");

        LPengembalian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        LPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book (3).png"))); // NOI18N

        JPengembalian.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        JPengembalian.setText("000");

        javax.swing.GroupLayout CPengembalianLayout = new javax.swing.GroupLayout(CPengembalian);
        CPengembalian.setLayout(CPengembalianLayout);
        CPengembalianLayout.setHorizontalGroup(
            CPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPengembalianLayout.createSequentialGroup()
                .addGroup(CPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CPengembalianLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JPengembalian))
                    .addGroup(CPengembalianLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TPengembalian)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LPengembalian)
                .addGap(37, 37, 37))
        );
        CPengembalianLayout.setVerticalGroup(
            CPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CPengembalianLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(CPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LPengembalian)
                    .addGroup(CPengembalianLayout.createSequentialGroup()
                        .addComponent(TPengembalian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPengembalian)))
                .addGap(14, 14, 14))
        );

        jPanel3.add(CPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPengembalian;
    private javax.swing.JLabel JPengembalian;
    private javax.swing.JLabel LDashboard1;
    private javax.swing.JLabel LPengembalian;
    private javax.swing.JLabel SDaschboard1;
    private javax.swing.JLabel TPengembalian;
    private javax.swing.JTable TbPeminjam1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
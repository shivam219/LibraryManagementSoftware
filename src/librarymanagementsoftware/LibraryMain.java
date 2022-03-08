package librarymanagementsoftware;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shivam
 */
public class LibraryMain extends javax.swing.JFrame {

    public LibraryMain() {
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblgetBookImg1 = new javax.swing.JLabel();
        jlblgetBookImg2 = new javax.swing.JLabel();
        jlblMakeSomeChanges1 = new javax.swing.JLabel();
        jlblReturnBookImg1 = new javax.swing.JLabel();
        jlblAddBookImg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Library Management Software");

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/infoicon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Return Book");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Get Book");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Make some changes");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Add Book");

        jlblgetBookImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/get1.png"))); // NOI18N
        jlblgetBookImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblgetBookImg1MouseClicked(evt);
            }
        });

        jlblgetBookImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/get2.png"))); // NOI18N

        jlblMakeSomeChanges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change1.png"))); // NOI18N
        jlblMakeSomeChanges1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMakeSomeChanges1MouseClicked(evt);
            }
        });

        jlblReturnBookImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/return1.png"))); // NOI18N
        jlblReturnBookImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblReturnBookImg1MouseClicked(evt);
            }
        });

        jlblAddBookImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add1.png"))); // NOI18N
        jlblAddBookImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblAddBookImg1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblgetBookImg1)
                            .addComponent(jlblgetBookImg2)
                            .addComponent(jlblAddBookImg1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jlblReturnBookImg1)
                                        .addGap(13, 13, 13))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jlblMakeSomeChanges1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(65, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblReturnBookImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblgetBookImg1)
                    .addComponent(jlblgetBookImg2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblAddBookImg1)
                    .addComponent(jlblMakeSomeChanges1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jlblgetBookImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblgetBookImg1MouseClicked
        new GetBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblgetBookImg1MouseClicked

    private void jlblReturnBookImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnBookImg1MouseClicked
        new ReturnBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblReturnBookImg1MouseClicked

    private void jlblAddBookImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddBookImg1MouseClicked
        new AddBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblAddBookImg1MouseClicked

    private void jlblMakeSomeChanges1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMakeSomeChanges1MouseClicked
        new MakeSomeChange().setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblMakeSomeChanges1MouseClicked

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
        }
        new LibraryMain().setVisible(true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str = "this is library system develop engineers for \nphysical library to use in real world \nIt capable handle request in rush time.\nAllow add, give, return, and manage\n all this done in via oracle database\n version-1.01.0 ";
        JOptionPane.showMessageDialog(this, str, "info", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlblAddBookImg1;
    private javax.swing.JLabel jlblMakeSomeChanges1;
    private javax.swing.JLabel jlblReturnBookImg1;
    private javax.swing.JLabel jlblgetBookImg1;
    private javax.swing.JLabel jlblgetBookImg2;
    // End of variables declaration//GEN-END:variables
}

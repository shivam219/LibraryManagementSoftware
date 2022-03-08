package librarymanagementsoftware;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shivam
 */
public class ReturnBook extends javax.swing.JFrame {

    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    Statement st = ConnectionProvider.getStatement();
    ResultSet rs = null;

    public ReturnBook() {
        initComponents();
        setLocationRelativeTo(null);
        setData();
    }

    public void setData() {
        try {
            ArrayList<String> al = new ArrayList<String>();
            rs = st.executeQuery("Select * from bookshelf");
            if (rs != null) {
                while (rs.next()) {
                    al.add(rs.getString(1));
                    map.put(rs.getString(1), rs.getInt(2));
                }
            }
            jcomboxBookList.removeAllItems();
            if (al.size() > 0) {
                for (String book : al) {
                    jcomboxBookList.addItem(book);
                }
            } else {
                jcomboxBookList.addItem("No Book available");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error with databse");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcomboxBookList = new javax.swing.JComboBox<>();
        btnReturnBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jtfInputBookQuanity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Return Book Section");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/returnBook.png"))); // NOI18N

        jcomboxBookList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books" }));
        jcomboxBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboxBookListActionPerformed(evt);
            }
        });

        btnReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addbookicon.png"))); // NOI18N
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Book Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(64, 64, 64)
                                .addComponent(btnReturnBook))
                            .addComponent(jtfInputBookQuanity, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfInputBookQuanity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReturnBook, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibrayMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
        if (!jtfInputBookQuanity.getText().isBlank()) {
            try {
                int jtfQty = Integer.parseInt(jtfInputBookQuanity.getText());
                String bname = jcomboxBookList.getSelectedItem().toString();
                int dbQty = map.get(bname);
                int totalQty = jtfQty + dbQty;
                st.executeUpdate("update bookshelf set quantity = " + totalQty + " where name = '" + bname + "'");
                map.put(bname, totalQty);//updating in map for again change
                JOptionPane.showMessageDialog(this, "Book successfully Return");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter digit Only");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error with database");
                ex.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please Enter data");
        }
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void jcomboxBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboxBookListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxBookListActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            new GetBook().setVisible(true);
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jcomboxBookList;
    private javax.swing.JTextField jtfInputBookQuanity;
    // End of variables declaration//GEN-END:variables
}

package librarymanagementsoftware;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shivam
 */
public class MakeSomeChange extends javax.swing.JFrame {

    Statement st = ConnectionProvider.getStatement();
    ResultSet rs = null;
    Boolean isUpateName = false;
    Boolean isUpateQuantity = false;
    Boolean isUpatePrice = false;
    ArrayList<String> al = new ArrayList<String>();

    public MakeSomeChange() {
        initComponents();
        setLocationRelativeTo(null);
        setData();
    }

    public void setData() {
        try {
            rs = st.executeQuery("Select * from bookshelf ");
            if (rs != null) {
                while (rs.next()) {
                    al.add(rs.getString(1));
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

    public void setIndexTolabel() {
        try {
            String fbook = jcomboxBookList.getItemAt(jcomboxBookList.getSelectedIndex());
            rs = st.executeQuery("select * from bookshelf where name = '" + fbook + "'");
            if (rs != null) {
                while (rs.next()) {
                    jlblBookName.setText(rs.getString(1));
                    jlblBookQuantity1.setText(rs.getInt(2) + "");
                    jlblBookPrice.setText(rs.getInt(3) + "");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error with database");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlblBookQuantity1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jlblBookPrice = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jtfInputBookName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtfInputBookQuantity = new javax.swing.JTextField();
        btnMakeSomeChanges = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jtfInputBookPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlblBookName = new javax.swing.JLabel();
        jcomboxBookList = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Make Some Change");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(">>");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Book total unit is");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(">>");

        jlblBookQuantity1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookQuantity1.setText("---------------");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Book price is");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText(">>");

        jlblBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookPrice.setText("---------------");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Fill new book data");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText(">>");

        jtfInputBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText(">>");

        jtfInputBookQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnMakeSomeChanges.setBackground(new java.awt.Color(0, 153, 102));
        btnMakeSomeChanges.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMakeSomeChanges.setForeground(new java.awt.Color(245, 250, 250));
        btnMakeSomeChanges.setText("Update Book");
        btnMakeSomeChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeSomeChangesActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText(">>");

        jtfInputBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Book Data");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Book name is");

        jlblBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookName.setText("---------------");

        jcomboxBookList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books" }));
        jcomboxBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboxBookListActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBack)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addGap(20, 20, 20)
                                            .addComponent(jlblBookQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMakeSomeChanges)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel32)
                                            .addGap(20, 20, 20)
                                            .addComponent(jlblBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInputBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInputBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel35)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jtfInputBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jtfInputBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jlblBookName))
                                .addGap(161, 161, 161))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jlblBookQuantity1))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel31)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jlblBookPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMakeSomeChanges)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void isValidInput() {
        if (!jtfInputBookName.getText().isBlank()) {
            if (!jtfInputBookName.getText().trim().equals(jlblBookName.getText().trim())) {
                isUpateName = true;
            } else {
                JOptionPane.showMessageDialog(this, "Book is same as old one");
            }
        }
        if (!jtfInputBookQuantity.getText().isBlank()) {
            try {
                if (jtfInputBookQuantity.getText().trim().equals(jlblBookQuantity1.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Book Price should be different");
                    return; //below try line will not execute
                }
                int price = Integer.parseInt(jtfInputBookQuantity.getText().trim());
                if (price < 1) {
                    JOptionPane.showMessageDialog(this, "please price More then 0");
                } else {
                    isUpatePrice = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter price In Digit");
            }
        }
        if (!jtfInputBookPrice.getText().isBlank()) {
            try {
                if (jtfInputBookPrice.getText().trim().equals(jlblBookPrice.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Book Price should be different");
                    return; //below try line will not execute
                }
                int price = Integer.parseInt(jtfInputBookPrice.getText().trim());
                if (price < 1) {
                    JOptionPane.showMessageDialog(this, "please price More then 0");
                } else {
                    isUpatePrice = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter price In Digit");
            }
        }
    }
    private void btnMakeSomeChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeSomeChangesActionPerformed
        isValidInput();
        boolean isUpdated = false;
        try {
            if (isUpateName) {
                boolean isBookalready = false;
                String obname = jlblBookName.getText().trim();
                String bname = jtfInputBookName.getText().trim();
                for (String alname : al) {
                    if (bname.equals(alname)) {
                        isBookalready = true;
                    }
                }
                if (!isBookalready) {
                    st.executeUpdate("update bookshelf set name= '" + bname + "'  where name = '" + obname + "'");
                    jlblBookName.setText(bname);
                    isUpdated = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Please Provide different name for book");
                }
            }
            if (isUpateQuantity) {
                int OQty = Integer.parseInt(jlblBookQuantity1.getText());
                int NQty = Integer.parseInt(jtfInputBookQuantity.getText().trim());
                st.executeUpdate("update bookshelf set quantity = " + NQty + "  where name = '" + OQty + "'");
                jlblBookQuantity1.setText(NQty + "");
                isUpdated = true;
            }
            if (isUpatePrice) {
                int Oprice = Integer.parseInt(jlblBookPrice.getText());
                int Nprice = Integer.parseInt(jtfInputBookPrice.getText().trim());
                st.executeUpdate("update bookshelf set name= '" + Nprice + "'  where name = '" + Oprice + "'");
                jlblBookPrice.setText(Nprice + "");
                isUpdated = true;
            }
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Book  Updated Successfully");
                setData();
            } else {
                JOptionPane.showMessageDialog(this, "Please Fill Data Properly !!!");
            }
            isUpateName = false;
            isUpateQuantity = false;
            isUpatePrice = false;
            jtfInputBookName.setText("");
            jtfInputBookQuantity.setText("");
            jtfInputBookPrice.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error with database");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMakeSomeChangesActionPerformed

    private void jcomboxBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboxBookListActionPerformed
        setIndexTolabel();//set Update item into label
    }//GEN-LAST:event_jcomboxBookListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibraryMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMakeSomeChanges;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JComboBox<String> jcomboxBookList;
    private javax.swing.JLabel jlblBookName;
    private javax.swing.JLabel jlblBookPrice;
    private javax.swing.JLabel jlblBookQuantity1;
    private javax.swing.JTextField jtfInputBookName;
    private javax.swing.JTextField jtfInputBookPrice;
    private javax.swing.JTextField jtfInputBookQuantity;
    // End of variables declaration//GEN-END:variables
}

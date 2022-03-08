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

    public MakeSomeChange() {
        initComponents();
    }

    public void setData() {
        try {
            ArrayList<String> al = new ArrayList<String>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Make Some Change");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(">>");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Product total unit is");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(">>");

        jlblBookQuantity1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookQuantity1.setText("---------------");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Product price is");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText(">>");

        jlblBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookPrice.setText("---------------");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Fill new producat data");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText(">>");

        jtfInputBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText(">>");

        jtfInputBookQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnMakeSomeChanges.setBackground(new java.awt.Color(0, 153, 102));
        btnMakeSomeChanges.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMakeSomeChanges.setForeground(new java.awt.Color(245, 250, 250));
        btnMakeSomeChanges.setText("Update product");
        btnMakeSomeChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeSomeChangesActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText(">>");

        jtfInputBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("product Data");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Product name is");

        jlblBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookName.setText("---------------");

        jcomboxBookList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books" }));

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
                                    .addComponent(jLabel11))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblBookQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMakeSomeChanges)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInputBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInputBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jcomboxBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jlblBookName))
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel35)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jtfInputBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel37))
                                    .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jtfInputBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(btnMakeSomeChanges)))
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Boolean isUpateName = false;
    Boolean isUpateQuantity = false;
    Boolean isUpatePrice = false;

    public void isValidInput() {
        if (!jtfInputBookName.getText().isBlank()) {
            if (!jtfInputBookName.getText().toLowerCase().equals(jlblBookName.getText().toLowerCase().trim())) {
                isUpateName = true;
            }
        }
        if (!jtfInputBookQuantity.getText().isBlank()) {
            try {
                if (jtfInputBookQuantity.getText().equals(jlblBookQuantity1.getText().trim())) {
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
                if (jtfInputBookPrice.getText().equals(jlblBookPrice.getText().trim())) {
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
                String obname = jlblBookName.getText();
                String bname = jtfInputBookName.getText().trim();
                st.executeUpdate("update Gvegetable set pname= '" + bname + "'  where name = '" + obname + "'");
                jlblBookName.setText(bname);
                isUpdated = true;
            }
            if (isUpateQuantity) {
                int obname = Integer.parseInt(jlblBookQuantity1.getText());
                int bname = Integer.parseInt(jtfInputBookQuantity.getText().trim());
                st.executeUpdate("update Gvegetable set pname= '" + bname + "'  where name = '" + obname + "'");
                jlblBookQuantity1.setText(bname + "");
                isUpdated = true;
            }
            if (isUpateName) {
                int obname = Integer.parseInt(jlblBookPrice.getText());
                int bname = Integer.parseInt(jtfInputBookPrice.getText().trim());
                st.executeUpdate("update Gvegetable set pname= '" + bname + "'  where name = '" + obname + "'");
                jlblBookPrice.setText(bname + "");
                isUpdated = true;
            }
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Book  Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Please Fill Data Properly !!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error with database");
        }
    }//GEN-LAST:event_btnMakeSomeChangesActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            new GetBook().setVisible(true);
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeSomeChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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

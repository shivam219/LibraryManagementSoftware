package librarymanagementsoftware;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shivam
 */
public class AddBook extends javax.swing.JFrame {

    private Statement st = ConnectionProvider.getStatement();

    public AddBook() {
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfBookName = new javax.swing.JTextField();
        jtfBookQuanity = new javax.swing.JTextField();
        jtfBookPrice = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Add Book Section");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addbook.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setText("Book Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setText("Book Price");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel5.setText("Book Quanity");

        jtfBookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfBookName.setText("Nagin");

        jtfBookQuanity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfBookQuanity.setText("50");

        jtfBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfBookPrice.setText("50");

        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addbookicon.png"))); // NOI18N
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
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
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jtfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookQuanity))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jtfBookPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddBook, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfBookQuanity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddBook)
                            .addComponent(btnBack))))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibraryMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean isValidInput() {
        if (jtfBookName.getText().isBlank()) {
            return false;
        }
        if (jtfBookQuanity.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfBookQuanity.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter Only digit in Quantity field");
                return false;
            }
        }
        if (jtfBookPrice.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfBookPrice.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter Only digit in Price field");
                return false;
            }
        }
        return true;
    }
    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        if (isValidInput()) {
            ResultSet rs = null;
            boolean isFounded = false;
            try {
                String bname = jtfBookName.getText().trim();
                int quantity = Integer.parseInt(jtfBookQuanity.getText());
                int price = Integer.parseInt(jtfBookPrice.getText());

                rs = st.executeQuery("select * from bookshelf where name = '" + bname + "'");
                if (rs != null) {
                    while (rs.next()) {
                        isFounded = true;
                    }
                }
                if (isFounded) {
                    JOptionPane.showMessageDialog(this, "Book allready exits in Database");
                } else {
                    String query = "INSERT INTO BOOKSHELF VALUES('" + bname + "', " + price + " , " + quantity + ")";
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Book Successfully Inserted");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error while Inserting data in bookshelf table");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Data in all fields Properly ");
        }
    }//GEN-LAST:event_btnAddBookActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            new GetBook().setVisible(true);
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jtfBookName;
    private javax.swing.JTextField jtfBookPrice;
    private javax.swing.JTextField jtfBookQuanity;
    // End of variables declaration//GEN-END:variables
}

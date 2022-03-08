package librarymanagementsoftware;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shivam
 */
public class GetBook extends javax.swing.JFrame {

    Statement st = ConnectionProvider.getStatement();
    ResultSet rs = null;
    Boolean isFounded = false;

    public GetBook() {
        initComponents();
        setLocationRelativeTo(null);
        showTime();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfInputSearchBook = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpanelBuySection = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblBookName = new javax.swing.JLabel();
        jlblBookQuantity = new javax.swing.JLabel();
        jlblBookPrice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfInputBookQuantity = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        jlblDate = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Get Book");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("Type to Search");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/getBookpersion.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Book Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Available Book");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Price");

        jlblBookName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookName.setText("Name");

        jlblBookQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookQuantity.setText("20");

        jlblBookPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblBookPrice.setText("20");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Book Quantity");

        jtfInputBookQuantity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtfInputBookQuantity.setText("500");

        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buy.png"))); // NOI18N
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelBuySectionLayout = new javax.swing.GroupLayout(jpanelBuySection);
        jpanelBuySection.setLayout(jpanelBuySectionLayout);
        jpanelBuySectionLayout.setHorizontalGroup(
            jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                        .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                        .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jlblBookName)))
                        .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                                        .addComponent(btnBuy)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                                        .addComponent(jlblBookQuantity)
                                        .addGap(38, 164, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBuySectionLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblBookPrice)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26))))))
        );
        jpanelBuySectionLayout.setVerticalGroup(
            jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBuySectionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblBookName)
                    .addComponent(jlblBookQuantity)
                    .addComponent(jlblBookPrice))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jpanelBuySectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInputBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jlblDate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlblDate.setText("Date");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jpanelBuySection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jlblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfInputSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jlblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfInputSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jpanelBuySection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showTime() {
        Runnable r = () -> {
            while (true) {
                LocalDateTime d = LocalDateTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH::mm::ss");
                jlblDate.setText(String.valueOf(dtf.format(d)));
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        jpanelBuySection.setVisible(isFounded);/*Set visible false when program run first*/
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LibrayMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!jtfInputSearchBook.getText().isEmpty()) {
            String bname = jtfInputSearchBook.getText().trim();
            try {
                isFounded = false;
                rs = st.executeQuery("select * from bookshelf where name = '" + bname + "'");
                if (rs != null) {
                    while (rs.next()) {
                        jlblBookName.setText(rs.getString(1));
                        jlblBookQuantity.setText(rs.getInt(2) + "");
                        jlblBookPrice.setText(rs.getInt(3) + "");
                        isFounded = true;
                    }
                }
                if (isFounded) {
                    jpanelBuySection.setVisible(isFounded);
                } else {
                    jpanelBuySection.setVisible(isFounded);
                    JOptionPane.showMessageDialog(this, "Book Not founded");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error with database");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Book Name");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        if (isFounded) {
            jpanelBuySection.setVisible(isFounded);
            if (!jtfInputBookQuantity.getText().isEmpty()) {
                try {
                    int Userquantity = Integer.parseInt(jtfInputBookQuantity.getText().trim());
                    int Labelquantity = Integer.parseInt(jlblBookQuantity.getText().trim());
                    if (Userquantity > Labelquantity) {
                        JOptionPane.showMessageDialog(this, "Insufficient Book Quantity");
                    } else if (Userquantity <= Labelquantity && Userquantity > 0) {
                        int Qty = Labelquantity - Userquantity;
                        String bname = jlblBookName.getText();
                        String query = "update bookshelf set quantity = " + Qty + " where name = '" + bname + "'";
                        st.executeUpdate(query);
                        jlblBookQuantity.setText(Qty + "");
                        JOptionPane.showMessageDialog(this, "Book Purchase successfully");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Please Quantity In Digit");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Book Quantity");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Book not founded");
            isFounded = false;
        }
    }//GEN-LAST:event_btnBuyActionPerformed
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            new GetBook().setVisible(true);
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlblBookName;
    private javax.swing.JLabel jlblBookPrice;
    private javax.swing.JLabel jlblBookQuantity;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JPanel jpanelBuySection;
    private javax.swing.JTextField jtfInputBookQuantity;
    private javax.swing.JTextField jtfInputSearchBook;
    // End of variables declaration//GEN-END:variables
}

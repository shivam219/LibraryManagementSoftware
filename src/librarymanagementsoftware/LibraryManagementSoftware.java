package librarymanagementsoftware;

import javax.swing.UIManager;
public class LibraryManagementSoftware {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
        }
        new LibrayMain().setVisible(true);
    }

}

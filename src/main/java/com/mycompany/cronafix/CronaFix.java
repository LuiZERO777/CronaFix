package com.mycompany.cronafix;

import javax.swing.SwingUtilities;
import ventana.Login;

public class CronaFix {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login login = new Login();
            login.setVisible(true);
        });
    }
}
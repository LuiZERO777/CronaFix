package util;

import javax.swing.JFrame;

public class NavegacionUtil {

    public static void abrir(
            JFrame actual,
            JFrame siguiente) {

        siguiente.setVisible(true);
        actual.dispose();
    }
}
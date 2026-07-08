package util;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import ventana.Login;
import java.awt.Frame;
import service.Sesion;

public class SesionManager {

    private static Timer timer;

    private static final int TIEMPO_INACTIVIDAD =
            20 * 60 * 1000; // 20 minutos

    public static void iniciar(JFrame ventana) {

        if (timer != null) {
            timer.stop();
        }

        timer = new Timer(
                TIEMPO_INACTIVIDAD,
                e -> {

                    JOptionPane.showMessageDialog(
        null,
        "La sesión ha expirado por seguridad.\n"
        + "Inicie sesión nuevamente.");

Sesion.cerrar();

for (Frame frame : JFrame.getFrames()) {
    frame.dispose();
}

new Login().setVisible(true);
                });

        timer.setRepeats(false);
        timer.start();

        Toolkit.getDefaultToolkit()
                .addAWTEventListener(
                        e -> reiniciar(),
                        AWTEvent.MOUSE_EVENT_MASK
                        | AWTEvent.KEY_EVENT_MASK);
    }

    public static void reiniciar() {

        if (timer != null) {
            timer.restart();
        }
    }
}
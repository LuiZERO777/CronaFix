package util;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

public class ImagenUtil {

    public static void ponerImagen(
            JLabel label,
            String ruta,
            int ancho,
            int alto) {

        ImageIcon icono =
                new ImageIcon(
                        ImagenUtil.class.getResource(ruta));

        Image imagen =
                icono.getImage().getScaledInstance(
                        ancho,
                        alto,
                        Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(imagen));
    }
}
package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modelo.ModificarCita;
import service.ModificarService;
import ventana.Modificar;

public class ModificarController {

    private final Modificar vista;
    private final ModificarService service;

    public ModificarController(Modificar vista) {

        this.vista = vista;
        this.service = new ModificarService();
    }

    public void guardarCambios() {

        try {

            ModificarCita cita = new ModificarCita();

            cita.setCodigoConsulta(
                    vista.getCodigo());

            cita.setFecha(
                    vista.getFechaSeleccionada());

            cita.setHora(
                    LocalTime.parse(
                            vista.getHora()));

            cita.setIdTipo(
                    vista.getTipoSeleccionado());

            if (service.modificar(cita)) {

                JOptionPane.showMessageDialog(
                        vista,
                        "Cita modificada");

            } else {

                JOptionPane.showMessageDialog(
                        vista,
                        "No se pudo modificar");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Datos incorrectos");
        }

    }

}
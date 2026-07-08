package tablemodel;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cita;

public class CitaTableModel {

    public static void cargar(
            DefaultTableModel modelo,
            ArrayList<Cita> lista) {

        modelo.setRowCount(0);

        for (Cita cita : lista) {

            modelo.addRow(
                    new Object[]{
                        cita.getFecha(),
                        cita.getHora(),
                        cita.getNombrePaciente(),
                        cita.getEstado(),
                        cita.getTelefono(),
                        cita.getCodigoConsulta()
                    }
            );
        }
    }
}
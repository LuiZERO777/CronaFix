package tablemodel;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.TipoCita;

public class TiposTabla{
    public static void cargar(DefaultTableModel modelo,ArrayList<TipoCita> lista){
        modelo.setRowCount(0);
        for(TipoCita t:lista){
            modelo.addRow(new Object[]{
                t.getIdTipo(),
                t.getNombre(),
                t.getDescripcion(),
                t.isEstado()?"Activo":"Inactivo"
            });
        }
    }
}
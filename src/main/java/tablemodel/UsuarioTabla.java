package tablemodel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class UsuarioTabla{
    public static void cargar(DefaultTableModel modelo,ArrayList<Usuario> lista){
        modelo.setRowCount(0);
        for(Usuario u:lista){
            modelo.addRow(new Object[]{
                u.getId(),
                u.getNombre(),
                u.getUsuario(),
                u.getRol()
            });
        }
    }
}
